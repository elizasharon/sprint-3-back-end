package com.pack.apigateway;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;


public class SimpleFilter extends ZuulFilter {
	
	private static Logger Log = LoggerFactory.getLogger(SimpleFilter.class);
	
	@Override
	public Object run() throws ZuulException {

		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest request = context.getRequest();
		Log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURI().toString()));
		return null;
	}

	@Override
	public boolean shouldFilter() {

		return true;
	}

	@Override
	public int filterOrder() {

		return 1;
	}

	@Override
	public String filterType() {

		return "pre";
	}



}
