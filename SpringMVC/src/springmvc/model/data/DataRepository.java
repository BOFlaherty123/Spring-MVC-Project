package springmvc.model.data;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Description Here
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 18/03/14
 * @project SpringMVC
 */
@Component
public class DataRepository {

    public List<Data> loadData() {

        List<Data> dataList = new ArrayList();
        dataList.add(new Data("name", "value"));

        return dataList;
    }

    public List<Data> LoadData(long max, long count) {

        List<Data> dataList = new ArrayList();

        System.out.println("max: " + max);
        System.out.println("count: " + count);

        return dataList;
    }

}
