package project.data.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import project.data.DataConfigurationTest;
import project.data.DataSourceTest;
import project.data.model.NewsDto;
import project.data.pojo.News;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataConfigurationTest.class)
@TestPropertySource(value = "classpath:test.liquibase.properties")
public class NewsDaoImplTest {

    @Autowired
    NewsDao newsDao;
    Connection conn;

    @Before
    public void setUp() throws Exception {
        conn= DataSourceTest.getConnection();
        conn.createStatement().executeUpdate("DELETE FROM t_news;");
    }

    @After
    public void tearDown() throws Exception {
        conn=DataSourceTest.getConnection();
        conn.createStatement().executeUpdate("DELETE FROM t_news;");
        conn.close();
    }
    @Test
    public void getPagination() {
    }

    @Test
    public void getAllNews() throws SQLException, ClassNotFoundException {
        Connection conn = DataSourceTest.getConnection();
        conn.createStatement().executeUpdate("insert into t_news (news_id, title, headline) values\n" +
                "            (1,'news12','headline1'),\n" +
                "            (2,'news13','headline2'),\n" +
                "            (3,'news14','headline3')");
        conn.close();

        /*List<News> expectedNews = new ArrayList<>();*/


        List<News> actualNews= newsDao.getAllNews();

        assertNotNull(actualNews);
        /*assertEquals(expectedNews.size(),actualNews.size());*/
        assertEquals(3,actualNews.size());
        assertEquals("news12",actualNews.get(0).getTitle());
        assertEquals("news13",actualNews.get(1).getTitle());
        assertEquals("news14",actualNews.get(2).getTitle());


    }

    @Test
    public void getTotalCount() {
    }

    @Test
    public void getNews() {
    }

    @Test
    public void getListNews() {
    }

    @Test
    public void toDto() {
    }

   /* @Test
    public void createNews() throws SQLException {
        NewsDto newsDto = new NewsDto(12, "news12","headline12");

        newsDao.createNews(newsDto);


        ResultSet resultSet = conn.createStatement().executeQuery("SELECT count(*) FROM t_news");
        resultSet.next();
        int actualCount = resultSet.getInt(1);
        assertEquals(2, actualCount);
    }*/
}