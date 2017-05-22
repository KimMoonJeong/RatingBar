package com.example.moong.ratingbar;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by moong on 2017-05-15.
 */

public class RatingBarTestActivity extends ActionBarActivity {
    private RatingBar ratingBar;
    private TextView value;
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContetnView(R.layout.activity_main);

        SetupRatingBar();
        SetupButton();

    }
    private void SetupRatingBar() {

        ratingBar = (RatingBar)findViewById(R.id.ratingbar);
        value = (TextView)findViewById(R.id.value);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                value.setText(String.valueOf(rating));
            }
        });
    }
    private void SetupButton() {
        ratingBar = (RatingBar)findViewById(R.id.ratingbar);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        String.valueOf(ratingBar.getRating()),
                        Toast.LENGTH_LONG).show();

            }
        });
    }



    private void setContetnView(int activity_main) {
    }
}

