package project.data.dao;

import project.data.pojo.Client;

import java.util.List;

public interface ClientDao {
    void createUser(Client client);
    Client getUserById(String id);

    void updateUser(Client client);

    boolean deleteUser(Client client);

    List<Client> getAllUsers();

    List<Client> findByUserName(String username);

    Client findByUserNameOne(String username);
}
