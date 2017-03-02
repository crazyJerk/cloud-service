package com.cloud.modules.user.service;

import com.cloud.common.CurdService;
import com.cloud.modules.user.dao.UserDao;
import com.cloud.modules.user.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lisu on 2017/2/28.
 */
@Service
public class UserService extends CurdService<UserDao, User> {

    public User getUserInfo(String userId) {
        return dao.findById(userId);
    }

    @Transactional
    public String addUser(User user) {
        dao.addUser(user);
        return "success";
    }
}
