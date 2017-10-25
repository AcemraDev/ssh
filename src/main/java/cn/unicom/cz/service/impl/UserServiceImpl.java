package cn.unicom.cz.service.impl;

import cn.unicom.cz.entity.User;
import cn.unicom.cz.repository.UserRepository;
import cn.unicom.cz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jxisme on 17/10/22.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public Long saveUser() {
        User user = new User();
        user.setEmail("304131191@qq.com");
        user.setFirstname("chen");
        user.setLastname("Acemra");
        user.setPhone("18676800640");
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}