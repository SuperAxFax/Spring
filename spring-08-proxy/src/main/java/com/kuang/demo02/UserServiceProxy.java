package com.kuang.demo02;


//每继承一个类，一定要重写里面的所有方法
//为了解决上面那个既想增加日志的功能，又不想改变原有代码的情况。我们使用代理就可轻松解决
//相当于中介
public class UserServiceProxy implements UserService{
    //代理角色要做的就是代理真实角色，也就是UserServiceImpl
    private UserServiceImpl userService;

    //setter方法可以代替有参构造


    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;

    }

    //set方法
   /* public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }*/

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.add();
    }

    public void update() {
        log("update");
        userService.add();
    }

    public void query() {
        log("query");
        userService.add();
    }

    //日志方法
    public void log(String msg){
        System.out.println("使用了" +msg + "方法");
    }
}
