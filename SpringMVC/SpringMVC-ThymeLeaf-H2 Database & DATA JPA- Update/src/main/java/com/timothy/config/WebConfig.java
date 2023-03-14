package com.timothy.config;

import com.timothy.util.Mappings;
import com.timothy.util.ViewNames;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController(Mappings.WELCOME_PAGE).setViewName(ViewNames.WELCOME_PAGE);
        registry.addViewController(Mappings.ADD_DATA_PAGE).setViewName(ViewNames.ADD_DATA_PAGE);
        registry.addViewController(Mappings.EDIT_DATA_PAGE).setViewName(ViewNames.EDIT_DATA_PAGE);
        registry.addViewController(Mappings.VIEW_DATA_PAGE).setViewName(ViewNames.VIEW_DATA_PAGE);
        registry.addViewController(Mappings.DELETE_DATA_PAGE).setViewName(ViewNames.DELETE_DATA_PAGE);

        registry.addViewController(Mappings.ADD_ERROR_PAGE).setViewName(ViewNames.ADD_ERROR_PAGE);
        registry.addViewController(Mappings.DELETE_ERROR_PAGE).setViewName(ViewNames.DELETE_DATA_PAGE);
        registry.addViewController(Mappings.EDIT_ERROR_PAGE).setViewName(ViewNames.EDIT_ERROR_PAGE);
    }
}
