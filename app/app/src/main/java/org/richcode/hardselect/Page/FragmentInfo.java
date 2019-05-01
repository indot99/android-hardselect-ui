package org.richcode.hardselect.Page;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.richcode.hardselect.Adapter.FeedAdapter;
import org.richcode.hardselect.Data.FeedData;
import org.richcode.hardselect.R;

import java.util.ArrayList;

public class FragmentInfo extends Fragment {

    Button KakaoButton;
    Button SelectBoardButton;
    TextView UserText;
    TextView HelloUserText;

    RecyclerView MyRecyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    ArrayList<FeedData> list = new ArrayList<FeedData>();

    public FragmentInfo() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        UserText = (TextView)view.findViewById(R.id.user_info_text);
        HelloUserText = (TextView)view.findViewById(R.id.hello_user_text);
        KakaoButton = (Button)view.findViewById(R.id.kakao_openchatting_button);
        SelectBoardButton = (Button)view.findViewById(R.id.select_board_button);
        MyRecyclerView = (RecyclerView)view.findViewById(R.id.list_info);


        MyRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        MyRecyclerView.setLayoutManager(layoutManager);

        adapter = new FeedAdapter(list,getContext());

        MyRecyclerView.setAdapter(adapter);

        SelectBoardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        KakaoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        return view;
    }

    public void refresh(){
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.detach(this).attach(this).commit();
    }

}