package com.exemple.interceptor.config;

import com.exemple.interceptor.interceptorConfig.AccessInterceptor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        // '/**' indicates that all urls will be intercepted
       registry.addInterceptor(new AccessInterceptor()).addPathPatterns("/**");
    }
}
