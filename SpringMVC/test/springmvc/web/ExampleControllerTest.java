package springmvc.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.ui.ModelMap;
import springmvc.model.data.Data;
import springmvc.model.data.DataRepository;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Description Here
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 18/03/14
 * @project SpringMVC
 */
public class ExampleControllerTest {

    private DataRepository dataRepository = mock(DataRepository.class);
    private ModelMap model = mock(ModelMap.class);

    @Test
    public void exampleMethodTest() {

        List<Data> dataList = addData(3);
        when(dataRepository.loadData()).thenReturn(dataList);

        ExampleController controller = new ExampleController(dataRepository);
        assertEquals("example", controller.example(model));
    }

    @Test
    public void testExampleSpringMVCPage() throws Exception {

        List<Data> dataList = addData(10);
        when(dataRepository.loadData()).thenReturn(dataList);

        ExampleController controller = new ExampleController(dataRepository);

        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/"))
                .andExpect(status().is(200))
                .andExpect(view().name("example"))
                .andExpect(model().attributeExists("data"))
                .andExpect(model().attribute("data", hasItems(dataList.toArray())));

    }

    private List<Data> addData(int count) {
        List<Data> dataList = new ArrayList();

        for (int i=0; i < count; i++) {
            dataList.add(new Data(format("name %s", i), format("value %s", i)));
        }

        return dataList;
    }

}
