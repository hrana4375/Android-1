package com.example.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toast toast = new Toast(getApplicationContext());

        toast = Toast.makeText(Main2Activity.this,"Hello",Toast.LENGTH_SHORT);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);

        toast.show();


    }
}
