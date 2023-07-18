package myforum_demo;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;
import myforum_demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyforumDemoApplicationTests {

    @Test
    void contextLoads() {
        Teacher teacher = new Teacher("赵瑞","28","23");
        Student student = new Student("赵瑞","23","34","zhouhuiqing","zhaojun");
        BeanUtil.copyProperties(teacher,student);
        System.out.println(teacher);
        System.out.println(student);
    }

}
@Data
class  Teacher {
    String name ;
    String age ;
    String level;

    public Teacher(String name, String age, String level) {
        this.name = name;
        this.age = age;
        this.level = level;
    }
}
@Data
class  Student{
    String name ;
    String age ;
    String level;
    String mother;
    String father;

    public Student(String name, String age, String level, String mother, String father) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.mother = mother;
        this.father = father;
    }
}