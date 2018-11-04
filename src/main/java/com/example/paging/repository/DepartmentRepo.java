package com.example.paging.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepo {

    public List<String> getAllOrgDetails(final String userId) {
        List<String> departments = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            departments.add("dolnoslaskie" + i);
        }
        return  departments;
    }
}
