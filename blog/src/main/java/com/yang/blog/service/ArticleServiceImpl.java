package com.yang.blog.service;

import com.yang.blog.dao.ArticleDao;
import com.yang.blog.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    ArticleDao articleDao;

    @Override
    public Article getArticleById(Integer id) {
        return articleDao.getArticleById(id);
    }

    @Override
    public void postArticle(Article article) {
        articleDao.save(article);
    }
}
