package io.github.chncs23.requiredfieldlabel.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import io.github.chncs23.requiredfieldlabel.RequiredFieldLabel;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RequiredFieldLabel requiredField = (RequiredFieldLabel) findViewById(R.id.req_field);


        CheckBox showHideStar = (CheckBox) findViewById(R.id.checkBox);
        showHideStar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    requiredField.showRequiredField();
                }else{
                    requiredField.hideRequiredField();
                }
            }
        });
    }
}
