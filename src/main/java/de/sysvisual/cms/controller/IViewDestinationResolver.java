package de.sysvisual.cms.controller;

public interface IViewDestinationResolver {

    String resolve(String viewName, ViewPathInformation pathInfo);

}
