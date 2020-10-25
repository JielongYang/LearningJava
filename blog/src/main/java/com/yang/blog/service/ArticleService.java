package com.yang.blog.service;

import com.yang.blog.entity.Article;
import org.springframework.stereotype.Service;


@Service
public interface ArticleService {

     Article getArticleById(Integer id);
     void postArticle(Article article);
}
