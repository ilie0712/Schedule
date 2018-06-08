package com.example.ilie.catalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Menu_Activity extends AppCompatActivity {

    TextView mText_optiune;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_);

        mText_optiune = (TextView) findViewById(R.id.Text_Option);


    }
}
