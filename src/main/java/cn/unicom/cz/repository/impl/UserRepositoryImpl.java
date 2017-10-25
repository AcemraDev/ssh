package cn.unicom.cz.repository.impl;

import cn.unicom.cz.entity.User;
import cn.unicom.cz.repository.UserRepository;
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
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    public User load(Long id) {
        return (User)getCurrentSession().load(User.class,id);
    }

    public User get(Long id) {
        return (User)getCurrentSession().get(User.class,id);
    }

    public List<User> findAll() {
        String sql = " from User ";
        Query query =  getCurrentSession().createQuery(sql);
        List<User> list = query.list();

        return list;
    }

    public void persist(User entity) {
        getCurrentSession().persist(entity);
    }

    public Long save(User entity) {
        return (Long)getCurrentSession().save(entity);
    }

    public void saveOrUpdate(User entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    public void delete(Long id) {
        User user = load(id);
        getCurrentSession().delete(user);
    }

    public void flush() {
        getCurrentSession().flush();
    }
}
