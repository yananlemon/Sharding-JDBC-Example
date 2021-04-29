package site.ilemon.shardingjdbcwithspringboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * <p></p>
 *
 * @author Andy.Yan
 */
@Mapper
public interface OrderDao {
    /**
     * 新增订单
     * @param price 订单价格
     * @param userId 用户id
     * @param status 订单状态
     * @return
     */
    int insertOrder(@Param("price") BigDecimal price, @Param("userId")Long userId,
                    @Param("status")String status);

    /**
     * 根据id列表查询多个订单
     * @param orderIds 订单id列表
     * @return
     */
    List<Map> selectOrderByIds(@Param("orderIds") List<Long> orderIds);
}
