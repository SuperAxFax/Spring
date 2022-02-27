package com.kuang.demo03;

public class Client {
    public static void main(String[] args) {


    //真实角色
    Host host = new Host();

    //代理角色：现在没有
    //代理角色还没有实现接口，就是通过下面这句来实现接口
    ProxyInvocationHandler pi = new ProxyInvocationHandler();

    //将真实角色host房东传入动态代理类中的set方法。
    pi.setRent(host);
    //调用动态生成的代理类
    Rent proxy = (Rent) pi.getProxy();//这里的proxy是动态生成的。
    //调用真实角色的方法
    proxy.rent();
    }
}
//感想：我觉得动态代理最方便的地方在于它不用每次都要在代理类中implements对应的接口。而是直接继承一个
//InvocationHandler接口，然后在租房者这个类中再通过new ProxyInvocationHandler中
//实现对应的接口。这就是与静态代理的区别。如果真实角色很多，每次只需改动动态代理中的
//rent方法，与租房者中的host单词就可以了。十分简便。