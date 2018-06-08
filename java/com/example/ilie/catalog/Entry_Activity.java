package com.example.ilie.catalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Entry_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_);
        Toast.makeText(Entry_Activity.this, "Welcome", Toast.LENGTH_SHORT).show();


    }
}
