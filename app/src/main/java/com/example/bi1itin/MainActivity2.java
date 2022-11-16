package com.example.bi1itin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gui dl ve
                RadioButton a1, a2, b1, b2, c1, c2, d1, d2, e1, e2, f1, f2;
                a1 = findViewById(R.id.radio_a1);
                a2 = findViewById(R.id.radio_a2);

                String noidung1, noidung2;
                Intent data = new Intent();
                if(a1.isChecked()){
                    noidung1 = "Jp";
                    noidung2 = "Kr";
                }
                else{
                    noidung1="Kr";
                    noidung2="Jp";
                }

                data.putExtra("noidung1", noidung1);
                data.putExtra("noidung2", noidung2);
                int code_result = 1;
                setResult(code_result, data);
                finish();
            }
        });

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gui dl ve

                Intent data = new Intent();

                int code_result = 0;
                setResult(code_result, data);
                finish();
            }
        });
    }
}