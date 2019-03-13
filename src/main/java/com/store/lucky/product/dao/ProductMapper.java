package com.store.lucky.product.dao;

import com.store.lucky.product.model.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(Long uuid);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Long uuid);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}