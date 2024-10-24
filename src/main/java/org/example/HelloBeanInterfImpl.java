package org.example;

import jakarta.ejb.Stateless;

@Stateless
public class HelloBeanInterfImpl implements HelloBeanInterf {
    @Override
    public String sayHello(String msg) {
        return "hello world : " + msg ;
    }
}
