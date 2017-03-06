package com.snowcattle.demo.entity;

/**
 * Created by jiangwenping on 17/3/6.
 * 分表索引
 */
public abstract class AbstractShardingTable {

    private int sharding_table_index;

    public int getSharding_table_index() {
        return sharding_table_index;
    }

    public void setSharding_table_index(int sharding_table_index) {
        this.sharding_table_index = sharding_table_index;
    }
}
