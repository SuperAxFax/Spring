package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService {

    //想要调用dao层的方法，因此要引入它
    private UserDao userDao; //= new UserDaoOracleImpl();
    //每次用户进行不同的请求我们都需要改动业务层的实现代码，这是个很垃圾的程序

    //修改前（把代码写死了）
    //=================================================================================
    //修改后（使用set注入更加灵活）
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser() {
        //由于测试可以得到业务层和dao层中的方法名一定要相同。
        userDao.getUser();
    }
}
