package com.am.licetregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String s1,s2,s3,s4,s5,s6,s7,s8;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b=findViewById(R.id.button4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smsIntent = new Intent(Intent.ACTION_SENDTO,
                        Uri.parse("sms:9150522345"));
                smsIntent.putExtra("sms_body", "Registration successful");
                startActivity(smsIntent);
            }
        });
        textView1 = findViewById(R.id.textView1);
        s1 = getIntent().getStringExtra("xyz");
        textView1.setText(s1);
        textView2 = findViewById(R.id.textView2);
        s2 = getIntent().getStringExtra("abc");
        textView2.setText(s2);
        textView3 = findViewById(R.id.textView3);
        s3 = getIntent().getStringExtra("pqr");
        textView3.setText(s3);
        textView4 = findViewById(R.id.textView4);
        s5 = getIntent().getStringExtra("ab");
        textView4.setText(s5);
        textView5 = findViewById(R.id.textView5);
        s7 = getIntent().getStringExtra("x");
        textView5.setText(s7);
        textView6 = findViewById(R.id.textView6);
        s4 = getIntent().getStringExtra("xy");
        textView6.setText(s4);
        textView7 = findViewById(R.id.textView7);
        s6 = getIntent().getStringExtra("pq");
        textView7.setText(s6);
        textView8 = findViewById(R.id.textView8);
        s8 = getIntent().getStringExtra("a");
        textView8.setText(s8);
    }
}