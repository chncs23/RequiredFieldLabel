package io.github.chncs23.requiredfieldlabel.sample;

import android.app.Application;
import android.graphics.Color;
import io.github.chncs23.requiredfieldlabel.RequiredFieldLabel;

public class BaseApplication extends Application {
    @Override public void onCreate() {
        super.onCreate();
        RequiredFieldLabel.setStarColor(Color.parseColor("#2196F3"));
    }
}
