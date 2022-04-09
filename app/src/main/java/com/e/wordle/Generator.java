package com.e.wordle;

import android.content.Context;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Generator
{
    public String[] words = new String[5757];

    public Generator(Context mContext)
    {
        String str = "";
        StringBuffer buf = new StringBuffer();

        try {
            InputStream is = mContext.getAssets().open(mContext.getString(R.string.filename));
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            int i=0;
            if (is!=null) {
                while ((str = reader.readLine()) != null) {
                    words[i]=str;
                    i++;
                }
            }
            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
