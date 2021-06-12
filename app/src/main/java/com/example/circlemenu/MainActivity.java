package com.example.circlemenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.ramotion.circlemenu.CircleMenuView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CircleMenuView menu= findViewById(R.id.circle);
        menu.setEventListener(new CircleMenuView.EventListener(){

            @Override
            public void onMenuOpenAnimationStart(@NonNull CircleMenuView view) {
                Log.d("D","onMenuOpenAnimationStart");
            }

            @Override
            public void onMenuOpenAnimationEnd(@NonNull CircleMenuView view) {
                Log.d("D","onMenuOpenAnimationEnd");

            }

            @Override
            public void onMenuCloseAnimationStart(@NonNull CircleMenuView view) {
                Log.d("D","onMenuCloseAnimationStart");

            }

            @Override
            public void onMenuCloseAnimationEnd(@NonNull CircleMenuView view) {
                Log.d("D","onMenuCloseAnimationEnd");

            }

            @Override
            public void onButtonClickAnimationStart(@NonNull CircleMenuView view, int index) {
                Log.d("D","onButtonClickAnimationStart|index: "+index);
            }

            @Override
            public void onButtonClickAnimationEnd(@NonNull CircleMenuView view, int index) {
                Log.d("D","onButtonClickAnimationEnd|index: "+index);
            }

            @Override
            public boolean onButtonLongClick(@NonNull CircleMenuView view, int buttonIndex) {
                Log.d("D","onButtonLongClick|index: "+buttonIndex);
                return true;
            }
            @Override
            public void onButtonLongClickAnimationStart(@NonNull CircleMenuView view, int buttonIndex) {
                Log.d("D","onButtonLongClickAnimationStart|index: "+buttonIndex);
            }

            @Override
            public void onButtonLongClickAnimationEnd(@NonNull CircleMenuView view, int buttonIndex) {
                Log.d("D","onButtonLongClickAnimationEnd|index: "+buttonIndex);
            }
        });
    }
}