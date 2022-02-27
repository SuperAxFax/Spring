package com.kuang.demo04;

import com.kuang.demo02.UserService;
import com.kuang.demo02.UserServiceImpl;
import com.kuang.demo02.UserserviceTwo;

public class Client {
    public static void main(String[] args) {
        //UserserviceImple userService = new UserserviceImpl();
        UserserviceTwo userService = new UserserviceTwo();
        ProxyInvocationHandler pi = new ProxyInvocationHandler(userService);
        UserService proxy = (UserService) pi.getProxy();
        proxy.add();
    }
}
//使用了动态代理之后，每次只需要改变一下所new的类即可。只要继承了一个
//接口的类，都可以使用一个动态代理来实现！