package com.example;

// Import necessary classes.
import java.util.Date;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// Liferay specific classes. These include log strings and log functions.
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

// Initialize a new class that implements javax.servlet.Filter.
public class LiferayIPAddressFilter implements Filter {
	public void init(FilterConfig config) throws ServletException {
		logger.error("Init method being called");

// Gets the initial parameter.
		String intiParamValue = config.getInitParameter("initparam");
		logger.error("intiParamValue: " + intiParamValue);
	}
	public void doFilter(ServletRequest request, ServletResponse response,
		FilterChain chain) throws java.io.IOException, ServletException{
		logger.error("DoFilter method being called");
// Gets the IPAdress of the client.
		String clientIPAddress = request.getRemoteAddr();
// Display or save the IP address of requested client.
		logger.error("Requested Client IP Address: " + clientIPAddress + ", Time "
		+ new Date().toString());
// Passes the request down the filter chain.
		chain.doFilter(request, response);
	}
// This method will be executed when the application is undeployed.
// This will also be called if the server is stopped.
	public void destroy() {
		logger.error("Destroy method being called");
	}
// Logger that retrieves the class name.
	private static final Log logger = LogFactoryUtil.getLog(
	LiferayIPAddressFilter.class);
}


