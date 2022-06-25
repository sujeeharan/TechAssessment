package com.example.demo;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
public class AuthenticationFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;

        if(!(request.getHeader("username").equals("username")
                && !request.getHeader("password").equals("password"))){
            System.out.println(String.format("Logging Request  "+((HttpServletRequest) req).getRequestURI()));

        }
        chain.doFilter(req,res);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
