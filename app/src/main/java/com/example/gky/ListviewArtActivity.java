package com.example.gky;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


public class ListviewArtActivity extends AppCompatActivity {

    private ListView lv;
    ArrayList<listview> arrayCourse = new ArrayList<>();
    ListviewAdapter adapter;
    ImageButton lvback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_art);

        lvback = (ImageButton) findViewById(R.id.lvback);

        lvback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListviewArtActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        lv = (ListView)  findViewById(R.id.lv);


        arrayCourse.add(new listview("Image1", R.drawable.art)) ;
        arrayCourse.add(new listview("Image2", R.drawable.art)) ;
        arrayCourse.add(new listview("Image3", R.drawable.art)) ;
        arrayCourse.add(new listview("Image4", R.drawable.art)) ;
        arrayCourse.add(new listview("Image5", R.drawable.art)) ;


        adapter = new ListviewAdapter(ListviewArtActivity.this, arrayCourse);
        lv.setAdapter(adapter);
    }


}