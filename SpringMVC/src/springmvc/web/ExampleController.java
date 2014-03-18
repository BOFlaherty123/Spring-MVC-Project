package springmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.data.Data;
import springmvc.data.DataRespository;

import java.util.List;

/**
 * Description Here
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

    private DataRespository dataRespository;

    @Autowired
    public ExampleController(DataRespository dataRespository) {
        this.dataRespository = dataRespository;
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

        List<Data> data = dataRespository.loadData();
        model.addAttribute("data", data);

        return "example";
    }

}
