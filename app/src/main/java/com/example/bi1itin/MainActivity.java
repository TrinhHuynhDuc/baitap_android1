package com.example.bi1itin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //xu ly su kien o day
        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);

        EditText editText1= (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(String.valueOf(editText1.getText()));
                float b = (float) (a*24785);
                editText2.setText( String.valueOf(b));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText1.setText("");
                editText2.setText("");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        //goij den activity 2 va can dl tra ve
                Intent i = new Intent(v.getContext(), MainActivity2.class);
                startActivityForResult(i, 1);
            }
        });
    }

    //ovveride phuong thuc nay de khi quay lai atv main no xl dl tra ve
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 1://neeu ma tra ve bang 1
                String noidung1 = data.getStringExtra("noidung1");
                String noidung2 = data.getStringExtra("noidung2");
                TextView textView1 = findViewById(R.id.text1);
                textView1.setText(noidung1);
                TextView textView2 = findViewById(R.id.text2);
                textView2.setText(noidung2);
                break;
            default: break;
        }

    }
}