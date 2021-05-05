package com.nicofrnds02734.listviewdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    private String[] namaNegara = {
      "Indonesia",
      "Korea Selatan",
      "Amerika Serikat",
      "Malaysia",
      "Singapure",
      "Vietnam",
      "India",
      "Jepang",
      "Arab Saudi",
      "Banglades",
      "Srilanka",
       "Belgia"
    };
    private ArrayList<String> data;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.tv_list);
        data = new ArrayList<>();
        tampilData();
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item
                , data);
        listView.setAdapter(adapter);
    }

    private void tampilData() {
        Collections.addAll(data, namaNegara);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Memilih : " + namaNegara[position],
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


}