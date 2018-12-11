package com.example.niko.findthewolf;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.*;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private ImageView oriImageView;
    private ImageView oriImageView2;
    private ImageView oriImageView3;
    private ImageView oriImageView4;
    private ImageView oriImageView6;
    private ImageView oriImageView7;
    private ImageView oriImageView8;
    private ImageView oriImageView9;
    private Button again;
    private int round = 0;
    private int[] identity={
            R.drawable.pinmin,
            R.drawable.guard,
            R.drawable.witch,
            R.drawable.langren,
            R.drawable.cupid,
            R.drawable.prophet,
            R.drawable.silverwolf,
            R.drawable.hunter,
    };

    private View.OnClickListener imgClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oriImageView=(ImageView)findViewById(R.id.ImageView);
        oriImageView2=(ImageView)findViewById(R.id.ImageView2);
        oriImageView3=(ImageView)findViewById(R.id.ImageView3);
        oriImageView4=(ImageView)findViewById(R.id.ImageView4);
        oriImageView6=(ImageView)findViewById(R.id.ImageView6);
        oriImageView7=(ImageView)findViewById(R.id.ImageView7);
        oriImageView8=(ImageView)findViewById(R.id.ImageView8);
        oriImageView9=(ImageView)findViewById(R.id.ImageView9);

        again = (Button) findViewById(R.id.Again);
        Randomk();
        imgClick = new View.OnClickListener() {
            @Override
            public void onClick(View nk) {
                if(round == 0) {
                    switch (nk.getId()) {
                        case R.id.ImageView:
                            SetImage(0,oriImageView);
                            break;
                        case R.id.ImageView2:
                            SetImage(1,oriImageView2);
                            break;
                        case R.id.ImageView3:
                            SetImage(2,oriImageView3);
                            break;
                        case R.id.ImageView4:
                            SetImage(3,oriImageView4);
                            break;
                        case R.id.ImageView6:
                            SetImage(4,oriImageView6);
                            break;
                        case R.id.ImageView7:
                            SetImage(5,oriImageView7);
                            break;
                        case R.id.ImageView8:
                            SetImage(6,oriImageView8);
                            break;
                        case R.id.ImageView9:
                            SetImage(7,oriImageView9);
                            break;
                        default:
                            break;
                    }
                }
            }
        };

        oriImageView.setOnClickListener(imgClick);
        oriImageView2.setOnClickListener(imgClick);
        oriImageView3.setOnClickListener(imgClick);
        oriImageView4.setOnClickListener(imgClick);
        oriImageView6.setOnClickListener(imgClick);
        oriImageView7.setOnClickListener(imgClick);
        oriImageView8.setOnClickListener(imgClick);
        oriImageView9.setOnClickListener(imgClick);

        again.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View nk) {
                if(round == 1)
                {
                    oriImageView.setImageResource(R.drawable.cunmin);
                    oriImageView2.setImageResource(R.drawable.cunmin2);
                    oriImageView3.setImageResource(R.drawable.cunmin3);
                    oriImageView4.setImageResource(R.drawable.cunmin4);
                    oriImageView6.setImageResource(R.drawable.cunmin);
                    oriImageView7.setImageResource(R.drawable.cunmin2);
                    oriImageView8.setImageResource(R.drawable.cunmin3);
                    oriImageView9.setImageResource(R.drawable.cunmin4);
                    oriImageView.setAlpha(255);
                    oriImageView2.setAlpha(255);
                    oriImageView3.setAlpha(255);
                    oriImageView4.setAlpha(255);
                    oriImageView6.setAlpha(255);
                    oriImageView7.setAlpha(255);
                    oriImageView8.setAlpha(255);
                    oriImageView9.setAlpha(255);
                    Randomk();
                    round--;
                }
            }
        });
    }

    private void SetImage(int temp,ImageView select)
    {
        oriImageView.setImageResource(identity[0]);
        oriImageView2.setImageResource(identity[1]);
        oriImageView3.setImageResource(identity[2]);
        oriImageView4.setImageResource(identity[3]);
        oriImageView6.setImageResource(identity[4]);
        oriImageView7.setImageResource(identity[5]);
        oriImageView8.setImageResource(identity[6]);
        oriImageView9.setImageResource(identity[7]);
        oriImageView.setAlpha(150);
        oriImageView2.setAlpha(150);
        oriImageView3.setAlpha(150);
        oriImageView4.setAlpha(150);
        oriImageView6.setAlpha(150);
        oriImageView7.setAlpha(150);
        oriImageView8.setAlpha(150);
        oriImageView9.setAlpha(150);
        select.setAlpha(255);
        if(identity[temp]==R.drawable.langren) {
            Toast.makeText(MainActivity.this, "Yes! You find him!", Toast.LENGTH_SHORT)
                    .show();
        }
        else if(identity[temp]==R.drawable.silverwolf) {
            Toast.makeText(MainActivity.this, "Wow! You find the Wolf king!", Toast.LENGTH_SHORT)
                    .show();
        }
        else if(identity[temp]==R.drawable.cupid) {
            Toast.makeText(MainActivity.this, "You miss the wolf, but find love!", Toast.LENGTH_SHORT)
                    .show();
        }
        else if(identity[temp]==R.drawable.guard) {
            Toast.makeText(MainActivity.this, "Although you missed, you can still have peace night", Toast.LENGTH_SHORT)
                    .show();
        }
        else if(identity[temp]==R.drawable.witch) {
            Toast.makeText(MainActivity.this, "You accidentally find witch! Dice to live or death!", Toast.LENGTH_SHORT)
                    .show();
        }
        else if(identity[temp]==R.drawable.prophet) {
            Toast.makeText(MainActivity.this, "You missed, but I can tell you wolf is among villagers", Toast.LENGTH_SHORT)
                    .show();
        }
        else if(identity[temp]==R.drawable.hunter) {
            Toast.makeText(MainActivity.this, "Huh! Let's go to hunt them down", Toast.LENGTH_SHORT)
                    .show();
        }
        else {
            Toast.makeText(MainActivity.this, "Sorry, You miss him", Toast.LENGTH_SHORT)
                    .show();
        }
        round++;
    }



    private void Randomk() {
        for (int i = 0; i < identity.length; i++) {
            int temp = identity[i];
            int k = (int) (Math.random() * 7);
            identity[i] = identity[k];
            identity[k] = temp;
        }
    }

}
