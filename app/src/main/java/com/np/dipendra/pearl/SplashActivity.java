package com.np.dipendra.pearl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private Animation animation, animationText;
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageView=findViewById(R.id.image_splash);
        textView=findViewById(R.id.textSplash);
        //for fading of splash image
        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        //for moving text
        animationText=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_left);
        imageView.startAnimation(animation);
        textView.startAnimation(animationText);
        Thread thread=new Thread(){
            public  void run(){
                try{
                    Thread.sleep(3000);
                }catch (Exception e){
                }finally {
                    Intent intent=new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
    thread.start();
    }
}
