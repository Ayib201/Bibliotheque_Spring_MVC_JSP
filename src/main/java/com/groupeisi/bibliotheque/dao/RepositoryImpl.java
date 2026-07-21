package com.groupeisi.bibliotheque.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Repository
@Transactional
public class RepositoryImpl<T,I> implements Repository<T,I>{

    private final SessionFactory sessionFactory;

    public RepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session session(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public boolean save(T entity){
        session().persist(entity);
        return true;
    }

    @Override
    public boolean update(T entity){
        session().merge(entity);
        return true;
    }

    @Override
    public List<T> list(Class<T> clazz) {
        return List.of();
    }

    @Override
    public T get(I id, Class<T> clazz) {
        return null;
    }

    @Override
    public List<T> listpaginate(Class<T> clazz, int page, int pageSize) {
        return List.of();
    }

    @Override
    public boolean delete(I id, Class<T> clazz){

        T entity = session().get(clazz,id);

        if(entity==null)
            return false;

        session().remove(entity);

        return true;
    }

}