package com.exemple.interceptor.interceptorConfig;

import com.exemple.interceptor.model.Access;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AccessInterceptor implements HandlerInterceptor {

    public static List<Access> accesses = new ArrayList<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Access access = new Access();
        access.setPath(request.getRequestURI());
        access.setAcessDateTime(LocalDateTime.now());

        request.setAttribute("access", access);

        return true;
    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        Access access = (Access) request.getAttribute("access");
        access.setAcessDuration(Duration.between(access.getAcessDateTime(), LocalDateTime.now()));
        accesses.add(access);
    }
}
