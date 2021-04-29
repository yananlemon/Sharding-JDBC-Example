package site.ilemon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "site.ilemon.shardingjdbcwithspringboot.dao")
public class ShardingJdbcWithSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcWithSpringbootApplication.class, args);
    }

}
