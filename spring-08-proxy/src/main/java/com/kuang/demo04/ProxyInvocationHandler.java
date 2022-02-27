package com.kuang.demo04;

import com.kuang.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//我们会使用这个类自动生成代理类！
//在动态代理的时候我们要使用InvocationHandler来实现一个类
public class ProxyInvocationHandler implements InvocationHandler{

    //1:被代理的接口
    private Object target;

    public ProxyInvocationHandler() {
    }

    public ProxyInvocationHandler(Object target) {
        this.target = target;
    }

    //2:生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    //这个是对InvocationHandler中唯一的一个方法进行重写
    //3:作用是处理代理实例，并返回结果。就是处理被代理的人就是房东，然后返回结果。
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现！
        log(method.getName());//通过反射得到方法的名字
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
