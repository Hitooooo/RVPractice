package com.hito.jdtype.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hito.jdtype.R;
import com.hito.jdtype.model.Product;

import java.util.List;

/**
 * Created by dream on 2017/01/11.
 */

public class RightAdapter extends RecyclerView.Adapter {

    private LayoutInflater mInflater;
    private List<Product>  mData;
    private Context        mContext;

    public RightAdapter(Context context, List<Product> data) {
        this.mContext = context;
        this.mData = data;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 1) { // 内容
            return new RightVH(mInflater.inflate(R.layout.item_right, null));
        } else if (viewType == 0) { // 头
            return new RightVHTitle(mInflater.inflate(R.layout.item_right_title, null));
        }

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RightVH) {
            ((RightVH) holder).mTv.setText(mData.get(position).getName());
        } else {
            ((RightVHTitle) holder).mTv.setText(mData.get(position).getName());
        }
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }

    @Override
    public int getItemViewType(int position) {
        return mData.get(position).getType();
    }

    private class RightVH extends RecyclerView.ViewHolder {

        private final TextView mTv;

        public RightVH(View itemView) {
            super(itemView);
            mTv = (TextView) itemView.findViewById(R.id.tv_item);
        }
    }

    private class RightVHTitle extends RecyclerView.ViewHolder {

        private TextView mTv;

        public RightVHTitle(View itemView) {
            super(itemView);
            mTv = (TextView) itemView.findViewById(R.id.tv_title);
        }
    }
}
