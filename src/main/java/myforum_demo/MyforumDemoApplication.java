package myforum_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("myforum_demo.mapper")
@SpringBootApplication
public class MyforumDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyforumDemoApplication.class, args);
    }
}
