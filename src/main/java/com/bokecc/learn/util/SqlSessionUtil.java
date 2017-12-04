package com.bokecc.learn.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    private SqlSessionUtil() {
    }

    private static final Class CLASS_LOCK = SqlSessionUtil.class;
    private static SqlSessionFactory factory = null;

    private static SqlSessionFactory initSqlSessionFactory() {
        if (factory == null) {
            synchronized (CLASS_LOCK) {
                if (factory == null) {
                    InputStream inputStream = null;
                    try {
                        inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    factory = new SqlSessionFactoryBuilder().build(inputStream);
                }
            }
        }
        return factory;
    }

    public SqlSession getSqlSession() {
        initSqlSessionFactory();
        return factory.openSession();
    }
}
