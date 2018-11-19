package com.example.paging.dto;

import java.util.Collections;
import java.util.List;

public class AllorgDetails {
    private List<String> biRoles;
    private List<String> hrDepartments;

    public static AllorgDetails createEmptyObject(){
        AllorgDetails result = new AllorgDetails();
        result.setBiRoles(Collections.emptyList());
        result.setHrDepartments(Collections.emptyList());
        return result;
    }

    public List<String> getBiRoles() {
        return biRoles;
    }

    public List<String> getHrDepartments() {
        return hrDepartments;
    }

    public void setBiRoles(List<String> biRoles) {
        this.biRoles = biRoles;
    }

    public void setHrDepartments(List<String> hrDepartments) {
        this.hrDepartments = hrDepartments;
    }
}
