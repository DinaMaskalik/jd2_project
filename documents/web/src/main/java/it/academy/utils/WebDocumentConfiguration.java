package it.academy.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "it.academy")
public class WebDocumentConfiguration {

    @Bean
    InternalResourceViewResolver internalResourceViewResolver(){

        InternalResourceViewResolver viewResolver =
                new InternalResourceViewResolver();

        viewResolver.setSuffix(".jsp");
        viewResolver.setPrefix("/WEB-INF/jsp/");

        return viewResolver;
    }
}
