package com.hito.jdtype.model;

/**
 * Created by dream on 2017/01/10.
 * 右侧list实体
 */

public class Product {
    private String name;
    private int type;

    public Product(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
