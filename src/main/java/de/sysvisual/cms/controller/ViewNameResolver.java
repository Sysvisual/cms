package de.sysvisual.cms.controller;

public class ViewNameResolver implements IViewNameResolver {

    public IViewDestinationResolver destinationResolver;

    @Override
    public String resolve(ViewPathInformation info) {
        if(info.host().split(":")[0].equals("localhost")) {
            if(info.uri().equals("/uwu")) {
                return "test2";
            } else if(info.uri().equals("/qwq")) {
                return "test";
            } else {
                return "test";
            }
        } else {
            return "index";
        }
    }
}
