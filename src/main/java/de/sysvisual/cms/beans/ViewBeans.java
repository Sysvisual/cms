package de.sysvisual.cms.beans;

import de.sysvisual.cms.controller.IViewNameResolver;
import de.sysvisual.cms.controller.IViewPathResolver;
import de.sysvisual.cms.controller.ViewNameResolver;
import de.sysvisual.cms.controller.ViewPathResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ViewBeans {

    @Bean
    public IViewNameResolver viewNameResolver() {
        return new ViewNameResolver();
    }

    @Bean
    public IViewPathResolver viewPathResolver() {
        return new ViewPathResolver();
    }

}
