package com.example.be.configs;

import com.example.be.filters.LoggingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<LoggingFilter> loggingFilterBean() {
        FilterRegistrationBean<LoggingFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        // set the filter instance
        filterRegistrationBean.setFilter(new LoggingFilter());
        // Define URL patterns to which the filter should be applied
        filterRegistrationBean.addUrlPatterns("/api/*");
        return filterRegistrationBean;
    }
}
