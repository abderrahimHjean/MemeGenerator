package com.example.derekshao.memegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class selectImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_image);

        String[] image_names = {"Gnome Child"};
        ListAdapter imgAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, image_names);
        ListView list = (ListView)findViewById(R.id.image_list);
        list.setAdapter(imgAdapter);

            new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String img_name = String.valueOf(parent.getItemAtPosition(position));
                    Toast.makeText(selectImage.this, img_name, Toast.LENGTH_SHORT).show();
                }
            };
    }
}