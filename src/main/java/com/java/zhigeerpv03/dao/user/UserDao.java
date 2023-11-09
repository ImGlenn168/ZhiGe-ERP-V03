package com.java.zhigeerpv03.dao.user;

import com.java.zhigeerpv03.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

@Mapper
public interface UserDao {

    @SelectProvider(value = UserSqlProvider.class, method = "findByUserName")
    User findByUserName(String name);

    @UpdateProvider(value = UserSqlProvider.class, method = "addUser")
    int addUser(User user);

    @SelectProvider(value = UserSqlProvider.class, method = "loginUser")
    User loginUser(String name, String pwd);
}
