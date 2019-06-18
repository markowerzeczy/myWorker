package dookola.studio.workertest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;
import androidx.work.WorkerParameters;

    public class MyWorker extends Worker {
        public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
            super(context, workerParams);
        }

        @NonNull
        @Override
        public Result doWork() {
            new MyNotif(getApplicationContext(), "Your worker", "the job is done...");
            return null;
        }
    }
