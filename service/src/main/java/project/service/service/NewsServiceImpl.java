package project.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.data.dao.NewsDao;
import project.data.model.NewsDto;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService{
    @Autowired
    private NewsDao newsDao;
    @Override
    public List<NewsDto> getNewss(int startPosition, int pageSize) {
        try {
            return newsDao.getNews(startPosition, pageSize);
        } catch (Exception e) {
            throw new RuntimeException("Error getting news for page " + startPosition, e);
        }
    }

    @Override
    public int getTotalPage() {
        return newsDao.getTotalCount();
    }
}
