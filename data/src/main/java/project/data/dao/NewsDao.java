package project.data.dao;

import project.data.model.NewsDto;
import project.data.pojo.Client;
import project.data.pojo.News;

import java.util.List;

public interface NewsDao {
    List<News> getPagination(int startPosition, int pageSize);

    /*Page<News> findPaginated(int pageNo, int pageSize);*/

     List<News> getAllNews();

    int getTotalCount();

    List<NewsDto> getNews(int startPosition, int pageSize);

    List<NewsDto> getListNews(List<News> news);

    NewsDto toDto(News news);

    void createNews(NewsDto newsDto);
}
