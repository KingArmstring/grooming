package com.manise.grooming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import me.wangyuwei.particleview.ParticleView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hiding the toolBar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_splash);


        //creating an instance of the particleView I integrated through build.gradle
        ParticleView pv = findViewById(R.id.pv_id);

        //adding animation listener to particlesView, this view is being customized in the xml layout file, setting texts, animation duration, ...etc
        pv.setOnParticleAnimListener(new ParticleView.ParticleAnimListener() {
            @Override
            public void onAnimationEnd() {
                //upon animation-end, we move to the HomeActivity where the real work happens should happen.
                startActivity(new Intent(
                    SplashActivity.this,
                    HomeActivity.class
                ));
                //finishing this activity
                finish();
            }
        });

        //starting animation
        pv.startAnim();
    }
}