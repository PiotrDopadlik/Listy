package com.example.listy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ListView listViewTable;
    public ArrayList<Miejsca> table = new ArrayList<>();
    public MainActivity2 adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewTable = findViewById(R.id.listView);
        adapter = new MainActivity2(this, R.layout.activity_main2, Miejsca.miejsca);
        listViewTable.setAdapter(adapter);
    }
}