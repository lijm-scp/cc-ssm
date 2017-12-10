package com.mb.learn.test;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by lijm on 2017/12/10.
 */
public class HelloServiceCglib implements MethodInterceptor{
    private Object target;
    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("--------------CGLIB动态代理---------------");
        System.out.println("-----------准备say hello -----------------");
        methodProxy.invokeSuper(o, objects);
        System.out.println("-----------已经say hello -----------------");
        return null;
    }

    public static void main(String[] args) {
        HelloServiceCglib h = new HelloServiceCglib();
        HelloBean hb = (HelloBean) h.getInstance(new HelloBean());
        hb.sayHello("lll");
    }
}
