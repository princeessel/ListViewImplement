package com.example.consultants.listviewimplementation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lib.MyClass;

import java.util.List;

public class MainActivity extends AppCompatActivity {
private ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview= findViewById(R.id.listView);

        MyClass myClass = new MyClass();
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.list_item_view , myClass.createList(1000));

        listview.setAdapter(adapter);

    }


}
