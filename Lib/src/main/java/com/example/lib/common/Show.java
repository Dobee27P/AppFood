package com.example.lib.common;

import android.content.Context;
import android.widget.Toast;

public class Show {
    public static void Notify(Context context, String notify) {
        Toast.makeText(context, notify, Toast.LENGTH_SHORT).show();
    }
}