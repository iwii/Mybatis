package com.example.paging.repository;

import com.example.paging.dto.CostCenter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CityRepo {

    public List<CostCenter> getCostCenters(final String userId) {
        List<CostCenter> costCenters = new ArrayList<>();
        for (int i = 0; i < 20000; i++) {
            costCenters.add(new CostCenter(i + "wroclaw", String.valueOf(i), String.valueOf(i)));
        }
        return costCenters;
    }

}
