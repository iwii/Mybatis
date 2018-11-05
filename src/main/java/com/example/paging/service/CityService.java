package com.example.paging.service;

import com.example.paging.dto.CostCenter;

import java.util.List;

public interface CityService {

    List<CostCenter> getCostCenter(final String userId);

    List<CostCenter> getCostCenter(final String userId, final String phrase, final int pageSize, final int page);

    //List<String> getPage(int size, int page, List<String> list);

    List<String> getAllOrgDetails(final String userId);

}
