package cn.unicom.cz.repository.impl;

import cn.unicom.cz.entity.Role;
import cn.unicom.cz.repository.RoleRepository;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jxisme on 17/10/22.
 */
@Repository
public class RoleRepositoryImpl implements RoleRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    public Role load(Integer id) {
        return (Role)getCurrentSession().load(Role.class,id);
    }

    public Role get(Integer id) {
        return (Role) getCurrentSession().get(Role.class,id);
    }

    public Role get(Long id) {
        return (Role) getCurrentSession().get(Role.class,id);
    }

    public List<Role> findAll() {
        String sql = " from Role ";
        Query query =  getCurrentSession().createQuery(sql);
        List<Role> list = query.list();

        return list;
    }

    public void persist(Role entity) {
        getCurrentSession().persist(entity);
    }

    public Integer save(Role entity) {
        return (Integer) getCurrentSession().save(entity);
    }

    public void saveOrUpdate(Role entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    public void delete(Integer id) {
        Role role = load(id);
        getCurrentSession().delete(role);
    }

    public void flush() {
        getCurrentSession().flush();
    }
}
