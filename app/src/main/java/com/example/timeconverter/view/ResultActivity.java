package com.example.timeconverter.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.timeconverter.R;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ResultActivity extends AppCompatActivity {

    private TextView tvSecondes, tvTemps;
    private Button btnReturn;
    private String temps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        init();

        // à compléter
        Intent intent = getIntent();

        btnReturn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                // à implémenter
                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);

            }

        });
    }

    private void init()
    {
        tvTemps = (TextView) findViewById(R.id.tvTemps);
        tvSecondes = (TextView) findViewById(R.id.tvSecondes);
        btnReturn = (Button) findViewById(R.id.btnReturn);
    }
    public void goBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}