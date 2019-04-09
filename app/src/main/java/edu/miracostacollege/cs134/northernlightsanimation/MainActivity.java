package edu.miracostacollege.cs134.northernlightsanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView lightsImageView;
    // Used for frame animations
    private AnimationDrawable frameAnim;

    // Used for tweened animations
    private Animation rotateAnim;
    private Animation shakeAnim;
    private Animation customAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lightsImageView = findViewById(R.id.lightsImageView);
    }

    // Method for frame animation button
    public void toggleFrameAnim(View v){
        if(frameAnim == null){
            lightsImageView.setBackgroundResource(R.drawable.frame_anim);
            frameAnim = (AnimationDrawable) lightsImageView.getBackground();
        }

        // If animation is running, stop it
        if(frameAnim.isRunning()){
            frameAnim.stop();
        } else{
            frameAnim.start();
        }
        // Else, start it
    }

    public void toggleRotateAnim(View v){
        rotateAnim = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
        lightsImageView.startAnimation(rotateAnim);
    }

    public void toggleShakeAnim(View v){
        shakeAnim = AnimationUtils.loadAnimation(this, R.anim.shake_anim);
        lightsImageView.startAnimation(shakeAnim);
    }
}
