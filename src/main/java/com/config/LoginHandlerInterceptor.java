package com.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//登录拦截器  先登录
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("login");
        if(loginUser==null){
            request.setAttribute("msg","没有权限，请先登录");
            request.getRequestDispatcher("/").forward(request,response);
            return false;
        }else {
            return true;
        }
    }
}
