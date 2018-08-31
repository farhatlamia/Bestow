package com.example.asus.bestow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main16Activity extends AppCompatActivity {
   private Button button;
   private Button buttonn;
   private Button buttonm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        button = (Button) findViewById(R.id.button4);
        buttonn = (Button) findViewById(R.id.button5);
        buttonm = (Button) findViewById(R.id.button8);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editprofile();

            }
        });


        buttonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();

            }
        });

        buttonm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();

            }
        });

    }
    public void editprofile(){
        Intent intent = new Intent(this,Main4Activity.class);
        startActivity(intent);
    }

    public void logout(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void next(){
        Intent intent = new Intent(this,Main11Activity.class);
        startActivity(intent);
    }


}
