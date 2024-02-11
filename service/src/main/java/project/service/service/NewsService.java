package project.service.service;

import project.data.model.NewsDto;

import java.util.List;

public interface NewsService {

    List<NewsDto> getNewss(int startPosition, int pageSize);

    int getTotalPage();
}
