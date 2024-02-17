package project.service.service;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.Authentication;
import project.data.dao.ClientDao;
import project.data.model.ClientDto;
import project.data.pojo.Client;
import project.service.security.AuthenticationService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
@Configuration
@Import(ServiceConfiguration.class)
public class ServiceConfigurationTest {

    /*@Mock
    ClientDao mock;*/
    @Bean
    @Primary
    public ClientDao dao1(){
        /*List<Client> list = new ArrayList<>();
        Client client1= new Client("402880e48dae2662018dae26cb660000","qwe","123","ROLE_USER");
        Client client2= new Client("402880e48dae2662018dae26e72c0001","asd","234","ROLE_USER");
        Client client3= new Client("402880e48dae2662018dae272eec0002","user","user","ROLE_USER");
        Client client4= new Client("aaaabbbbccccddddeeeeffff00000001","admin","admin","ROLE_ADMIN");

        list.add(client1);
        list.add(client2);
        list.add(client3);
        list.add(client4);

        when(mock.getAllUsers()).thenReturn(list);*/

        ClientDao mock = Mockito.mock(ClientDao.class);

        /*doReturn(List.of(
                new ClientDto("402880e48dae2662018dae26cb660000","qwe","123","ROLE_USER"),
                new ClientDto("402880e48dae2662018dae26e72c0001","asd","234","ROLE_USER"),
                new ClientDto("402880e48dae2662018dae272eec0002","user","user","ROLE_USER"),
                new ClientDto("aaaabbbbccccddddeeeeffff00000001","admin","admin","ROLE_ADMIN")
        )).when(mock.getAllUsers());*/
        when(mock.getAllUsers()).thenReturn(List.of(
                new Client("402880e48dae2662018dae26cb660000","qwe","123","ROLE_USER"),
                new Client("402880e48dae2662018dae26e72c0001","asd","234","ROLE_USER"),
                new Client("402880e48dae2662018dae272eec0002","user","user","ROLE_USER"),
                new Client("aaaabbbbccccddddeeeeffff00000001","admin","admin","ROLE_ADMIN")
        ));/*thenReturn(List.of(
                new ClientDto("402880e48dae2662018dae26cb660000","qwe","123","ROLE_USER"),
                new ClientDto("402880e48dae2662018dae26e72c0001","asd","234","ROLE_USER"),
                new ClientDto("402880e48dae2662018dae272eec0002","user","user","ROLE_USER"),
                new ClientDto("aaaabbbbccccddddeeeeffff00000001","admin","admin","ROLE_ADMIN")
        )));*/
        return mock;
    }
}