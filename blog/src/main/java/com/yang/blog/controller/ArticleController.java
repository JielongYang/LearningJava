package com.yang.blog.controller;
import com.yang.blog.entity.Article;
import com.yang.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping("article/{id}")
    public Article getArticleById(Integer id) {
        return articleService.getArticleById(id);
    }

    @PostMapping("article")
    public void postArticle(Article article) {
        articleService.postArticle(article);
    }
}
