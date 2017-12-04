package com.codeteenager.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codeteenager.mvvmdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User user;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("姜帅杰", "123456", "");
        activityMainBinding.setUser(user);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                user.setName("李坤");
                user.setPassword("654321");
            }
        }, 2000);
    }
}
