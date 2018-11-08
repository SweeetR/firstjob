package com.example.user.firstjob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rnd = new Random();
    int num;
    Button btn_cnc;
    Button btn_rnd;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_cnc= (Button) findViewById(R.id.btn_cnc);
        btn_rnd = (Button) findViewById(R.id.btn_rnd);
        txt = (TextView) findViewById(R.id.txt);
    }

    public void cancel(View view) {
        txt.setText("                                  Number not found");

    }

    public void getrnd(View view) {
        num = rnd.nextInt(100);
        txt.setText("                                  The number is:"+num);
    }
}
