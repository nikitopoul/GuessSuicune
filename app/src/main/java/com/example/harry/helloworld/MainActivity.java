package com.example.harry.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    public boolean toggle = false;
    ImageView left,middle,right;
    List<Integer> cards;

    Button new_game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final TextView firstTextView = (TextView) findViewById(R.id.textView);


        left = (ImageView) findViewById(R.id.left);
        right = (ImageView) findViewById(R.id.right);
        middle = (ImageView) findViewById(R.id.middle);

        cards = new ArrayList<>();
        cards.add(107);
        cards.add(207);
        cards.add(407);

        //shuffling pokemon
        Collections.shuffle(cards);

        new_game = (Button) findViewById(R.id.new_game);

        new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //shuffle the pokemon again
                Collections.shuffle(cards);

                left.setImageResource(R.drawable.masterall);
                middle.setImageResource(R.drawable.masterall);
                right.setImageResource(R.drawable.masterall);

                Animation anim_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left);
                Animation anim_middle = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.middle);
                Animation anim_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.right);

                left.startAnimation(anim_left);
                right.startAnimation(anim_right);
                middle.startAnimation(anim_middle);
            }
        });


        left.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(cards.get(0)==107){
                    left.setImageResource(R.drawable.entei);
                }else if(cards.get(0)==207){
                    left.setImageResource(R.drawable.raikou);
                }else if(cards.get(0)==407){
                    left.setImageResource(R.drawable.suicune);
                    Toast.makeText(MainActivity.this, "Guessed", Toast.LENGTH_SHORT).show();
                }

                if(cards.get(1)==107){
                    middle.setImageResource(R.drawable.entei);
                }else if(cards.get(1)==207){
                    middle.setImageResource(R.drawable.raikou);
                }else if(cards.get(1)==407){
                    middle.setImageResource(R.drawable.suicune);
                }

                if(cards.get(2)==107){
                    right.setImageResource(R.drawable.entei);
                }else if(cards.get(2)==207){
                    right.setImageResource(R.drawable.raikou);
                }else if(cards.get(2)==407){
                    right.setImageResource(R.drawable.suicune);
                }
            }
        });
        middle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (cards.get(0) == 107) {
                    left.setImageResource(R.drawable.entei);
                } else if (cards.get(0) == 207) {
                    left.setImageResource(R.drawable.raikou);
                } else if (cards.get(0) == 407) {
                    left.setImageResource(R.drawable.suicune);
                    Toast.makeText(MainActivity.this, "Guessed", Toast.LENGTH_SHORT).show();
                }

                if (cards.get(1) == 107) {
                    middle.setImageResource(R.drawable.entei);
                } else if (cards.get(1) == 207) {
                    middle.setImageResource(R.drawable.raikou);
                } else if (cards.get(1) == 407) {
                    middle.setImageResource(R.drawable.suicune);
                    Toast.makeText(MainActivity.this, "Guessed", Toast.LENGTH_SHORT).show();
                }

                if (cards.get(2) == 107) {
                    right.setImageResource(R.drawable.entei);
                } else if (cards.get(2) == 207) {
                    right.setImageResource(R.drawable.raikou);
                } else if (cards.get(2) == 407) {
                    right.setImageResource(R.drawable.suicune);
                }
            }
        });
        right.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (cards.get(0) == 107) {
                    left.setImageResource(R.drawable.entei);
                } else if (cards.get(0) == 207) {
                    left.setImageResource(R.drawable.raikou);
                } else if (cards.get(0) == 407) {
                    left.setImageResource(R.drawable.suicune);
                }

                if (cards.get(1) == 107) {
                    middle.setImageResource(R.drawable.entei);
                } else if (cards.get(1) == 207) {
                    middle.setImageResource(R.drawable.raikou);
                } else if (cards.get(1) == 407) {
                    middle.setImageResource(R.drawable.suicune);
                }

                if (cards.get(2) == 107) {
                    right.setImageResource(R.drawable.entei);
                } else if (cards.get(2) == 207) {
                    right.setImageResource(R.drawable.raikou);
                } else if (cards.get(2) == 407) {
                    right.setImageResource(R.drawable.suicune);
                    Toast.makeText(MainActivity.this, "Guessed", Toast.LENGTH_SHORT).show();
                }
            }
        });







//        Button first_Button = (Button) findViewById(R.id.first_button);

//        first_Button.setOnClickListener(new View.OnClickListener(){
//
//
//            public void onClick(View view){
//
//                if(toggle == false){
//                    firstTextView.setText("Harry has clicked");
//                    toggle=true;
//                }else{
//                    firstTextView.setText("Hi again Helen");
//                    toggle=false;
//                }
//
//
//            }
//        });

    }
}
