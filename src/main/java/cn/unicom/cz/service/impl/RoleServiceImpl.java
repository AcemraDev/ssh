package cn.unicom.cz.service.impl;

import cn.unicom.cz.entity.Role;
import cn.unicom.cz.repository.RoleRepository;
import cn.unicom.cz.service.RoleService;
import cn.unicom.cz.utils.CurrentDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jxisme on 17/10/22.
 */

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private CurrentDate currentDate;

    public Integer saveRole() {
        Role role = new Role();
        role.setArea("群星聚会");
        role.setName("时时");
        role.setAccount("304131191@qq.com");
        role.setCoin("0.0");

        role.setSs_time(currentDate.getCurrentDate(0));
        role.setS_status("公示");
        role.setSe_time(currentDate.getCurrentDate(7));

        role.setFs_time(currentDate.getCurrentDate(0));
        role.setF_status("寄售");
        role.setFe_time(currentDate.getCurrentDate(7));

        role.setTs_time(currentDate.getCurrentDate(0));
        role.setT_status("寄售");
        role.setTe_time(currentDate.getCurrentDate(7));


        return roleRepository.save(role);
    }

    public List<Role> findAll(){
        return roleRepository.findAll();
    }
}