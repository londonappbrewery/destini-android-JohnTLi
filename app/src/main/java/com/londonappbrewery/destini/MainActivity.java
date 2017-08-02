package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView= (TextView) findViewById(R.id.storyTextView);
        mButtonTop= (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
                     @Override
                          public void onClick(View v) {

                    if (mStoryIndex == 1) {

                    Toast.makeText(MainActivity.this, "T3", Toast.LENGTH_SHORT).show();
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;

                    } else if (mStoryIndex == 2) {

                    Toast.makeText(MainActivity.this, "T3", Toast.LENGTH_SHORT).show();
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;

                    } else if (mStoryIndex == 3) {

                    Toast.makeText(MainActivity.this, "T6", Toast.LENGTH_SHORT).show();
                    mStoryTextView.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                 }

                 }

                                });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex==1) {
                    Toast.makeText(MainActivity.this, "T2", Toast.LENGTH_SHORT).show();
                    mStoryTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex=2;

                }else if(mStoryIndex==2) {
                    Toast.makeText(MainActivity.this, "T4", Toast.LENGTH_SHORT).show();
                    mStoryTextView.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);

                }else if (mStoryIndex==3) {
                    Toast.makeText(MainActivity.this, "T5", Toast.LENGTH_SHORT).show();
                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);

                }
            }
        });
    }


}
