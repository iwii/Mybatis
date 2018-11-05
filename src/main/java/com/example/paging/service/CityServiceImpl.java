package com.example.paging.service;

import com.example.paging.dto.CostCenter;
import com.example.paging.repository.CityRepo;
import com.example.paging.repository.DepartmentRepo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Component( "cityService" )
public class CityServiceImpl implements CityService {

    @Autowired
    CityRepo cityRepo;

    @Autowired
    DepartmentRepo departmentRepo;

    @Override
    @Cacheable( cacheNames = "costCenters", cacheManager = "costCenterCacheManager" )
    public List<CostCenter> getCostCenter(String userId) {
        return cityRepo.getCostCenters(userId);
    }

    @Cacheable( cacheNames = "costCenters", cacheManager = "costCenterCacheManager" )
    public List<CostCenter> getCostCenter(String userId, String phrase, int size, int page) {

        Optional<List<CostCenter>> costCenters = Optional.ofNullable(this.getCostCenter(userId));
        int startIndex = page * size;

        return costCenters
                .map(List::stream).orElseGet(Stream::empty)
                .filter(Objects::nonNull)
                .filter(this.buildPhrasePredicate(phrase))
                .skip(startIndex)
                .limit(size)
                .collect(Collectors.toList());
    }

    private Predicate<CostCenter> buildPhrasePredicate(final String phrase){
        return costCenter -> StringUtils.isBlank(phrase) || Optional.ofNullable(costCenter)
                .map(CostCenter::getName)
                .map(String::toLowerCase)
                .filter(v -> v.contains(phrase.toLowerCase()))
                .isPresent();
    }

//    public List<String> getData(CityRepo cityRepo, String userId){
//        return   this.getPage(CityRepo.getSize(), model.getPage(), ofNullable(userId)
//                .filter(StringUtils::isNotBlank)
//                .map(ServiceWithData::someCacheMethod)
//                .map(List::stream).orElseGet(Stream::empty)
//                .filter(v -> StringUtils.isBlank(model.getPhrase()) ||
//                        ofNullable(model.getPhrase())
//                                .map(String::toLowerCase)
//                                .filter(phr -> v.toLowerCase().contains(phr)).isPresent())
//                .collect(Collectors.toList()));
//    }


    @Override
    // @Cacheable(cacheNames = "allOrgDetails", cacheManager = "allOrgDetailsCacheManager")
    public List<String> getAllOrgDetails(final String userId) {
        return departmentRepo.getAllOrgDetails(userId);
    }
}
