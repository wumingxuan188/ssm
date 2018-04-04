package com.mr.model;

public class Cls {
    private Integer clsId;

    private String clsName;

    public Integer getClsId() {
        return clsId;
    }

    public void setClsId(Integer clsId) {
        this.clsId = clsId;
    }

    public String getClsName() {
        return clsName;
    }

    public void setClsName(String clsName) {
        this.clsName = clsName == null ? null : clsName.trim();
    }
}