package com.kuang.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//我们会使用这个类自动生成代理类！
//在动态代理的时候我们要使用InvocationHandler来实现一个类
public class ProxyInvocationHandler implements InvocationHandler{

    //1:被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }


    // Foo f = (Foo) Proxy.newProxyInstance(Foo.classs.getClassLoader(), new Class<?>[] {Foo.class}, handler);
    //2:生成得到代理类
    public Object getProxy(){
        //Proxy是反射包下的
        //这段代码不要怕，它是死的，只要修改rent就可以了。
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    //这个是对InvocationHandler中唯一的一个方法进行重写
    //3:作用是处理代理实例，并返回结果。就是处理被代理的人就是房东，然后返回结果。
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        seeHouse();
        //动态代理的本质，就是使用反射机制实现！
        Object result = method.invoke(rent, args);
        return result;
    }

    public void seeHouse(){
        System.out.println("中介带看房子");
    }
}
