package com.kuang.demo03;

//房东
//他要租房，所以他要继承租房的接口，并重写租房的方法
public class Host implements Rent {
    public void rent(){
        System.out.println("房东要出租房屋！");
    }
}
