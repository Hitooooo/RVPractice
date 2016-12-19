package com.hito.rvpractice.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dream on 2016/12/19.
 */

public class Test1Adapter extends RecyclerView.Adapter<Test1Adapter.TestVH> {

    private List<String> mData;
    private Context mContext;

    public Test1Adapter(Context context, List<String> data) {
        this.mContext = context;
        this.mData = data;
    }

    @Override
    public TestVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(mContext, android.R.layout.simple_list_item_1, null);
        return new TestVH(view);
    }

    @Override
    public int getItemCount() {
        return mData==null?0:mData.size();
    }

    @Override
    public void onBindViewHolder(TestVH holder, int position) {
        holder.mTv.setText(mData.get(position));
    }

     class TestVH extends RecyclerView.ViewHolder {

         private TextView mTv;

         TestVH(View itemView) {
            super(itemView);
             mTv = (TextView)itemView.findViewById(android.R.id.text1);
         }
    }
}
