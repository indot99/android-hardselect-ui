package org.richcode.hardselect.Page;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.richcode.hardselect.Adapter.FeedAdapter;
import org.richcode.hardselect.Data.FeedData;
import org.richcode.hardselect.R;

import java.util.ArrayList;

public class FragmentFeed extends Fragment {

    RecyclerView FeedRecyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    ArrayList<FeedData>list = new ArrayList<FeedData>();

    public FragmentFeed() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feed, container, false);

        FeedRecyclerView = (RecyclerView)view.findViewById(R.id.feed_list);
        FeedRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        FeedRecyclerView.setLayoutManager(layoutManager);

        adapter = new FeedAdapter(list,getContext());

        FeedRecyclerView.setAdapter(adapter);

        list.add(new FeedData(0,0,100,57,43,"비행기","비행기를 타고싶다"));
        list.add(new FeedData(0,0,600,27,573,"유저","100만원을 줍는다"));
        list.add(new FeedData(0,0,200,157,43,"비행기","비행기를 타고싶다"));
        list.add(new FeedData(0,0,100,57,43,"비행기","비행기를 타고싶다"));
        list.add(new FeedData(0,0,100,57,43,"비행기","비행기를 타고싶다"));
        list.add(new FeedData(0,0,100,57,43,"비행기","비행기를 타고싶다"));
        list.add(new FeedData(0,0,100,57,43,"비행기","비행기를 타고싶다"));


        return view;
    }

    public void refresh(){
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.detach(this).attach(this).commit();
    }

}