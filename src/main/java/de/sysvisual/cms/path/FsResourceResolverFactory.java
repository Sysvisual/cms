package de.sysvisual.cms.path;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.resource.PathResourceResolver;
import org.springframework.web.servlet.resource.ResourceResolver;

import java.io.File;
import java.util.List;

@Component
public class FsResourceResolverFactory implements IResourceResolverFactory {

    @Override
    public ResourceResolver resolve(String... paths) {
        if(paths == null) {
            return new PathResourceResolver();
        }

        PathResourceResolver resourceResolver = new PathResourceResolver();

        for(String path : paths) {
            resourceResolver.setAllowedLocations(new FileSystemResource(new File(path)));
        }

        return resourceResolver;
    }

    @Bean(name = "fsResourceResolver")
    public ResourceResolver resolve(@Value("${cms.template.assetPaths}") List<String> paths) {
        if(paths == null) {
            return resolve((String[]) null);
        }

        return resolve(paths.toArray(new String[0]));
    }
}
