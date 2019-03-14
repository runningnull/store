package com.store.lucky.product.so;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: linzj
 * date: 2019/3/14
 * time: 9:44
 * description: No Description
 */
public class ProductSO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long uuid;

    private Date createTime;

    private Date updateTime;

    private String productName;

    private String productCode;

    private Integer remainder;

    private Integer sellOut;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
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

    public Integer getRemainder() {
        return remainder;
    }

    public void setRemainder(Integer remainder) {
        this.remainder = remainder;
    }

    public Integer getSellOut() {
        return sellOut;
    }

    public void setSellOut(Integer sellOut) {
        this.sellOut = sellOut;
    }

    @Override
    public String toString() {
        return "ProductSO{" +
                "uuid=" + uuid +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", remainder=" + remainder +
                ", sellOut=" + sellOut +
                '}';
    }
}
