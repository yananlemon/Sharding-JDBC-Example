package site.ilemon.shardingjdbcwithspringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.ilemon.ShardingJdbcWithSpringbootApplication;
import site.ilemon.shardingjdbcwithspringboot.dao.OrderDao;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ShardingJdbcWithSpringbootApplication.class})
public class ShardingJdbcWithSpringbootApplicationTests {

    @Autowired
    private OrderDao orderDao;
    @Test
    public void testInsertOrder(){
        for (int i = 0 ; i<10; i++){
            orderDao.insertOrder(new BigDecimal((i+1)*5),1L,"WAIT_PAY");
        }
    }

    @Test
    public void testSelectOrderbyIds(){
        List<Long> ids = new ArrayList<>();
        ids.add(591954876368420864L);
        ids.add(591954875957379073L);
        List<Map> maps = orderDao.selectOrderByIds(ids);
        System.out.println(maps);
    }


}
