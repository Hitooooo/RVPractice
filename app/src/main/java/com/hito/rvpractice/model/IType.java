package com.hito.rvpractice.model;

import com.hito.rvpractice.factory.TypeFactory;

/**
 * 实体需要实现的接口，用来设置Type
 * Created by dream on 2016/12/28.
 */

public interface IType {
    int getType(TypeFactory factory);
}
