package cn.unicom.cz.service;

import cn.unicom.cz.entity.Role;

import java.util.List;

/**
 * Created by jxisme on 17/10/22.
 */
public interface RoleService {
    Integer saveRole();
    public List<Role> findAll();
}
