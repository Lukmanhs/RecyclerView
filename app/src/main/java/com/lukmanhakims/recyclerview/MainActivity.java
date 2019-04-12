package com.lukmanhakims.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new RecyclerViewAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Lukman Hakim Saputra", "1414370309", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Derwi kusuma anjani", "1214234560", "987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Dewi nisa", "1214230345", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Khurnia", "1214378098", "098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Ahmad ikiwan", "1214230345", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Beli anugrah", "1214378098", "098758124"));
    }
}
