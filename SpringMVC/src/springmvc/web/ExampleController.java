package springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Description Here
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 18/03/14
 * @project SpringMVC
 */
@Controller
public class ExampleController {

    @RequestMapping(value="/example", method=RequestMethod.GET)
    public String example() {
        System.out.println("Example Controller Hit Successfully");

        return "example";
    }

}
