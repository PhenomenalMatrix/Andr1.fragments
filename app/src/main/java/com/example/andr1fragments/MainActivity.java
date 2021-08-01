package com.example.andr1fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.changeBtn);
        Fragment first = new FirstFragment();
        Fragment sec = new SecondFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.firstCont,first,null).commit();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.secondCont,sec,null).commit();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().remove(first).commit();
                getSupportFragmentManager().beginTransaction().remove(sec).commit();
            }
        });
    }

}