package project.data.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.data.pojo.Cards;

@Repository
@Transactional
public class CardsDaoImpl implements CardsDao{

    private final SessionFactory sessionFactory;

    public CardsDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void createCard(Cards cards) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(cards);

    }

    @Override
    public Cards getCardById(String id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Cards.class, id);

    }

    @Override
    public void updateCard(Cards cards) {

        Session session = sessionFactory.getCurrentSession();
        session.merge(cards);
    }

    @Override
    public boolean deleteCard(Cards cards) {
        Session session = sessionFactory.getCurrentSession();
        if (cards == null) return false;
        session.remove(cards);
        return true;

    }

    @Override
    public Cards getCardByNumber(String cardNumber) {
        Session session = sessionFactory.getCurrentSession();
        String hql = "FROM Cards where cardNumber = :cardnumber";
        Query<Cards> query = session.createQuery(hql,Cards.class);
        query.setParameter("cardnumber", cardNumber);
        return query.uniqueResult();
    }

}
