/*
package project.service.security;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import project.data.dao.ClientDao;
import project.data.pojo.Client;
import project.service.service.ServiceConfigurationTest;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ServiceConfigurationTest.class)
public class AuthenticationServiceTest {

    @Autowired
    AuthenticationService authenticationService;

    @Autowired
    ClientDao dao1;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void loadUserByUsername() {
        String name = "qwe";

        //тут у нас сама настройка метода
        UserDetails result = authenticationService.loadUserByUsername(name);

        assertNotNull(result);


    }
}*/
