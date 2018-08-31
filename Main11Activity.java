package com.example.asus.bestow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main11Activity extends AppCompatActivity {
    private Button buttone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        buttone = (Button) findViewById(R.id.button7);

        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();

            }
        });
    }

    public void back()
    {
        Intent intent = new Intent(this,Main16Activity.class);
        startActivity(intent);
    }
}
