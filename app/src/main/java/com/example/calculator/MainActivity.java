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
                int t = Integer.parseInt(transport.getText().toString());
                int h = Integer.parseInt(hotels.getText().toString());
                int m = Integer.parseInt(meals.getText().toString());
                int a = Integer.parseInt(act.getText().toString());
                int sum = t + h + m + a;
                total.setText("" + sum);
            }
        });
    }
}