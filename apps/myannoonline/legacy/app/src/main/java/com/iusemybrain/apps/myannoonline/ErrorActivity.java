package com.iusemybrain.apps.myannoonline;

import com.iusemybrain.apps.myannoonline.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class ErrorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_error);

        Toast.makeText(getApplicationContext(), getString(R.string.str_errorToast), Toast.LENGTH_SHORT).show();

        // Elemente erhalten
        TextView tv_error = (TextView) findViewById(R.id.tv_error);
        Button btn_endError = (Button) findViewById(R.id.btn_endError);
        Button btn_sendError = (Button) findViewById(R.id.btn_sendError);

        String errorText = getIntent().getStringExtra("error");
        final String emailText = getString(R.string.str_errorHead) + "\n\n" + errorText + getString(R.string.str_errorFoot);

        // Errornachricht erhalten
        tv_error.setText(errorText);

        /* OnClickListener */
        // Button "Beenden"
        btn_endError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
        // Button "Senden"
        btn_sendError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                String[] recipients = new String[]{"feedback.myannoonline@i-use-my-brain.com"};
                emailIntent.putExtra(Intent.EXTRA_EMAIL, recipients);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.str_errorSubject));
                emailIntent.putExtra(Intent.EXTRA_TEXT, emailText);
                emailIntent.setType("text/plain");
                startActivity(Intent.createChooser(emailIntent, getString(R.string.str_sendError)));
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Do nothing
    }
}