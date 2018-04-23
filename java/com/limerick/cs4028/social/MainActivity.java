package com.limerick.cs4028.social;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNewPostActivity(View view) {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }

    public void onClickViewPostsActivity(View view) {
        Intent intent = new Intent(this, UserList.class);
        startActivity(intent);
    }

}





//        ArrayAdapter<Building> listAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                Building.buildings);
//        ListView buildings = findViewById(R.id.buildings);
//        buildings.setAdapter(listAdapter);
//
//        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                Intent intent = new Intent(NavigationActivity.this, BuildingDetailsActivity.class);
//                intent.putExtra("com.kumballz.brian.EXTRA_BUILDINGID", (int) id);
//                startActivity(intent);
//            }
//        };
//        buildings.setOnItemClickListener(onItemClickListener);
