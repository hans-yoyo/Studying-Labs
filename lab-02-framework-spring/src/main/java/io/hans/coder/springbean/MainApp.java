package io.hans.coder.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @描述 TODO 类描述
 * @author Hans
 * @created 2020/12/13 21:11
 */
public class MainApp {

    public static void main(String[] args) {
        // 容器初始化
        ApplicationContext appContext = new ClassPathXmlApplicationContext("springBeanTest/beans.xml");
        System.out.println("容器初始化成功");
        // 获取 PersonBean
        PersonBean personBean = appContext.getBean("person", PersonBean.class);
        System.out.println(personBean);
        // 关闭容器
        System.out.println("开始关闭容器");
        ((ClassPathXmlApplicationContext) appContext).registerShutdownHook();

    }

}

