package de.iusemybrain.woistwas;

import java.io.IOException;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class DBAdapter {
	
	// Globale Variablen deklarieren
	protected static final String TAG = "DataAdapter";
	private final Context mContext;
	private SQLiteDatabase mDb;
	private DataBaseHelper mDbHelper;

	// Konstruktor
	public DBAdapter(Context context) {
		this.mContext = context;
		mDbHelper = new DataBaseHelper(mContext);
	}

	// Datenbank erstellen
	public DBAdapter createDatabase() throws SQLException {
		try {
			mDbHelper.createDataBase();
		} catch (IOException mIOException) {
			Log.e(TAG, mIOException.toString() + "  UnableToCreateDatabase");
			throw new Error("UnableToCreateDatabase");
		}
		return this;
	}

	// Datenbank öffnen
	public DBAdapter open() throws SQLException {
		try {
			mDbHelper.openDataBase();
			mDbHelper.close();
			mDb = mDbHelper.getReadableDatabase();
		} catch (SQLException mSQLException) {
			Log.e(TAG, "open >>" + mSQLException.toString());
			throw mSQLException;
		}
		return this;
	}

	// Datenbank schlie�en
	public void close() {
		mDbHelper.close();
	}

	// Alle St�dte anhand ihrer Postleitzahl abfragen
	public Cursor getPLZ(String plz) {
		try {
			String sql = "SELECT plz, name, kreis, bl_kurz FROM staedte WHERE plz LIKE '%"
					+ plz.trim() + "%' ORDER BY name";
			Cursor mCur = mDb.rawQuery(sql, null);
			if (mCur != null) {
				mCur.moveToNext();
			}
			return mCur;
		} catch (SQLException mSQLException) {
			Log.e(TAG, "getPLZ >>" + mSQLException.toString());
			throw mSQLException;
		}
	}

	// Alle St�dte anhand des eingegebenen Namens abfragen
	public Cursor getCity(String stadt) {
		try {
			String sql = "SELECT plz, name, kreis, bl_kurz FROM staedte WHERE name LIKE '%"
					+ stadt.trim() + "%' ORDER BY name";
			Cursor mCur = mDb.rawQuery(sql, null);
			if (mCur != null) {
				mCur.moveToNext();
			}
			return mCur;
		} catch (SQLException mSQLException) {
			Log.e(TAG, "getCity >>" + mSQLException.toString());
			throw mSQLException;
		}
	}

	// Alle Städte in der Nähe abfragen
	public Cursor getLoc(Double latitude, Double longitude) {
		try {
			String sql = "SELECT plz, name, kreis, bl_kurz FROM staedte WHERE breitengrad BETWEEN '"
					+ (latitude - 0.09)
					+ "' AND '"
					+ +(latitude + 0.09)
					+ "' AND längengrad BETWEEN '"
					+ (longitude - 0.09)
					+ "' AND '" + (longitude + 0.09) + "' ORDER BY name";
			Cursor mCur = mDb.rawQuery(sql, null);
			if (mCur != null) {
				mCur.moveToNext();
			}
			return mCur;
		} catch (SQLException mSQLException) {
			Log.e(TAG, "getLoc >>" + mSQLException.toString());
			throw mSQLException;
		}
	}
}
