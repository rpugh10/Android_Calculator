package com.example.calculator;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText transport;
    EditText hotels;
    EditText meals;
    EditText act;
    Button calculate;
    EditText total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        transport = findViewById(R.id.textView5);
        hotels = findViewById(R.id.textView6);
        meals = findViewById(R.id.textView7);
        act = findViewById(R.id.textView8);
        calculate = findViewById(R.id.button2);
        total = findViewById(R.id.textView9);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double t = Double.parseDouble(transport.getText().toString());
                double h = Double.parseDouble(hotels.getText().toString());
                double m = Double.parseDouble(meals.getText().toString());
                double a = Double.parseDouble(act.getText().toString());
                double sum = t + h + m + a;
                DecimalFormat format = new DecimalFormat("0.00");
                String formattedValue = format.format(sum);
                total.setText("" + formattedValue);
            }
        });
    }
}