package project.web.webCon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import project.data.dao.NewsDao;
import project.data.pojo.News;

import java.util.List;

@Controller
public class NewsWin {

    @Autowired
    NewsDao newsDao;

    /*@GetMapping(value = "/news")
    public String getNews() {
        return "news";
    }*/

    @GetMapping(value = "/news")
    public String takeNews(Model model){

        List<News> news = newsDao.getAllNews();
        model.addAttribute("newsList",news);

        return "news";
    }
}
