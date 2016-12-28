package com.hito.rvpractice.factory;

import android.view.View;

import com.hito.rvpractice.R;
import com.hito.rvpractice.adapter.holder.BasicHolder;
import com.hito.rvpractice.adapter.holder.DogHolder;
import com.hito.rvpractice.adapter.holder.PigHolder;
import com.hito.rvpractice.model.Dog;
import com.hito.rvpractice.model.Pig;

/**
 * Created by dream on 2016/12/28.
 */

public class ListTypeFactory implements TypeFactory {
    @Override
    public int type(Pig pig) {
        return R.layout.item_rv_pig;
    }

    @Override
    public int type(Dog dog) {
        return R.layout.item_rv_dog;
    }

    @Override
    public BasicHolder onCreateViewHolder(View itemView, int viewType) {
        switch (viewType) {
            case R.layout.item_rv_pig:
                return new PigHolder(itemView);
            case R.layout.item_rv_dog:
                return new DogHolder(itemView);
            default:
                return null;
        }
    }


}
