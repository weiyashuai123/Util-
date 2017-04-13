package com.tyustwys.meet7.base;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * activity 基类
 * Created by weiyashuai on 2017/3/16.
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("data", "onCreate: " + getLocalClassName());
        //强制竖屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void shortToast(String message) {

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void longToast(String message) {

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
    public void startMyActivity(Class cla){
        Intent intent = new Intent(this,cla);
        startActivity(intent);
    }
}
