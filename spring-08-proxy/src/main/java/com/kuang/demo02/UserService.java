package com.kuang.demo02;
//新的需求，在每次输出的时候，给出一个日志功能
//基本的思路是在每一个方法都加上sout，但是不推荐。因为编程有一个原则是尽量不要改变原有代码
//相当于租房这个抽象角色
public interface UserService {
    public void add();
    public void delete();
    public void update();
    public void query();

}
