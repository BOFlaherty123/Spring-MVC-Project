package springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * ContextLoadListener Context
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 18/03/14
 * @project SpringMVC
 */
@Configuration
@ComponentScan(basePackages={"springmvc"},
        excludeFilters={
                @ComponentScan.Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)
        })
public class RootConfig {


}
