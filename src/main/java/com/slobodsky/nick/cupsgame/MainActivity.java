package com.slobodsky.nick.cupsgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView cardLeft, cardMiddle, cardRight;

    List<Integer> cards;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        cardLeft = findViewById(R.id.left);

        cardMiddle = findViewById(R.id.middle);

        cardRight = findViewById(R.id.right);

        button = findViewById(R.id.button);

        cards = new ArrayList<>();

        cards.add(107);

        cards.add(307);

        cards.add(407);

        Collections.shuffle(cards);

        cardLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cards.get(0) == 107)
                {
                    cardLeft.setImageResource(R.drawable.ace);

                    Toast.makeText(MainActivity.this, "Salute !", Toast.LENGTH_SHORT)
                            .show();

                }
                else if (cards.get(0) == 307)
                {
                    cardLeft.setImageResource(R.drawable.five);
                }
                else if (cards.get(0) == 407)
                {
                    cardLeft.setImageResource(R.drawable.king);
                }

                if (cards.get(1) == 107)
                {
                    cardMiddle.setImageResource(R.drawable.ace);

                }
                else if (cards.get(1) == 307)
                {
                    cardMiddle.setImageResource(R.drawable.five);
                }
                else if (cards.get(1) == 407)
                {
                    cardMiddle.setImageResource(R.drawable.king);
                }

                if (cards.get(2) == 107)
                {
                    cardRight.setImageResource(R.drawable.ace);

                }
                else if (cards.get(2) == 307)
                {
                    cardRight.setImageResource(R.drawable.five);
                }
                else if (cards.get(2) == 407)
                {
                    cardRight.setImageResource(R.drawable.king);
                }

            }
        });

        cardMiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cards.get(1) == 107)
                {
                    cardMiddle.setImageResource(R.drawable.ace);

                    Toast.makeText(MainActivity.this, "Salute !", Toast.LENGTH_SHORT)
                            .show();

                }
                else if (cards.get(1) == 307)
                {
                    cardMiddle.setImageResource(R.drawable.five);
                }
                else if (cards.get(1) == 407)
                {
                    cardMiddle.setImageResource(R.drawable.king);
                }

                if (cards.get(0) == 107)
                {
                    cardLeft.setImageResource(R.drawable.ace);


                }
                else if (cards.get(0) == 307)
                {
                    cardLeft.setImageResource(R.drawable.five);
                }
                else if (cards.get(0) == 407)
                {
                    cardLeft.setImageResource(R.drawable.king);
                }

                if (cards.get(2) == 107)
                {
                    cardRight.setImageResource(R.drawable.ace);

                }
                else if (cards.get(2) == 307)
                {
                    cardRight.setImageResource(R.drawable.five);
                }
                else if (cards.get(2) == 407)
                {
                    cardRight.setImageResource(R.drawable.king);
                }


            }
        });

        cardRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cards.get(2) == 107)
                {
                    cardRight.setImageResource(R.drawable.ace);

                    Toast.makeText(MainActivity.this, "Salute !", Toast.LENGTH_SHORT)
                            .show();
                }
                else if (cards.get(2) == 307)
                {
                    cardRight.setImageResource(R.drawable.five);
                }
                else if (cards.get(2) == 407)
                {
                    cardRight.setImageResource(R.drawable.king);
                }

                if (cards.get(1) == 107)
                {
                    cardMiddle.setImageResource(R.drawable.ace);

                }
                else if (cards.get(1) == 307)
                {
                    cardMiddle.setImageResource(R.drawable.five);
                }
                else if (cards.get(1) == 407)
                {
                    cardMiddle.setImageResource(R.drawable.king);
                }

                if (cards.get(0) == 107)
                {
                    cardLeft.setImageResource(R.drawable.ace);

                }
                else if (cards.get(0) == 307)
                {
                    cardLeft.setImageResource(R.drawable.five);
                }
                else if (cards.get(0) == 407)
                {
                    cardLeft.setImageResource(R.drawable.king);
                }

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Collections.shuffle(cards);

                cardLeft.setImageResource(R.drawable.back);

                cardMiddle.setImageResource(R.drawable.back);

                cardRight.setImageResource(R.drawable.back);

                Animation anim_left = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.left);

                Animation anim_middle = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.middle);

                Animation anim_right = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.right);

                cardLeft.startAnimation(anim_left);

                cardMiddle.startAnimation(anim_middle);

                cardRight.startAnimation(anim_right);

            }
        });
    }

}
