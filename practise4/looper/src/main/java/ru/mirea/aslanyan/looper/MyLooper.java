package ru.mirea.aslanyan.looper;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MyLooper extends Thread {
    private int number = 0;
    Handler handler;

    @Override
    public void run(){
        Log.d("MyLooper", "run");
        Looper.prepare();
        handler = new Handler(){
            @Override
            public void publish(LogRecord logRecord) {

            }

            @Override
            public void flush() {

            }

            @Override
            public void close() throws SecurityException {

            }

            public void handleMessage(Message msg){
                Log.d("MyLooper", number + ":"+ msg.getData().getString("KEY"));
                number++;
            }
        };
        Looper.loop();
    }
}
