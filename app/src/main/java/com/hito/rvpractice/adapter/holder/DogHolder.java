package com.hito.rvpractice.adapter.holder;

import android.view.View;
import android.widget.TextView;

import com.hito.rvpractice.R;
import com.hito.rvpractice.model.Dog;
import com.hito.rvpractice.model.IType;

/**
 * Created by dream on 2016/12/28.
 */

public class DogHolder extends BasicHolder {
    private  TextView mTv;

    public DogHolder(View itemView) {
        super(itemView);
        mTv = (TextView) itemView.findViewById(R.id.tv_dog);
    }

    @Override
    public void onBindViewHolder(IType holder) {
        Dog pig = holder instanceof Dog ? ((Dog) holder) : null;
        mTv.setText(pig.mName);
    }
}
