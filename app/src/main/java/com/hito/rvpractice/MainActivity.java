package com.hito.rvpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hito.rvpractice.adapter.Test1Adapter;
import com.hito.rvpractice.adapter.base.BasicAdapter;
import com.hito.rvpractice.factory.ListTypeFactory;
import com.hito.rvpractice.model.Dog;
import com.hito.rvpractice.model.IType;
import com.hito.rvpractice.model.Pig;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    private ArrayList<String> mData;
    private Test1Adapter      mTest1Adapter;
    private List<IType> animals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        initData();
//        initRV();
        initBData();
        initBRV();
    }

    private void initBRV() {
        BasicAdapter basicAdapter = new BasicAdapter(new ListTypeFactory(), this, animals);
        mRecyclerView.setAdapter(basicAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void initBData() {
        for (int i = 0; i < 10; i++) {
            animals.add(new Dog(1+" 狗"));
            animals.add(new Pig(1+" 猪"));
        }
    }

    // 初始化RecyclerView
    private void initRV() {
        if (mTest1Adapter == null) {
            mTest1Adapter = new Test1Adapter(this, mData);
        }
        mRecyclerView.setAdapter(mTest1Adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL));
    }

    private void initData() {
        mData = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mData.add("Test " + i);
        }
    }
}
