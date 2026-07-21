package com.groupeisi.bibliotheque.dao.auteur;

import com.groupeisi.bibliotheque.dao.RepositoryImpl;
import com.groupeisi.bibliotheque.entities.Auteur;
import org.hibernate.SessionFactory;

public class AuteurDao extends RepositoryImpl<Auteur,Long> implements IAuteurDao {
    public AuteurDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
