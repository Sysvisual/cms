package de.sysvisual.cms.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Pattern;

public class TemplatePathFactory {

    private final static Logger LOGGER = LoggerFactory.getLogger(TemplatePathFactory.class);

    public static String create(String path) {
        boolean isAbsolutePath = Pattern.compile("^[A-Z]:.*").matcher(path).matches();

        if (isAbsolutePath) {
            LOGGER.debug("Using absolute file Path");
            return "file:".concat(path);
        } else {
            return "classpath:".concat(path);
        }
    }

}
