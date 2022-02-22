package com.example.monopolllia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView kub;
    private EditText counter;
    private TextView raz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kub = findViewById(R.id.kubiki);
        counter = findViewById(R.id.counter);
        raz = findViewById(R.id.raz);
        kub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setText(Integer.toString(Integer.parseInt(counter.getText().toString())+1));
                if ((Integer.parseInt(counter.getText().toString())%10)==2 || (Integer.parseInt(counter.getText().toString())%10)==3 || (Integer.parseInt(counter.getText().toString())%10)==4)
                    raz.setText("раза");
                else
                    raz.setText("раз");

            }
        });

    }
}