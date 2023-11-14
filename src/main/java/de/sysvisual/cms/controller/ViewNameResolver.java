package de.sysvisual.cms.controller;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ViewNameResolver implements IViewNameResolver {

    public IViewDestinationResolver destinationResolver;
    private final String FILE_PATTERN = ".";
    private final String FILE_SPLIT = "\\.";

    @Override
    public String resolve(ViewPathInformation info) {
        if(info.host().split(":")[0].equals("localhost")) {
            if(info.uri().isBlank() || info.uri().equals("/")) {
                return "index";
            }

            //TODO: Get ViewName from Database not by uri
            if(info.uri().contains(FILE_PATTERN)) {
                String[] split = info.uri().split(FILE_SPLIT, Integer.MAX_VALUE);
                String fileName = Stream.of(split).limit(split.length - 1).collect(Collectors.joining("."));

                return fileName.substring(1);
            }
            return info.uri().substring(1);
        } else {
            return "index";
        }
    }
}
