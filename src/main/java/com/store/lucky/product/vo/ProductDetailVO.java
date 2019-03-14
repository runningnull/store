package com.store.lucky.product.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: linzj
 * date: 2019/3/14
 * time: 9:52
 * description: No Description
 */
public class ProductDetailVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Date createTime;

    private Date updateTime;

    private String productName;

    private String productCode;

    private Integer sellOut;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getSellOut() {
        return sellOut;
    }

    public void setSellOut(Integer sellOut) {
        this.sellOut = sellOut;
    }

    @Override
    public String toString() {
        return "ProductDetailVO{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", sellOut=" + sellOut +
                '}';
    }
}
