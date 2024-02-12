package project.data.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.data.pojo.Client;

import java.util.List;
@Repository
@Transactional
public class ClientDaoImpl implements ClientDao{

    private final SessionFactory sessionFactory;

    public ClientDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void createUser(Client client) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(client);

    }

    @Override
    public Client getUserById(String id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Client.class, id);
    }

    @Override
    public void updateUser(Client client) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(client);

    }

    @Override
    public boolean deleteUser(Client client) {
        Session session = sessionFactory.getCurrentSession();
        if (client == null) return false;
        session.remove(client);
        return true;

    }

    @Override
    public List<Client> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM User", Client.class).getResultList();
    }

    @Override
    public List<Client> findByUserName(String username) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Client where username= :username", Client.class)
                .setParameter("username", username)
                .list();
    }

    @Override
    public Client findByUserNameOne(String username) {
        Session session = sessionFactory.getCurrentSession();
        String hql = "FROM Client where username = :username";
        Query<Client> query = session.createQuery(hql,Client.class);
        query.setParameter("username", username);
        return query.uniqueResult();
    }

}
