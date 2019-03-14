package com.store.lucky.product.service;


import com.store.lucky.product.model.ProductDetail;
import com.store.lucky.product.so.ProductDetailSO;

import java.util.List;

/**
 * @author: linzj
 * date: 2019/3/14
 * time: 10:25
 * description: No Description
 */
public interface ProductDetailService {
    boolean deleteByPrimaryKey(Long id);

    boolean insert(ProductDetail record);

    boolean insertSelective(ProductDetail record);

    ProductDetail selectByPrimaryKey(Long id);

    boolean updateByPrimaryKeySelective(ProductDetail record);

    boolean updateByPrimaryKey(ProductDetail record);

    /**
     * 根据so查询产品明细信息
     *
     * @param so
     * @return
     */
    List<ProductDetail> listBySO(ProductDetailSO so);

}
