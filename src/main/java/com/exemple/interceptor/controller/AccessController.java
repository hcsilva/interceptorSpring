package com.exemple.interceptor.controller;

import com.exemple.interceptor.interceptorConfig.AccessInterceptor;
import com.exemple.interceptor.model.Access;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("access")
@RestController
public class AccessController {

    @GetMapping
    public List<Access> getAllAccesses(){
        return AccessInterceptor.accesses;
    }

}
