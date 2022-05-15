package com.asleepyfish.spring;

import com.asleepyfish.pojo.xml.Address;
import com.asleepyfish.pojo.xml.Student;
import com.asleepyfish.pojo.xml.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/12 15:40
 * @Description: TODO
 */
@SpringBootTest
public class IocTest {
    @Resource
    private Address address;

    @Test
    public void getBeanTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Object student1 = context.getBean("student");
        if (student1 instanceof Student) {
            System.out.println(student1);
        }
        Object student2 = context.getBean("student2");
        if (student2 instanceof Student) {
            System.out.println(student2);
        }
        Object student3 = context.getBean("student3");
        if (student2 instanceof Student) {
            System.out.println(student3);
        }
        Object student4 = context.getBean("student4");
        if (student2 instanceof Student) {
            System.out.println(student4);
        }
        Object studentP = context.getBean("studentP");
        if (studentP instanceof Student) {
            System.out.println(studentP);
        }
        Object studentC = context.getBean("studentC");
        if (studentC instanceof Student) {
            System.out.println(studentC);
        }
    }

    @Test
    public void scopeTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Object student = context.getBean("student");
        Object student2 = context.getBean("student");
        System.out.println(student == student2);
    }

    @Test
    public void getUserTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("animals.xml");
        Object user = context.getBean("user");
        if (user instanceof User) {
            ((User) user).getCat().shout();
            ((User) user).getDog().shout();
        }
        Object user2 = context.getBean("user2");
        if (user instanceof User) {
            ((User) user).getDog().shout();
            ((User) user).getCat().shout();
        }
    }

    @Test
    public void getProduct() {
/*        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Object product = context.getBean("product");
        if (product instanceof Product) {
            System.out.println(product);
        }*/
    }

    @Test
    public void getAddress() {
        System.out.println(address.getName());
    }
}
