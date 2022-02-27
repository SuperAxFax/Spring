package com.kuang.demo02;
//相当于租房者
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        //userService.add();
        UserServiceProxy Proxy = new UserServiceProxy(userService);
        //如果使用的是有参构造写成UserServiceProxy Proxy = new UserServiceProxy(userService);即可
        //但是这个使用的是set，所以要写成这个格式
       // Proxy.setUserService(userService);
        Proxy.add();
    }
}
