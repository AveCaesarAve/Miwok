package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<String>();
        words.set(0, "one");
        words.set(1, "two");
        words.set(2, "three");
        words.set(3, "four");
        words.set(4, "five");
        words.set(5, "six");
        words.set(6, "seven");
        words.set(7, "eight");
        words.set(8, "nine");
        words.set(9, "ten");

        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        TextView wordView = new TextView(this);
        wordView.setText(words.get(0));
        rootView.addView(wordView);

        TextView wordView2 = new TextView(this);
        wordView2.setText(words.get(1));
        rootView.addView(wordView2);

        TextView wordView3 = new TextView(this);
        wordView3.setText(words.get(2));
        rootView.addView(wordView3);

        TextView wordView4 = new TextView(this);
        wordView4.setText(words.get(3));
        rootView.addView(wordView4);

        TextView wordView5 = new TextView(this);
        wordView5.setText(words.get(4));
        rootView.addView(wordView5);

        TextView wordView6 = new TextView(this);
        wordView6.setText(words.get(5));
        rootView.addView(wordView6);

        TextView wordView7 = new TextView(this);
        wordView7.setText(words.get(6));
        rootView.addView(wordView7);

        TextView wordView8 = new TextView(this);
        wordView8.setText(words.get(7));
        rootView.addView(wordView8);

        TextView wordView9 = new TextView(this);
        wordView9.setText(words.get(8));
        rootView.addView(wordView9);

        TextView wordView10 = new TextView(this);
        wordView10.setText(words.get(9));
        rootView.addView(wordView10);

        /*Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 1: " + words.get(1));
        Log.v("NumbersActivity", "Word at index 2: " + words.get(2));
        Log.v("NumbersActivity", "Word at index 3: " + words.get(3));
        Log.v("NumbersActivity", "Word at index 4: " + words.get(4));
        Log.v("NumbersActivity", "Word at index 5: " + words.get(5));
        Log.v("NumbersActivity", "Word at index 6: " + words.get(6));
        Log.v("NumbersActivity", "Word at index 7: " + words.get(7));
        Log.v("NumbersActivity", "Word at index 8: " + words.get(8));
        Log.v("NumbersActivity", "Word at index 9: " + words.get(9));*/

    }
}
