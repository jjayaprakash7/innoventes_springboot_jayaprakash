package com.innoventes.test.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.innoventes.test.app.util.PostRequestInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
//
//    private final PostRequestInterceptor postRequestInterceptor;
//
//    public WebMvcConfig(PostRequestInterceptor postRequestInterceptor) {
//        this.postRequestInterceptor = postRequestInterceptor;
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(postRequestInterceptor);
//    }
}
