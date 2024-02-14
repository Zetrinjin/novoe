package project.data.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import project.data.DataConfigurationTest;
import project.data.pojo.Client;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataConfigurationTest.class)
public class ClientDaoImplTest {

    @Autowired
    ClientDao clientDao;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createUser() {
    }

    @Test
    public void getUserById() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void getAllUsers() {
    }

    @Test
    public void findByUserName() {
        //Given
        String adminUserName = "qwe";
        //When
        List<Client> results = clientDao.findByUserName(adminUserName);
        //Then
        assertEquals(1, results.size());
        assertEquals("123", results.get(0).getPassword());
    }

    @Test
    public void findByUserNameOne() {

    }
}