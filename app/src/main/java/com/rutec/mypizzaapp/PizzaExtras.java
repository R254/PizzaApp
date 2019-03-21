package com.rutec.mypizzaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class PizzaExtras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_extras);
    }
    public void toastMe(View view){
        Toast myToast = Toast.makeText(this, "Hello Toast",
                Toast.LENGTH_SHORT);
        myToast.show();
    }
    public void countMe(View view){
        TextView showCountTextView =
                (TextView) findViewById(R.id.textView6);

        String countString = showCountTextView.getText().toString();

        Integer count = Integer.parseInt(countString);
        count++;

        showCountTextView.setText(count.toString());
    }
    private static final String TOTAL_COUNT = "total_count";
    public void randomMe(View view){
        Intent randomIntent = new Intent(this, SecondExtras.class);

        // Get the text view that shows the count.
        TextView showCountTextView = (TextView) findViewById(R.id.textView6);

        // Get the value of the text view.
        String countString = showCountTextView.getText().toString();

        // Convert the count to an int
        int count = Integer.parseInt(countString);
        // Add the count to the extras for the Intent.
        randomIntent.putExtra(TOTAL_COUNT, count);

        startActivity(randomIntent);
    }
}

