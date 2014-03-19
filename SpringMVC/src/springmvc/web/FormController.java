package springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.User;

import javax.validation.Valid;

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
    @RequestMapping(value="/user", method=RequestMethod.GET)
    public String displayForm(ModelMap model) {

        model.addAttribute(new User());

        return "displayForm";
    }

    /**
     * The form (in the jsp) does not require an 'action' tag because when the form is submitted, it will be posted back
     * to the same URL path that displayed it, in this case '/user'.
     *
     * The submitted form model is output to the console and then the method redirects us to a URL with the request mapping
     * of '/form/{username}'.
     *
     * @param user
     * @return
     */
    @RequestMapping(value="/user", method=RequestMethod.POST)
    public String submitForm(@Valid User user, Errors errors) {

        // If any of the validation annotations (@NotNull etc) fail, errors.hasErrors() will be equal to true.
        if(errors.hasErrors()) {

            System.out.println("number of errors: " + errors.getErrorCount());

            return "displayForm";
        }

        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        return "redirect:/form/" + user.getUsername();
    }

    @RequestMapping(value="/form/{username}")
    public String viewUser(@PathVariable(value="username") String username, ModelMap model) {
        System.out.println(format("Method: .viewUser(), Username: %s", username));

        model.addAttribute("userName", username);

        return "account";
    }

}
