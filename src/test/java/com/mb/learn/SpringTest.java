package com.mb.learn;

import com.mb.learn.po.Role;
import com.mb.learn.po.StudentBean;
import javafx.application.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Created by lijm on 2017/12/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/bean.xml" })
public class SpringTest {
    @Autowired
    Role role;
    @Autowired
    StudentBean studentBean;

    @Test
    public void testBean() {
        System.out.println(role);
        System.out.println(studentBean);
    }
}
