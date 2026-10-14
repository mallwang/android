package com.iusemybrain.apps.myannoonline;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private ListView mDrawerList;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private String mActivityTitle;
    private String mTitle;
    private boolean doubleBackToExitPressedOnce;
    ChangeLog cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this));
        setContentView(R.layout.activity_main);

        mDrawerList = (ListView)findViewById(R.id.navList);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mActivityTitle = getTitle().toString();
        mTitle = mActivityTitle;

        // Bei erneuten Öffnen der App ursprüngliche View deaktivieren, da ansonsten Überlagerung
        if(savedInstanceState != null){
            // Die Start-TextView and ImageView entfernen
            TextView tv_start = (TextView) findViewById(R.id.tv_start);
            ImageView iv_start = (ImageView) findViewById(R.id.iv_start);
            tv_start.setVisibility(View.INVISIBLE);
            iv_start.setVisibility(View.INVISIBLE);
            // Titel setzen
            mTitle = savedInstanceState.getString("Titel", "MyAnnoOnline");
            getSupportActionBar().setTitle(mTitle);
        }

        addDrawerItems();
        setupDrawer();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        // Neuen Changelog erstellen
        cl = new ChangeLog(this);
        // ChangeLog anzeigen
        if (cl.firstRun())
            cl.getLogDialog().show();
    }

    // Hinzufügen aller Navigationsitems
    private void addDrawerItems() {
        // Array mit Navigationsitems abfragen
        final String[] navigationItems = getResources().getStringArray(R.array.navigation);
        // Neue DrawerList erstellen mit Navigationsitems
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, navigationItems);
        mDrawerList.setAdapter(mAdapter);
        // Onclicklistener für die ListView
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment objFragment = null;
                mTitle = navigationItems[position];
                switch (position) {
                    // Verbrauch
                    case 0:
                        objFragment = new FragVerbrauch();
                        break;
                    // Produktionsketten
                    case 1:
                        objFragment = new FragProduktionsketten();
                        break;
                    // Produktionskosten
                    case 2:
                        objFragment = new FragProduktionskosten();
                        break;
                    // Gebäude
                    case 3:
                        objFragment = new FragGebaeude();
                        break;
                    // Schiffe
                    case 4:
                        objFragment = new FragSchiffe();
                        break;
                    // Inseln
                    case 5:
                        objFragment = new FragInseln();
                        break;
                    // Monumente
                    case 6:
                        objFragment = new FragMonumente();
                        break;
                    // Verbrauchstabelle
                    case 7:
                        objFragment = new FragVerbrauchstabelle();
                        break;
                    // Impressum
                    case 8:
                        objFragment = new FragImpressum();
                        break;
                    // Beenden
                    case 9:
                        System.exit(0);
                        break;
                }

                // Die Start-TextView and ImageView entfernen
                TextView tv_start = (TextView) findViewById(R.id.tv_start);
                ImageView iv_start = (ImageView) findViewById(R.id.iv_start);
                tv_start.setVisibility(View.INVISIBLE);
                iv_start.setVisibility(View.INVISIBLE);

                // Inhalt des Fragments aktualisieren bzw. ersetzen
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.container2, objFragment)
                        .commit();

                // NavigationDrawer schließen
                mDrawerLayout.closeDrawer(findViewById(R.id.navList));
            }
        });
    }

    // Anzeigen einer Nachricht bei Druck auf ZURÜCK
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, R.string.str_zurueck_button, Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

    private void setupDrawer() {
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.drawer_open, R.string.drawer_close) {

            // Öffnen des NavigationDrawers
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle(mActivityTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            // Schließen des NavigationDrawers
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getSupportActionBar().setTitle(mTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };

        mDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    
    public void onSaveInstanceState(Bundle savedInstanceState){
    	// Titel speichern
    	savedInstanceState.putString("Titel", mTitle);
    	super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // ID des gelklickten MenuItems abfragen
        int id = item.getItemId();

        // Tip auf MyAnnoOnline Logo
        if (id == R.id.myannoonline_logo) {
            // Changelog anzeigen
            cl.getFullLogDialog().show();
            //Toast.makeText(this, getString(R.string.str_danke_nutzung), Toast.LENGTH_SHORT).show();
            return true;
        }
        // Optionsmenü öffnen bei klick auf Menü-Icon
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
