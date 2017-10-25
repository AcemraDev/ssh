package cn.unicom.cz.repository;

import java.io.Serializable;
import java.util.List;
/**
 * Created by jxisme on 17/10/22.
 */

public interface SuperRepository<T,PK extends Serializable>{
    T load(PK id);

    T get(PK id);

    List<T> findAll();

    void persist(T entity);

    PK save(T entity);

    void saveOrUpdate(T entity);

    void delete(PK id);

    void flush();
}