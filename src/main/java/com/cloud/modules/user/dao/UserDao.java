package com.cloud.modules.user.dao;

import com.cloud.common.CurdDao;
import com.cloud.modules.user.entity.User;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

/**
 * Created by lisu on 2017/2/28.
 */
public interface UserDao extends CurdDao<User> {
    @Cacheable(key = "#userId", value = "users")
    User findById(String userId);

    @CachePut(key = "#userId", value = "user")
    void addUser(User user);
}
