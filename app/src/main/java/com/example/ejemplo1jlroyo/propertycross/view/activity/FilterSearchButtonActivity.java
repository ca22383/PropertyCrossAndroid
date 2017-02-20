package com.example.ejemplo1jlroyo.propertycross.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ejemplo1jlroyo.propertycross.R;
import com.example.ejemplo1jlroyo.propertycross.ResultSearchActivity;

public class FilterSearchButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_search_button);

        Button ButtonSearch = (Button) findViewById(R.id.ButtonSearch);

        ButtonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ResultSearchActivity.class);
                //intent.putExtra("numencerts", Resultat);
                //intent.putExtra("numpreguntes", numPregunta +1);
                startActivity(intent);
                finish();
            }
        });
    }
}
