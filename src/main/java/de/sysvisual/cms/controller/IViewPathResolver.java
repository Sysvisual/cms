package de.sysvisual.cms.controller;

import jakarta.servlet.ServletRequest;

public interface IViewPathResolver {

    ViewPathInformation resolve(ServletRequest request);

}
