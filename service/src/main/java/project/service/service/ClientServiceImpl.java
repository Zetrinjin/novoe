package project.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.data.dao.ClientDao;
import project.data.model.ClientDto;
import project.data.model.UserRole;
import project.data.pojo.Client;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientDao clientDao;

    @Override
    public void registration(ClientDto clientDto) {

        Client bankUser = new Client();
        bankUser.setUserName(clientDto.getUserName());
        bankUser.setPassword(clientDto.getPassword());
        bankUser.setRole(UserRole.ROLE_USER.toString());
        clientDao.createUser(bankUser);
    }
}
