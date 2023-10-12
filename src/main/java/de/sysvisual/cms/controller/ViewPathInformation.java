package de.sysvisual.cms.controller;

public record ViewPathInformation(String host, int port, String uri, String queryString) {

    @Override
    public String host() {
        return host;
    }

    @Override
    public int port() {
        return port;
    }

    @Override
    public String uri() {
        return uri;
    }

    @Override
    public String queryString() {
        return queryString;
    }
}
