package com.groupeisi.bibliotheque.dao.emprunteur;

import com.groupeisi.bibliotheque.dao.RepositoryImpl;
import com.groupeisi.bibliotheque.entities.Emprunteur;
import org.hibernate.SessionFactory;

public class EmprunteurDao extends RepositoryImpl<Emprunteur,Long> implements IEmprunteurDao {
    public EmprunteurDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
