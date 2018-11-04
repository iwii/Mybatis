package com.example.paging.controller;

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
    private List<String> city( final String phrase, final int pageSize, final int page) {
        return cityService.sublist("someuserid", phrase, pageSize, page);
    }

    @RequestMapping( value = "/department", method = RequestMethod.GET )
    private List department(final String userId) {
        return cityService.getAllOrgDetails(userId);
    }
}
