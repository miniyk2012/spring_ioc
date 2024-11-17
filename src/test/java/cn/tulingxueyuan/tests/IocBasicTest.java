package cn.tulingxueyuan.tests;

import cn.tulingxueyuan.beans.Person;
import cn.tulingxueyuan.service.IUserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocBasicTest {
  ApplicationContext ioc;
  @Before
  public void before(){
    // 加载spring容器
    //ApplicationContext spring的顶层核心接口
    // ClassPathXmlApplicationContext 根据项目路径的xml配置来实例化spring容器
    // FileSystemXmlApplicationContext 根据磁盘路径的xml配置来实例化spring容器
    // AnnotationConfigApplicationContext 根据javaconfig 来配置实例化spring容器
    // 在容器实例化的时候 就会加载所有的bean
    ioc=new ClassPathXmlApplicationContext("spring-basic.xml");
  }

  @Test
  public  void test01() {
    System.out.println("Spring已加载");
  }


  @Test
  public  void test06() {
    IUserService userService = ioc.getBean(IUserService.class);
    userService.getUser();
  }
}
