package springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Description Here
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 18/03/14
 * @project SpringMVC
 */
public class SpringMVCInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /*
        Any class that extends AbstractAnnotationConfigDispatcherServletInitializer will automatically be used to
        configure DispatcherServlet and the spring application context in the application's servlet context

     */

    /**
     * Loads the applications context (ContextLoadListener) which is used to load middle-tier and data-tier components
     * that drive the backend of the application.
     *
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {
                RootConfig.class
        };
    }

    /**
     * Loads the application context with the beans defined in WebConfig (MVC related beans)
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {
                WebConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {
                "/"
        };
    }

}