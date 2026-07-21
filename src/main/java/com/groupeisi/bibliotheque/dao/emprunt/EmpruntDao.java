package com.groupeisi.bibliotheque.dao.emprunt;

import com.groupeisi.bibliotheque.dao.RepositoryImpl;
import com.groupeisi.bibliotheque.entities.Emprunt;
import org.hibernate.SessionFactory;

public class EmpruntDao extends RepositoryImpl<Emprunt,Long> implements IEmpruntDao {
    public EmpruntDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
