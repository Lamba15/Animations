package com.lamba.animations;

import android.animation.ObjectAnimator;
import android.app.ActivityOptions;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button,button2,button3,button4;
    GridLayout gridLayout;
    DisplayMetrics metrics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        gridLayout = (GridLayout) findViewById(R.id.grid);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button1);
        button3 = (Button) findViewById(R.id.button2);
        button4 = (Button) findViewById(R.id.button3);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                DisplayMetrics metrics = getApplicationContext().getResources().getDisplayMetrics();
//
//                button.animate().translationY(-metrics.heightPixels).setDuration(2000);
//                button2.animate().translationY(-metrics.heightPixels).setDuration(2000);
//                button3.animate().translationY(metrics.heightPixels).setDuration(2000);
//                button4.animate().translationY(metrics.heightPixels).setDuration(2000).withEndAction(new Runnable() {
//                    @Override
//                    public void run() {
//                        gridLayout.animate().alpha(1f);
//                    }
//                });

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    Explode explode = new Explode();
                }
                else {

                }

                Intent myIntent = new Intent(getApplicationContext(), Main2Activity.class);
                ActivityOptions options =
                        ActivityOptions.makeCustomAnimation(getBaseContext(), R.anim.fade_in, R.anim.fade_out);
                getBaseContext().startActivity(myIntent, options.toBundle());
                startActivity(myIntent,options.toBundle());


            }
        });






    }
}
