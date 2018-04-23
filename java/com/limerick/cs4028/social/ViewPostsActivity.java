package com.limerick.cs4028.social;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Query;
import com.google.firebase.database.Transaction;

public class ViewPostsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_posts);
//
//        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                );
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
//
//    }

    }
}