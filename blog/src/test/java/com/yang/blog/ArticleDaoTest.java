package com.yang.blog;


import com.yang.blog.dao.ArticleDao;
import com.yang.blog.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArticleDaoTest {
    @Autowired
    ArticleDao articleDao;

    @Test
    void save() {
        Article article = new Article();
        article.setContent("test");
        articleDao.save(article);
    }

    @Test
    void getArticleById() {
        Article article = articleDao.getArticleById(1);
        System.out.println(article.getContent());
    }
}
