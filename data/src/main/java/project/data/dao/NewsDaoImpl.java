package project.data.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.data.model.NewsDto;
import project.data.pojo.Client;
import project.data.pojo.News;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class NewsDaoImpl implements NewsDao{

    private final SessionFactory sessionFactory;

    public NewsDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<News> getPagination(int startPosition, int pageSize) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM News", News.class)
                .setFirstResult(startPosition)
                .setMaxResults(pageSize)
                .getResultList();

    }

    @Override
    public List<News> getAllNews() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM News", News.class).getResultList();
    }

    /*@Override
    public Page<News> findPaginated(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        return this.;
    }*/


    @Override
    public int getTotalCount() {
        Session session = sessionFactory.getCurrentSession();
        Long count = session.createQuery("SELECT count(*) FROM news", Long.class)
                .uniqueResult();

        return count.intValue();
    }

    @Override
    public List<NewsDto> getNews(int startPosition, int pageSize) {
        List<News> news = getPagination(startPosition, pageSize);

        return getListNews(news);
    }

    @Override
    public List<NewsDto> getListNews(List<News> newses) {
        List<NewsDto> newsDto = new ArrayList<>();
        for(News news: newses){
            newsDto.add(toDto(news));
        }
        return newsDto;
    }

    @Override
    public NewsDto toDto(News news) {
        NewsDto newsDto =new NewsDto();

        newsDto.setId(news.getId());
        newsDto.setTitle(news.getTitle());
        newsDto.setHeadline(news.getHeadline());

        return newsDto;
    }

    @Override
    public void createNews(NewsDto newsDto) {
        Session session = sessionFactory.getCurrentSession();
        News news= new News(
                newsDto.getId(),
                newsDto.getTitle(),
                newsDto.getHeadline()
        );
        session.persist(news);
    }
}
