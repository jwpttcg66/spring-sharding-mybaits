package com.snowcattle.demo.entity;

public class Order{
    private Integer orderId;

    private Integer userId;

    private String status;

    private Integer sharding_table_index;

    public void setSharding_table_index(Integer sharding_table_index) {
        this.sharding_table_index = sharding_table_index;
    }

    /**
     * @return order_id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    public Integer getSharding_table_index() {
        return sharding_table_index;
    }

    public void setSharding_table_index(int sharding_table_index) {
        this.sharding_table_index = sharding_table_index;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", status='" + status + '\'' +
                '}';
    }
}