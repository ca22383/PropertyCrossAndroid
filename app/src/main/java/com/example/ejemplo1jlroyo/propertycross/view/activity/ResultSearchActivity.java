package com.example.ejemplo1jlroyo.propertycross.view.activity;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.ejemplo1jlroyo.propertycross.Aplicacion;
import com.example.ejemplo1jlroyo.propertycross.R;

public class ResultSearchActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_search);

        TabLayout tabResult = (TabLayout) findViewById(R.id.tabResultSearch);
        recyclerView = (RecyclerView) findViewById(R.id.activity_result_search);
        Aplicacion app = (Aplicacion) getApplication();
        recyclerView.setAdapter(app.getAdaptador());
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);



        tabResult.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {


            @Override
            public void onTabSelected(TabLayout.Tab tabResult) {

                //recyclerView.setLayoutManager(layoutManager);

                // On third tab we have pass intent to call SecondActivity.
                switch(tabResult.getPosition()){
                    case 0:
                        System.out.println("ME DETECTA EL PRIMER TAB");

                        recyclerView.setLayoutManager(layoutManager);

                        break;
                    case 1:
                        System.out.println("ME DETECTA EL SEGUNDO TAB");

                       //recyclerView.invalidate();
                        recyclerView.setLayoutManager(null);
                        break;

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tabResult) {
                //System.out.println("ME DETECTA QUE NO HAY TAB");
                //recyclerView.setLayoutManager(layoutManager);


            }
            @Override
            public void onTabReselected(TabLayout.Tab tabResult) {
            }

        });







    }
}
