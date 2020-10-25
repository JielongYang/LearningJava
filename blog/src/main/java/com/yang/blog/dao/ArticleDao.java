package com.yang.blog.dao;

import com.yang.blog.entity.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDao {
    @Insert("insert into article_content(content)values(#{content})")
    void save(Article article);

    @Select("select * from article_content where id = #{id}")
    Article getArticleById(Integer id);

}
