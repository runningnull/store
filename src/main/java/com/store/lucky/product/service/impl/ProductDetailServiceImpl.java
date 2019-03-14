package com.store.lucky.product.service.impl;

import com.store.lucky.product.dao.ProductDetailMapper;
import com.store.lucky.product.model.ProductDetail;
import com.store.lucky.product.service.ProductDetailService;
import com.store.lucky.product.so.ProductDetailSO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: linzj
 * date: 2019/3/14
 * time: 10:26
 * description: No Description
 */
@Service
public class ProductDetailServiceImpl implements ProductDetailService {
    private static final Logger logger = LoggerFactory.getLogger(ProductDetailServiceImpl.class);

    @Autowired
    private ProductDetailMapper productDetailMapper;

    @Override
    public boolean deleteByPrimaryKey(Long id) {
        return 1 == productDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(ProductDetail record) {
        return 1 == productDetailMapper.insert(record);
    }

    @Override
    public boolean insertSelective(ProductDetail record) {
        return 1 == productDetailMapper.insertSelective(record);
    }

    @Override
    public ProductDetail selectByPrimaryKey(Long id) {
        return productDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(ProductDetail record) {
        return 1 == productDetailMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public boolean updateByPrimaryKey(ProductDetail record) {
        return 1 == productDetailMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ProductDetail> listBySO(ProductDetailSO so) {
        return productDetailMapper.selectUserBySO(so);
    }
}
