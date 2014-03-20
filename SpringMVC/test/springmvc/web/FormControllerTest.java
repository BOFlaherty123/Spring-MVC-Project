package springmvc.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Description Here
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 19/03/14
 * @project SpringMVC
 */
public class FormControllerTest {

    @Test
    public void testFormControllerDisplay() throws Exception {

        FormController controller = new FormController();

        MockMvc mockmvc = standaloneSetup(controller).build();

        mockmvc.perform(get("/user"))
                .andExpect(view().name("displayForm"));

    }

    @Test
    public void testFormControllerInput() throws Exception {

        FormController controller = new FormController();

        MockMvc mockmvc = standaloneSetup(controller).build();

        mockmvc.perform(post("/user")
                .param("firstName", "Joe")
                .param("lastName", "Bloggs")
                .param("username", "JoeBloggs")
                .param("password", "abc123"))
                .andExpect(redirectedUrl("/form/JoeBloggs"));

    }

}
