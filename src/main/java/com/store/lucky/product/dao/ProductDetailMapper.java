package com.store.lucky.product.dao;

import com.store.lucky.product.model.ProductDetail;

public interface ProductDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductDetail record);

    int insertSelective(ProductDetail record);

    ProductDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductDetail record);

    int updateByPrimaryKey(ProductDetail record);
}