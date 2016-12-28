package com.hito.rvpractice.factory;

import android.view.View;

import com.hito.rvpractice.adapter.holder.BasicHolder;
import com.hito.rvpractice.model.Dog;
import com.hito.rvpractice.model.Pig;

/**
 * 两个任务
 * 1，根据实体，返回type
 * 2，根据type返回ViewHolder
 * Created by dream on 2016/12/28.
 */

public interface TypeFactory {
    int type(Pig pig);

    int type(Dog dog);

    BasicHolder onCreateViewHolder(View itemView, int viewType);
}
