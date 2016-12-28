package com.hito.rvpractice.adapter.holder;

import android.view.View;
import android.widget.TextView;

import com.hito.rvpractice.R;
import com.hito.rvpractice.model.IType;
import com.hito.rvpractice.model.Pig;

/**
 * Created by dream on 2016/12/28.
 */

public class PigHolder extends BasicHolder {

    private  TextView mTv;

    public PigHolder(View itemView) {
        super(itemView);
        mTv = (TextView) itemView.findViewById(R.id.tv_pig);
    }

    @Override
    public void onBindViewHolder(IType holder) {
        Pig pig = holder instanceof Pig ? ((Pig) holder) : null;
        mTv.setText(pig.mName);
    }
}
