package com.example.paging.dto;

public class CostCenter {
    private String name;
    private String value;
    private String parentId;

    public CostCenter(final String name, final String value, final String parentId){
        this.name = name;
        this.value = value;
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
