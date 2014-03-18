package springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Java DispatcherServlet Spring MVC Configuration file
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 18/03/14
 * @project SpringMVC
 */
@Configuration
@EnableWebMvc
// Ensures that the DispatcherServlet knows which packages in the application to scan for annotations (@Controller etc)
@ComponentScan("springmvc.web")
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * @EnableWebMvc - enables Spring MVC (as default class configuration)
     *
     *      - There is no view resolver configured, Spring will default to using BeanNameViewResolver.
     *      - Component-scanning isn't enabled. The only way Spring will find any controllers is if we declare them
     *      explicitly in the configuration class
     *      - As it stands, DispatcherServlet is mapped as the default servlet for the applicaton and will handle all
     *      requests, including requests for static resources (images, stylesheets etc)
     *
     */

    /**
     * Defines the ViewResolver for the Spring MVC application, in this example an InternalResourceViewResolver
     * which is pointed at finding views in /WEB-INF/views with a suffix of .jsp
     *
     * @return
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);

        return resolver;

    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

}