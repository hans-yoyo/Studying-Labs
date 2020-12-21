package io.hans.coder.springbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @描述 Spring Bean 生命周期测试类
 * @author Hans
 * @created 2020/12/13 20:54
 */
public class PersonBean implements BeanFactoryAware, BeanNameAware,
        InitializingBean, DisposableBean {

    private String name;

    private String address;

    private int age;

    private BeanFactory beanFactory;

    private String beanName;

    public PersonBean() {
        System.out.println("【构造器】调用构造器实例化");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("【注入属性】注入属性name");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("【注入属性】注入属性address");
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("【注入属性】注入属性age");
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }


    /**
     * @描述 这是BeanFactoryAware接口方法
     * @author Hans
     * @created 2020/12/13 21:00
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()");
        this.beanFactory = beanFactory;
    }

    /**
     * @描述 这是BeanNameAware接口方法
     * @author Hans
     * @created 2020/12/13 21:01
     */
    @Override
    public void setBeanName(String name) {
        System.out.println("【BeanNameAware接口】调用BeanNameAware.setBeanName()");
        this.beanName = name;
    }


    /**
     * @描述 这是 DiposibleBean 接口方法
     * @author Hans
     * @created 2020/12/13 21:05
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("【DiposibleBean接口】调用DiposibleBean.destory()");
    }

    /**
     * @描述 这是InitializingBean接口方法
     * @author Hans
     * @created 2020/12/13 21:01
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【InitializingBean接口】调用InitializingBean.afterPropertiesSet()");
    }

    /**
     * @描述 通过<bean>的init-method属性指定的初始化方法
     * @author Hans
     * @created 2020/12/13 21:19
     */
    public void myInit() {
        System.out.println("【init-method】调用<bean>的init-method属性指定的初始化方法");
    }

    /**
     * @描述 通过<bean>的destroy-method属性指定的初始化方法
     * @author Hans
     * @created 2020/12/13 21:19
     */
    public void myDestory() {
        System.out.println("【destroy-method】调用<bean>的destroy-method属性指定的初始化方法");
    }
}
