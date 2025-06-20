package com.example.flightapi.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class BaseController {
    /**
     * 获取当前请求的HttpSession对象
     * @return 当前会话的HttpSession实例
     * @throws IllegalStateException 当不在HTTP请求线程中调用时抛出
     */
    protected HttpSession getCurrentSession() {
        ServletRequestAttributes attributes = (ServletRequestAttributes)
                RequestContextHolder.getRequestAttributes();
        if (attributes == null) {
            throw new IllegalStateException("当前不在HTTP请求上下文中");
        }
        return attributes.getRequest().getSession();
    }

    protected Object getSessionAttribute(String key) {
        return getCurrentSession().getAttribute(key);
    }

    protected void setSessionAttribute(String key, Object value) {
        getCurrentSession().setAttribute(key, value);
    }
}
