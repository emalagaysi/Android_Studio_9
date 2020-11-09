package com.example.android_studio_9_guessnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(b1);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(b2);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(b3);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(b4);

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(b5);

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(b6);

        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(b7);

        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(b8);

        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(b9);

        Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(b10);
    }

    private View.OnClickListener b1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView) findViewById(R.id.textview2);
            nb.setText("1");
        }
    };
    private View.OnClickListener b2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView) findViewById(R.id.textview2);
            nb.setText("2");
        }
    };
    private View.OnClickListener b3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView) findViewById(R.id.textview2);
            nb.setText("3");
        }
    };
    private View.OnClickListener b4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView) findViewById(R.id.textview2);
            nb.setText("4");
        }
    };
    private View.OnClickListener b5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView) findViewById(R.id.textview2);
            nb.setText("5");
        }
    };
    private View.OnClickListener b6 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView) findViewById(R.id.textview2);
            nb.setText("6");
        }
    };
    private View.OnClickListener b7 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView) findViewById(R.id.textview2);
            nb.setText("7");
        }
    };
    private View.OnClickListener b8 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView) findViewById(R.id.textview2);
            nb.setText("8");
        }
    };
    private View.OnClickListener b9 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView nb = (TextView) findViewById(R.id.textview2);
            nb.setText("9");
        }
    };
    private View.OnClickListener b10 = new View.OnClickListener() {
        @Override

        public void onClick(View v) {
            int count = 0;
        }
    };


    public void b11(View v) {

        TextView number = (TextView) findViewById(R.id.textview2);

        Intent intent = new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("NUMBER", number.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);

    }
}