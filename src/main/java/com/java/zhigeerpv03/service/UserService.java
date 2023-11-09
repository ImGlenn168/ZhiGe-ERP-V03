package com.java.zhigeerpv03.service;

import com.java.zhigeerpv03.dao.user.UserDao;
import com.java.zhigeerpv03.entity.User;
import com.java.zhigeerpv03.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Result loginUser(User user) {
        try {
            User loginUser = userDao.loginUser(user.getUname(), user.getPassword());
            if (loginUser != null) {
                return Result.success(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.fail();
    }


    public Result findByUserName(User user) {
        try {
            User byUserName = userDao.findByUserName(user.getUname());
            if (byUserName != null) {
                return Result.success(byUserName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.fail();
    }

    public Result addUser(User user) {
        try {
            int i = userDao.addUser(user);
            if (i > 0) {
                return Result.success();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.fail();
    }


}
