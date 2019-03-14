package com.store.lucky.product.service;

import com.store.lucky.product.model.Product;
import com.store.lucky.product.so.ProductSO;

import java.util.List;

/**
 * @author: linzj
 * date: 2019/3/14
 * time: 10:25
 * description: No Description
 */
public interface ProductService {

    /**
     * 根据id删除记录
     *
     * @param id
     * @return
     */
    boolean deleteByPrimaryKey(Long id);

    /**
     * 插入记录
     *
     * @param product
     * @return
     */
    boolean insert(Product product);

    /**
     * 插入记录
     *
     * @param product
     * @return
     */
    boolean insertSelective(Product product);

    /**
     * 根据id获取记录
     *
     * @param uuid
     * @return
     */
    Product selectByPrimaryKey(Long id);

    /**
     * 更新记录
     *
     * @param record
     * @return
     */
    boolean updateByPrimaryKeySelective(Product product);

    /**
     * 更新记录
     *
     * @param record
     * @return
     */
    boolean updateByPrimaryKey(Product product);

    /**
     * 根据so获取记录
     *
     * @param so
     * @return
     */
    List<Product> listBySO(ProductSO so);

    /**
     * 更新产品信息，如果不存在则添加，如果存在则更新
     *
     * @param product
     * @return
     */
    boolean updateProduct(Product product);
}
