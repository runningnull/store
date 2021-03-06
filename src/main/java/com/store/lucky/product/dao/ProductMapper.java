package com.store.lucky.product.dao;

import com.store.lucky.product.model.Product;
import com.store.lucky.product.so.ProductSO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {
    int deleteByPrimaryKey(Long uuid);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Long uuid);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    /**
     * 根据so查询产品信息
     *
     * @param so
     * @return
     */
    List<Product> selectUserBySO(ProductSO so);
}