package com.hito.rvpractice.model;

import com.hito.rvpractice.factory.TypeFactory;

/**
 * Created by dream on 2016/12/28.
 */

public class Dog implements IType {
    public String mName;

    public Dog(String name) {
        this.mName = name;
    }

    @Override
    public int getType(TypeFactory factory) {
        return factory.type(this);
    }
}
