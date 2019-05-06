package org.richcode.hardselect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.richcode.hardselect.Adapter.FeedAdapter;
import org.richcode.hardselect.Data.FeedData;

import java.util.ArrayList;

public class MySelectActivity extends AppCompatActivity {

    RecyclerView FeedRecyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    ArrayList<FeedData> list = new ArrayList<FeedData>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_select);

        FeedRecyclerView = (RecyclerView)findViewById(R.id.my_select_view);
        FeedRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        FeedRecyclerView.setLayoutManager(layoutManager);

        adapter = new FeedAdapter(list,this);

        FeedRecyclerView.setAdapter(adapter);

    }
}
