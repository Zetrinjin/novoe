package project.service.service;

import project.data.dao.ClientDao;
import project.data.model.ClientDto;

public interface ClientService {

    void registration(ClientDto clientDto);
}
