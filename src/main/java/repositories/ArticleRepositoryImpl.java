package repositories;

import entities.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepositoryImpl implements ArticleRepository{
    private final List<Article> articles = new ArrayList<>();

    public ArticleRepositoryImpl () {
        // initialisation de données pour le démonstration
        articles.add(new Article(1, "Article 1", 10.0, 10));
        articles.add(new Article(2, "Article 2", 20.0, 5));
        articles.add(new Article(3, "Article 3", 30.0, 0));
        articles.add(new Article(4, "Article 4", 40.0, 15)); //
    }
    @Override
    public void save(Article article) {
        articles.add(article);
    }


    @Override
    public void deleteById(int id) {
        articles.removeIf(article -> article.getId() == id);
    }

    @Override
    public void update(int id,Article obj) {
        save(obj);

    }

    
    @Override
    public Article findById(int id) {
         return articles.stream().filter(article -> article.getId() == id).findFirst().orElse(null);
    }



    @Override
    public void deleteAll() {
        articles.clear();
    }
    public List<Article> getAllArticles() {
        return articles;
    }

}
