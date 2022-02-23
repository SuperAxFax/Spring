package com.kuang.pojo;

public class User {
    private String name;

    //User的无参构造是默认存在，写或者是不写在系统中一直会存在
    public User(){
        System.out.println("User的无参构造！");
    }

    //User的有参构造
    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name="+name);
    }

}
