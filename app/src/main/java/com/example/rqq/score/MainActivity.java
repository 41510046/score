package com.example.rqq.score;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  /*    Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);
        Button btn7 = findViewById(R.id.button7);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);*/

    }
    public void btn1(View v) {
        TextView text = findViewById(R.id.textView2);
        int grade = Integer.parseInt(text.getText().toString()) + 3;
        text.setText(String.valueOf(grade));
    }

    public void btn2(View v) {
        TextView text = findViewById(R.id.textView2);
        int grade = Integer.parseInt(text.getText().toString()) + 2;
        text.setText(String.valueOf(grade));
    }

    public void btn3(View v) {
        TextView text = findViewById(R.id.textView2);
        int grade = Integer.parseInt(text.getText().toString()) + 1;
        text.setText(String.valueOf(grade));
    }

    public void btn4Click(View v) {
        TextView text = findViewById(R.id.textView4);
        int grade = Integer.parseInt(text.getText().toString()) + 3;
        text.setText(String.valueOf(grade));
    }

    public void btn5Click(View v) {
        TextView text = findViewById(R.id.textView4);
        int grade = Integer.parseInt(text.getText().toString()) + 2;
        text.setText(String.valueOf(grade));
    }

    public void btn6Click(View v) {
        TextView text = findViewById(R.id.textView4);
        int grade = Integer.parseInt(text.getText().toString()) + 1;
        text.setText(String.valueOf(grade));
    }

    public void btn7Click(View v) {
        TextView text1 = findViewById(R.id.textView2);
        TextView text2 = findViewById(R.id.textView4);
        text1.setText("0");
        text2.setText("0");
    }
}




