package com.zy;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by Administrator on 2017/2/18.
 * 测试一个实体类
 */
public class Demo {
    private int id;

    @JSONField(serialize = false)
    private String remarks;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @JSONField(format = "yyyy-mm-dd HH:MM:SS")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
