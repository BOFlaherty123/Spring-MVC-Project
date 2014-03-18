package springmvc.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.ui.ModelMap;
import springmvc.data.Data;
import springmvc.data.DataRespository;

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

    private DataRespository dataRespository = mock(DataRespository.class);
    private ModelMap model = mock(ModelMap.class);

    @Test
    public void exampleMethodTest() {

        List<Data> dataList = addData(3);
        when(dataRespository.loadData()).thenReturn(dataList);

        ExampleController controller = new ExampleController(dataRespository);
        assertEquals("example", controller.example(model));
    }

    @Test
    public void testExampleSpringMVCPage() throws Exception {

        List<Data> dataList = addData(10);
        when(dataRespository.loadData()).thenReturn(dataList);

        ExampleController controller = new ExampleController(dataRespository);

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
