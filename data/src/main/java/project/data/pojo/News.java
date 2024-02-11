package project.data.pojo;

import jakarta.persistence.*;

@Entity
@Table(name = "t_news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "headline")
    private String  headline;

    public News() {
    }

    public News(int id, String title, String headline) {
        this.id = id;
        this.title = title;
        this.headline = headline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }
}
