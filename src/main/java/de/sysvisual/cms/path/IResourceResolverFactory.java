package de.sysvisual.cms.path;

import org.springframework.web.servlet.resource.ResourceResolver;

public interface IResourceResolverFactory {

    ResourceResolver resolve(String... paths);

}
