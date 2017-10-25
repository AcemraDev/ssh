package cn.unicom.cz.service;

import java.util.List;
import cn.unicom.cz.entity.User;

/**
 * Created by jxisme on 17/10/22.
 */
public interface UserService {
    Long saveUser();
    public List<User> findAll();
}
