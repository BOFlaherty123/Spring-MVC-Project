package springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import springmvc.model.User;

/**
 * @SessionAttributes - Specifies that a model attribute should be stored in the session, in this example a 'User' object
 * is stored in the session and displayed on a different .jsp page (example.jsp) once the user has pressed submit on the
 * form.
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 24/03/14
 * @project SpringMVC
 */
@Controller
@SessionAttributes("userObj")
public class UserController {

    private final static String ACCEPTABLE_USERNAME = "username";
    private final static String ACCEPTABLE_PASSWORD = "password";

    @RequestMapping(value="/userDisplay")
    public ModelAndView userPage() {
        return new ModelAndView("userDisplay", "user-entity", new User());
    }

    @RequestMapping(value="/process-user", method = RequestMethod.POST)
    public ModelAndView processUser(@ModelAttribute User user) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("example");
        modelAndView.addObject("userObj", user);

        return modelAndView;
    }

    /*
        Spring Web Flow User Methods
     */
    public boolean saveUser(User user) {
        System.out.println(".saveUser()");

        // Could save the User object to the database here.
        if(user.getFirstName() != null) {
            System.out.println(user.getFirstName());
            System.out.println(user.getLastName());
            System.out.println(user.getUsername());
        }

        return true;
    }

    public boolean isUserRegistered(User user) {
        System.out.println(".isUserRegistered()");

        boolean isUserRegistered = false;

        if(user.getUsername().equals(ACCEPTABLE_USERNAME) &&
                user.getPassword().equals(ACCEPTABLE_PASSWORD)) {

            System.out.println("username: " + user.getUsername());
            System.out.println("password: " + user.getPassword());

            isUserRegistered = true;
        }

        return isUserRegistered;
    }

}