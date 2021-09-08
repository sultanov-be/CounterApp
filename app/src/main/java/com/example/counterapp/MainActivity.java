package com.example.counterapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    //String formatted = String.format("%03d", quantity);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view) {
        quantity++;
        display(String.format("%03d", quantity));
    }

    public void reset(View view) {
        quantity = 0;
        display(String.format("%03d", quantity));
    }

    public void decrement(View view) {
        if (quantity != 0) {
            quantity--;
        }
        display(String.format("%03d", quantity));
    }


    private void display(String number) {
        TextView quantityTextView = (TextView) findViewById
                (R.id.quantity);
        quantityTextView.setText("" + number);
    }
}
