package com.rutec.mypizzaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
}

