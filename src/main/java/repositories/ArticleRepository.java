package repositories;

import entities.Article;

import java.util.List;

interface ArticleRepository{
    void save(Article obj);
    void deleteById(int id);
    void update(int id,Article obj);
    Article findById(int id);
    List<Article> getAllArticles();
    void deleteAll();

}