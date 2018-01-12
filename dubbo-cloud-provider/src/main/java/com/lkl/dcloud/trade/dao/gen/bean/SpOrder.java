package com.lkl.dcloud.trade.dao.gen.bean;

import java.util.Date;

public class SpOrder {
    /**
     *  
     *  所属表字段为`sp_order`.order_no
     */
    private String orderNo;

    /**
     *  
     *  所属表字段为`sp_order`.price_channel
     */
    private Double priceChannel;

    /**
     *  
     *  所属表字段为`sp_order`.good_no
     */
    private String goodNo;

    /**
     *  
     *  所属表字段为`sp_order`.create_time
     */
    private Date createTime;

    /**
     *  
     *  所属表字段为`sp_order`.update_time
     */
    private Date updateTime;

    /**
     *
     *`sp_order`.order_no
     *
     * @return the value of `sp_order`.order_no
     *
     * @mbggenerated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     *
     *`sp_order`.order_no
     *
     * @param orderNo the value for `sp_order`.order_no
     *
     * @mbggenerated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     *
     *`sp_order`.price_channel
     *
     * @return the value of `sp_order`.price_channel
     *
     * @mbggenerated
     */
    public Double getPriceChannel() {
        return priceChannel;
    }

    /**
     *
     *`sp_order`.price_channel
     *
     * @param priceChannel the value for `sp_order`.price_channel
     *
     * @mbggenerated
     */
    public void setPriceChannel(Double priceChannel) {
        this.priceChannel = priceChannel;
    }

    /**
     *
     *`sp_order`.good_no
     *
     * @return the value of `sp_order`.good_no
     *
     * @mbggenerated
     */
    public String getGoodNo() {
        return goodNo;
    }

    /**
     *
     *`sp_order`.good_no
     *
     * @param goodNo the value for `sp_order`.good_no
     *
     * @mbggenerated
     */
    public void setGoodNo(String goodNo) {
        this.goodNo = goodNo == null ? null : goodNo.trim();
    }

    /**
     *
     *`sp_order`.create_time
     *
     * @return the value of `sp_order`.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *
     *`sp_order`.create_time
     *
     * @param createTime the value for `sp_order`.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *
     *`sp_order`.update_time
     *
     * @return the value of `sp_order`.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *
     *`sp_order`.update_time
     *
     * @param updateTime the value for `sp_order`.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sp_order`
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderNo=").append(orderNo);
        sb.append(", priceChannel=").append(priceChannel);
        sb.append(", goodNo=").append(goodNo);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}