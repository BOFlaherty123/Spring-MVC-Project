package springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.data.User;

import static java.lang.String.format;

/**
 * Description Here
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 19/03/14
 * @project SpringMVC
 */
@Controller
public class FormController {

    /**
     * A simple RequestMapping to return the displayForm.jsp page.
     *
     * @return jsp page (displayForm.jsp)
     */
    @RequestMapping(value="/form", method=RequestMethod.GET)
    public String displayForm() {
        return "displayForm";
    }

    @RequestMapping(value="/submit", method=RequestMethod.POST)
    public String submitForm(User user) {

        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        return "redirect:/form/" + user.getUsername();
    }

    @RequestMapping(value="/form/{username}")
    public void viewUser(@PathVariable(value="username") String username) {
        System.out.println(format("Method: .viewUser(), Username: %s", username));
    }

}
