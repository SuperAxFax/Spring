package com.kuang.demo01;

//中介
public class Proxy implements Rent{
    private Host host;

    //无参构造
    public Proxy() {
    }
    //有参构造
    public Proxy(Host host) {
        this.host = host;
    }

    //下面是中介可以做的方法
    //传给中介的是哪个用户，中介就调谁去租房
    public  void rent(){
        host.rent();
        //把方法放在重写的方法中可以方便管理
        seeHouse();
        fee();
    }

    //看房和收中介费是房东做不了的事情，这也就是代理类存在的原因，可以做一些
    //真实角色也就是房东做不了的事情。
    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    //收中介费
    public void fee(){
        System.out.println("收中介费");

    }}
