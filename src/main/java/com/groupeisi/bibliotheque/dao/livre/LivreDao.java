package com.groupeisi.bibliotheque.dao.livre;

import com.groupeisi.bibliotheque.dao.RepositoryImpl;
import com.groupeisi.bibliotheque.entities.Livre;
import org.hibernate.SessionFactory;

public class LivreDao extends RepositoryImpl<Livre,Long> implements ILivreDao {
    public LivreDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
