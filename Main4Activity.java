package com.example.asus.bestow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity{
   private Button button;
   private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button = (Button) findViewById(R.id.button6);
        button1 = (Button) findViewById(R.id.button9);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();

            }
        });
    }

        public void next()
        {
            Intent intent1 = new Intent(this,Main16Activity.class);
            startActivity(intent1);
        }


public void back()
{
    Intent intent = new Intent(this,MainActivity.class);
    startActivity(intent);
}
}