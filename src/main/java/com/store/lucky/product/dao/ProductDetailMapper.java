package com.store.lucky.product.dao;

import com.store.lucky.product.model.ProductDetail;
import com.store.lucky.product.so.ProductDetailSO;

import java.util.List;

public interface ProductDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductDetail record);

    int insertSelective(ProductDetail record);

    ProductDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductDetail record);

    int updateByPrimaryKey(ProductDetail record);

    /**
     * 根据so查询产品明细信息
     *
     * @param so
     * @return
     */
    List<ProductDetail> selectUserBySO(ProductDetailSO so);
}