package com.example.DesignPatternIOC.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


@WebFilter(urlPatterns = "/home")
public class UserAgentFilter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(UserAgentFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String userAgentHeader = ((HttpServletRequest) servletRequest).getHeader("User-Agent");
        log.info("User Agent: {}", userAgentHeader);

        // 只允許 Chrome 瀏覽器通過
        if (userAgentHeader.contains("Chrome")) filterChain.doFilter(servletRequest, servletResponse);
        else servletRequest.getRequestDispatcher("/WEB-INF/jsp/denied.jsp").forward(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
