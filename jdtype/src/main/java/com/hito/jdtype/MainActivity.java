package com.hito.jdtype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hito.jdtype.adapter.RightAdapter;
import com.hito.jdtype.model.Product;

import java.util.ArrayList;

/**
 * 用过RecyclerView实现京东购物分类
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView mRvLeft; // 左侧列表
    private RecyclerView mRvRight;// 右侧列表
    private ArrayList<Product> mProducts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        initRV();
    }

    private void initRV() {
        RightAdapter rightAdapter = new RightAdapter(this, mProducts);
        // 设置三列，
        final GridLayoutManager manager = new GridLayoutManager(this, 3);
        // span（跨度的意思） 如果是头的话，就自己占一栏也就是跨了3列
        // 如果是普通item就直接是1列
        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return mProducts.get(position).getType() == 0 ? 3 :1;
//                return (3 - position % 3);
            }
        });
        mRvRight.setLayoutManager(manager);
        mRvRight.setAdapter(rightAdapter);
    }

    private void initData() {
        mProducts.add(new Product("饼干", 0));
        mProducts.add(new Product("奶油饼干", 1));
        mProducts.add(new Product("威化", 1));
        mProducts.add(new Product("曲奇", 1));
        mProducts.add(new Product("传统糕点", 0));
        mProducts.add(new Product("凤梨酥", 1));
        mProducts.add(new Product("杏仁饼", 1));
        mProducts.add(new Product("烧饼", 1));
        mProducts.add(new Product("花生酥", 1));
        mProducts.add(new Product("西式糕点", 0));
        mProducts.add(new Product("巧克力派", 1));
        mProducts.add(new Product("酥心卷", 1));
        mProducts.add(new Product("面包", 1));
        mProducts.add(new Product("泡芙", 1));
        mProducts.add(new Product("蛋挞", 1));
    }

    private void initView() {
        mRvLeft = (RecyclerView) findViewById(R.id.left_list);
        mRvRight = (RecyclerView) findViewById(R.id.right_list);
    }
}
