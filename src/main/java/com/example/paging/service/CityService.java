package com.example.paging.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CityService {

     List<String> getCostCenter(final String userId);

     List<String> sublist (String userId, String phrase, int pageSize, int page);

    //List<String> getPage(int size, int page, List<String> list);

     List<String> getAllOrgDetails(final String userId);

}
