package com.example.ilie.catalog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Create_Schedule extends AppCompatActivity {

    Button mSchedule_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create__schedule);

        mSchedule_Btn = (Button) findViewById(R.id.Schedule_Btn);

        mSchedule_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Create_Schedule.this, Schedule_Creator.class);
                startActivity(intent);
            }
        });


    }

}
