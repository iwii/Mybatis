package com.example.paging.controller;

import com.example.paging.dto.CostCenter;
import com.example.paging.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    CityService cityService;


    @RequestMapping( value = "/cities", method = RequestMethod.GET )
    private List<CostCenter> cities() {
        return cityService.getCostCenter("someuserid");
    }

    @RequestMapping( value = "/department", method = RequestMethod.GET )
    private List<String> department(final String userId) {
        return cityService.getAllOrgDetails(userId);
    }
}
