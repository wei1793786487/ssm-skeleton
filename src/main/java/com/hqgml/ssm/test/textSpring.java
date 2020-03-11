package com.hqgml.ssm.test;

import com.hqgml.ssm.service.impl.IuserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Devil
 * @date 2020/3/11 17:27
 */
public class textSpring {

    @Test
    public void run1(){
         //加载配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        IuserServiceImpl bean = ac.getBean(IuserServiceImpl.class);
        //调用方法
        bean.findAll();
    }
}
