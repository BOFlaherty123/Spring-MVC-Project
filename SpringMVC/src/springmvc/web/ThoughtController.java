package springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description Here
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 24/03/14
 * @project SpringMVC
 */
@Controller
@SessionAttributes("thought")
public class ThoughtController {

    @RequestMapping(value="/sessionForm")
    public ModelAndView sessionForm() {
        return new ModelAndView("sessionForm");
    }

    @RequestMapping(value="/remember", method = RequestMethod.POST)
    public ModelAndView rememberThought(@RequestParam String thoughtParam)  {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("thought", thoughtParam);
        modelAndView.setViewName("sessionForm");

        return modelAndView;
    }

}
