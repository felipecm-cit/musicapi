package com.fcm.musicapi.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@Order(1)
public class TransactionFilter implements Filter {

    private final static Logger LOG = LoggerFactory.getLogger(TransactionFilter.class);

    @Override
    public void init(FilterConfig filterConfig) {
        LOG.info("Initializing filter :{}", this);
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        LOG.info("Starting Transaction for req :{}", req.getRequestURI());
        chain.doFilter(request, response);
        LOG.info("Committing Transaction for req :{}", req.getRequestURI());
    }

    @Override
    public void destroy() {
        LOG.warn("Destructing filter :{}", this);
    }

}
