package com.store.lucky.product.service.impl;

import com.store.lucky.product.dao.ProductMapper;
import com.store.lucky.product.model.Product;
import com.store.lucky.product.service.ProductService;
import com.store.lucky.product.so.ProductSO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author: linzj
 * date: 2019/3/14
 * time: 10:25
 * description: No Description
 */
@Service
public class ProductServiceImpl implements ProductService {
    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductMapper productMapper;

    @Override
    public boolean deleteByPrimaryKey(Long id) {
        return 1 == productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(Product product) {
        return 1 == productMapper.insert(product);
    }

    @Override
    public boolean insertSelective(Product product) {
        return 1 == productMapper.insertSelective(product);
    }

    @Override
    public Product selectByPrimaryKey(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(Product product) {
        return 1 == productMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public boolean updateByPrimaryKey(Product product) {
        return 1 == productMapper.updateByPrimaryKey(product);
    }

    @Override
    public List<Product> listBySO(ProductSO so) {
        return productMapper.selectUserBySO(so);
    }

    @Override
    public boolean updateProduct(Product product) {
        ProductSO so = new ProductSO();
        BeanUtils.copyProperties(product, so);
        List<Product> result = listBySO(so);
        if (CollectionUtils.isEmpty(result)) {
            return insert(product);
        }
        return updateByPrimaryKeySelective(product);
    }
}
