/*package project.web.webCon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import project.data.model.NewsDto;
import project.service.service.NewsService;

import java.util.List;

@Controller
public class NewsWindow {

    @Autowired
    private NewsService newsService;

    @GetMapping(value = "/news")
    public String getNews() {
        return "news";
    }

    @PostMapping("/news")
    public String takeNews(@PathVariable("page") int page, Model model){
        int pageSize =3;
        List<NewsDto> news = newsService.getNewss(page,pageSize);
        model.addAttribute("news",news);
        *//*int totalNews = newsService.getTotalPage();
        int totalPages = (int) Math.ceil((double) totalNews / pageSize);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("currentPage", page);*//*
        return "news";
    }
}*/
