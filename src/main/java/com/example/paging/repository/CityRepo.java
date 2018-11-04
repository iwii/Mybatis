package com.example.paging.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CityRepo {

    public List<String> getCostCenters(final String userId) {
        List<String> cities = new ArrayList<>();
        for (int i = 0; i < 20000; i++) {
            cities.add("wroclaw" + i);
        }
        return cities;
    }
}
