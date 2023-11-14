package de.sysvisual.cms.controller;

import de.sysvisual.cms.data.Image;
import de.sysvisual.cms.data.Product;
import de.sysvisual.cms.data.Storage;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ViewController {

    @Value("${cms.template.assetPaths}")
    private List<String> assetPaths;

    private final IViewNameResolver viewNameResolver;
    private final IViewPathResolver viewPathResolver;

    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    public ViewController(@Autowired IViewNameResolver viewNameResolver, @Autowired IViewPathResolver viewPathResolver) {
        this.viewNameResolver = viewNameResolver;
        this.viewPathResolver = viewPathResolver;
    }

    @RequestMapping(path="/*", method = RequestMethod.GET)
    public String init(@ModelAttribute("model") ModelMap model, HttpServletRequest request) {
        ViewPathInformation viewPathInformation = viewPathResolver.resolve(request);
        String viewName = viewNameResolver.resolve(viewPathInformation);

        // TODO: Check if Site has Data
        if(viewName.equals("produkte")) {
            // TODO: Retrive actual Data related to Site
            model.addAttribute("produkte", Storage.getProducts());
        }

        LOGGER.info("Requested Url: ".concat(request.getRequestURI()));

        return viewName;
    }
}
