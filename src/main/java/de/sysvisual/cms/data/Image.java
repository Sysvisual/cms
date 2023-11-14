package de.sysvisual.cms.data;

import java.util.Map;

public record Image(String path, Integer width, Integer height, Map<String, String> metadata) {

    private static final Map<String, String> EMPTY_MAP = Map.of();

    public Image(String path) {
        this(path, 200, 200, EMPTY_MAP);
    }

}
