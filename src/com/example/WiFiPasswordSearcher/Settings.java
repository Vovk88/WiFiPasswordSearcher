package com.example.WiFiPasswordSearcher;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by �� on 19.11.2015.
 */
public class Settings
{
    public static final String APP_PREFERENCES = "settings";
    public static final String APP_SERVER_LOGIN = "SERVER_LOGIN";
    public static final String APP_SERVER_PASSWORD = "SERVER_PASSWORD";
    public static final String APP_SERVER_URI = "SERVER_URI";
    public static final String APP_CHECK_UPDATES = "CHECK_UPDATES";
    public static final String API_READ_KEY = "READ_KEY";
    public static final String API_WRITE_KEY = "WRITE_KEY";
    public static final String API_KEYS_VALID = "KEYS_VALID";
    public static final String USER_REGDATE = "USER_REGDATE";
    public static final String USER_GROUP = "USER_GROUP";
    public static final String USER_INVCOUNT = "USER_INVCOUNT";
    public static final String USER_INVITER = "USER_INVITER";
    public static final String USER_LASTUPDATE = "USER_LASTUPDATE";


    public SharedPreferences AppSettings = null;
    public SharedPreferences.Editor Editor = null;

    private Context context;

    public Settings(Context _context)
    {
        context = _context;
        Init();
    }

    private void Init()
    {
        AppSettings = context.getSharedPreferences(APP_PREFERENCES, context.MODE_PRIVATE);
        Editor = AppSettings.edit();
    }

    public void Reload()
    {
        Init();
    }
}
