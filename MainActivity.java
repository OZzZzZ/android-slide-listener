package com.example.neterebsky.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.text);

        textView.setOnTouchListener(new OnSlideTouchListener() {
            @Override
            public boolean onSlideLeft() {
                // Write your code here
                textView.setText("Moved from right to left");
                return true;
            }

            @Override
            public boolean onSlideRight() {
                // Write your code here
                textView.setText("Moved from left to right");
                return true;
            }

            @Override
            public boolean onSlideUp() {
                // Write your code here
                textView.setText("Moved from down to up");
                return true;
            }

            @Override
            public boolean onSlideDown() {
                // Write your code here
                textView.setText("Moved from up to down");
                return true;
            }

            @Override
            public boolean onClick() {
                // Write your code here
                textView.setText("Clicked");
                return true;
            }
        });

    }
}
