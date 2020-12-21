package io.hans.coder.springbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @描述 BeanPostProcessor 测试类
 * @author Hans
 * @created 2020/12/13 21:07
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out
                .println("BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改！");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out
                .println("BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改！");
        return bean;
    }


}
