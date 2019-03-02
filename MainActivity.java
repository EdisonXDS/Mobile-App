

package com.example.ece387app;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.ece387app.R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display(quantity++);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(com.example.ece387app.R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}
