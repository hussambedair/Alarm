package com.example.android.alarm;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

public class TaskAlarmBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        String title = intent.getStringExtra("title");
        String desc = intent.getStringExtra("desc");

        showNotification(title, desc, context);

    }

    public void showNotification (String title, String desc, Context context) {

        NotificationManager notificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        NotificationCompat.Builder builder
                = new NotificationCompat.Builder(context,"ToDoApp")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentText(desc)
                .setContentTitle(title);

        notificationManager.notify(1, builder.build());







    }


}
