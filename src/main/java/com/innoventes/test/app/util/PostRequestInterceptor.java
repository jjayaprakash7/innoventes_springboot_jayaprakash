package com.innoventes.test.app.util;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.innoventes.test.app.dto.CompanyDTO;

@Component
public class PostRequestInterceptor implements HandlerInterceptor {
    
    private final ObjectMapper objectMapper;
    
    public PostRequestInterceptor(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getMethod().equalsIgnoreCase("POST")) {
            CompanyDTO companyDTO = objectMapper.readValue(request.getInputStream(), CompanyDTO.class);
            if (!isValidURL(companyDTO.getWebSiteURL())) {
                companyDTO.setWebSiteURL(null);
                request.setAttribute("companyDTO", objectMapper.writeValueAsString(companyDTO));
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }

    private boolean isValidURL(String url) {
        return url != null && !url.isEmpty();
    }
}
