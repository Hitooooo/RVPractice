package com.hito.rvpractice.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.hito.rvpractice.model.IType;

/**
 *
 * Created by dream on 2016/12/28.
 */

public abstract class BasicHolder extends RecyclerView.ViewHolder {
    public BasicHolder(View itemView) {
        super(itemView);
    }

    /**
     * 强制子类重写，实现布局数据填充
     * @param holder
     */
    public abstract void onBindViewHolder(IType holder);
}
