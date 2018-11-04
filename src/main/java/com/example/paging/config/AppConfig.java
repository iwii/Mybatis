package com.example.paging.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan("com.example.paging")
@EnableCaching
@EnableWebMvc
public class AppConfig {

    @Bean
    public InternalResourceViewResolver  resolver() {
        InternalResourceViewResolver resolver
                = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public CacheManager costCenterCacheManager() {
        return new ConcurrentMapCacheManager("costCenters");
    }

    /*@Bean
    public CacheManager allOrgDetailsCacheManager() {
        return new ConcurrentMapCacheManager("allOrgDetails");
    }*/
}
