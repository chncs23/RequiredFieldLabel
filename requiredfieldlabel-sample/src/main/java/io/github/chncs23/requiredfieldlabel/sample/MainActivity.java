package io.github.chncs23.requiredfieldlabel.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import io.github.chncs23.requiredfieldlabel.RequiredFieldLabel;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RequiredFieldLabel requiredField = (RequiredFieldLabel) findViewById(R.id.req_field);
        requiredField.hideRequiredField();
        requiredField.showRequiredField();
    }
}
