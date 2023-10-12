package de.sysvisual.cms.controller;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ViewPathResolver implements IViewPathResolver {

    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Override
    public ViewPathInformation resolve(ServletRequest request) {
        // HttpRequest
        if(request instanceof HttpServletRequest httpRequest) {
            return new ViewPathInformation(httpRequest.getHeader("Host"),
                    httpRequest.getRemotePort(),
                    httpRequest.getRequestURI(),
                    httpRequest.getQueryString());
        }

        // Other
        LOGGER.warn("Got unexpected request type, request is no instance of HttpServletRequest");
        return new ViewPathInformation(request.getRemoteHost(),
                request.getRemotePort(),
                null,
                null);
    }
}
