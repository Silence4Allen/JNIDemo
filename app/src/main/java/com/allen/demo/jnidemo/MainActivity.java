package com.allen.demo.jnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_default:
                tv.setText("Default text");
                break;
            case R.id.btn_jni:
                tv.setText(JNIMethod.sayHello());
                break;
        }

    }
}
