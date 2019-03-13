package com.store.lucky.product.model;

import java.util.Date;

public class ProductDetail {
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
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public Integer getSellOut() {
        return sellOut;
    }

    public void setSellOut(Integer sellOut) {
        this.sellOut = sellOut;
    }
}