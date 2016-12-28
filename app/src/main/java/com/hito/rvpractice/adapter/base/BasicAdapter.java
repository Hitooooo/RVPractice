package com.hito.rvpractice.adapter.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.hito.rvpractice.adapter.holder.BasicHolder;
import com.hito.rvpractice.factory.TypeFactory;
import com.hito.rvpractice.model.IType;

import java.util.List;

/**
 * 目的：处理多条目时，产生大串的if else 判断
 * Created by dream on 2016/12/28.
 */

public class BasicAdapter extends RecyclerView.Adapter<BasicHolder> {

    private TypeFactory mFactory;
    private List<IType> data;
    private Context     mContext;

    public BasicAdapter(TypeFactory factory, Context context, List<IType> data) {
        this.mFactory = factory;
        this.mContext = context;
        this.data = data;
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    @Override
    public BasicHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return mFactory.onCreateViewHolder(LayoutInflater.from(mContext).inflate(viewType,parent,false),viewType);
    }

    @Override
    public void onBindViewHolder(BasicHolder holder, int position) {
        holder.onBindViewHolder(data.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position).getType(mFactory);
    }


}
