package com.demo.service.impl;

        import com.demo.dao.UserDao;
        import com.demo.entity.User;
        import com.demo.service.UserService;
        import org.springframework.stereotype.Service;

        import javax.annotation.Resource;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public User findUserById(int id) {
        return userDao.getUserById(id);
    }
}
