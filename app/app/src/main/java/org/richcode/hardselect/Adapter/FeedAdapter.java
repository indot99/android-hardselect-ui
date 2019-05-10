package org.richcode.hardselect.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.richcode.hardselect.Data.FeedData;
import org.richcode.hardselect.R;

import java.util.ArrayList;

import az.plainpie.PieView;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ViewHolder> {


    private ArrayList<FeedData> list = new ArrayList<FeedData>();
    private Context context;

    public FeedAdapter(ArrayList<FeedData>list, Context context){
        this.list = list;
        this.context = context;
    }

    @NonNull

    @Override
    public FeedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_feed,viewGroup,false);

        FeedAdapter.ViewHolder vh = new FeedAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull FeedAdapter.ViewHolder holder, int position) {

        final int pos = position;
        float like_count = ((float)list.get(pos).getLeft_count()/(float)list.get(pos).getCount())*100;
        float unlike_count = 100-like_count;
        float like_count_percent = like_count;
        float unlike_count_percent = 100-like_count_percent;

        holder.UserText.setText(list.get(pos).getUser_name());
        holder.LeftContentText.setText(list.get(pos).getLeft_content());
        holder.RightContentText.setText(list.get(pos).getRight_content());
        holder.CountText.setText(Integer.toString(list.get(pos).getCount())+"명이 참여했습니다");
        holder.UnLikeChart.setPercentageBackgroundColor(Color.parseColor("#FF9090"));
        holder.LikeChart.setPercentageBackgroundColor(Color.parseColor("#90E4FF"));
        holder.UnLikeChart.setInnerText(Float.toString(unlike_count_percent));
        holder.UnLikeChart.setPercentage(unlike_count);
        holder.LikeChart.setInnerText(Float.toString(like_count_percent));
        holder.LikeChart.setPercentage(like_count);





    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView UserText;
        TextView LeftContentText;
        TextView RightContentText;
        TextView CountText;
        PieView LikeChart;
        PieView UnLikeChart;
        Button LikeButton;
        Button UnLikeButton;

        public ViewHolder(View view) {
            super(view);

            UserText = (TextView)view.findViewById(R.id.feed_user_text);
            LeftContentText = (TextView)view.findViewById(R.id.feed_left_content);
            RightContentText = (TextView)view.findViewById(R.id.feed_right_content);
            CountText = (TextView)view.findViewById(R.id.item_participants_text);
            LikeChart = (PieView)view.findViewById(R.id.feed_right_select_chart);
            UnLikeChart = (PieView)view.findViewById(R.id.feed_left_select_chart);
            LikeButton = (Button)view.findViewById(R.id.feed_right_button);
            UnLikeButton = (Button)view.findViewById(R.id.feed_right_button);

        }
    }

}
