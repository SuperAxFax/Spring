package com.kuang.demo01;

//租房者
public class Client {
    public static void main(String[] args) {
        //如果我们可以找到房东这样写当然可以，但是我们找不到
        /*Host host = new Host();
        host.rent();*/

        //new这个host的目的主要还是让房东传到中介那，好让中介使用房东中的方法
        Host host = new Host();
        //代理,也就是中介。代理房东来进行租房。
        Proxy proxy = new Proxy(host);
        proxy.rent();//通过代理来租房子，也就是调用的中介中重写的rent函数
       /*//如果前面重写的host方法中已经写过这几个方法名了，那么这几个方法就会自动调用。
        proxy.seeHouse();
        proxy.fee();*/
    }
}
