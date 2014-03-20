package springmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.model.data.Data;
import springmvc.model.data.DataRepository;

import java.util.List;

/**
 * Example Spring MVC controller (basic setup)
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 18/03/14
 * @project SpringMVC
 */

/*
 Defines that this class is a Spring MVC Controller. We could have used @Component, as it has the same effect, but is
 less descriptive.

 This annotation is picked up by @ComponentScan defined within WebConfig.class

*/
@Controller
public class ExampleController {

    private DataRepository dataRepository;

    @Autowired
    public ExampleController(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    /**
     * @RequestMapping - The value attribute specifies the request path that this method will handle, while the method
     * attribute details the HTTP method that it can handle, in this case GET.
     *
     * Handles a GET request for /WEB-INF/views/example.jsp
     *
     * @return example jsp page (view)
     */
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String example(ModelMap model) {
        System.out.println("Example Controller Hit Successfully");

        List<Data> data = dataRepository.loadData();
        model.addAttribute("data", data);

        return "example";
    }

    /**
     * Query Parameter Example
     *
     * This method takes two parameter values in the requests URL using @RequestParam to retrieve the value
     *
     * http://localhost:8080/SpringMVC/requestMapping?max=100&count=30
     *
     * 'defaultValue' is used to define a default value if the user does not specific a max or count value in the URL.
     *
     * @param max - max value of model objects to be returned
     * @param count number of model objects to be displayed
     * @return
     */
    @RequestMapping(value="/queryParamter", method=RequestMethod.GET)
    public List<Data> exampleOfQueryParameters(@RequestParam(value="max", defaultValue = "10") long max,
                                                 @RequestParam(value="count", defaultValue = "5") long count) {

        return dataRepository.LoadData(max, count);
    }

    /**
     * Request Mapping Example
     *
     * http://localhost:8080/SpringMVC/requestMapping/1
     *
     * As a general rule, query parameters should not be used to identify a resource, we should use requestMapping and
     * @PathVariable indicates that whatever value is at the placeholder position ({...} in the request path will be passed
     * into the handler method's 'id' parameter.
     *
     * @param id value (id) of the model object to be displayed
     */
    @RequestMapping(value="/requestMapping/{id}")
    public void exampleOfRequestMapping(@PathVariable("id") String id) {
        System.out.println("ID: " + id);
    }

}
