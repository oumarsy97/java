package services;

import repositories.ArticleRepository;
import java.util.List;
import java.util.Optional;
import entities.Article;


public class ArticleService {
    private final ArticleRepository articleRepository;
    public ArticleService() {
        this.articleRepository = new ArticleRepository();
    }
    public List<Article> findAll() {
        return articleRepository.findAll();
    }
    public Optional<Article> findById(int id) {
        return articleRepository.findById(id);
    }
    public boolean deleteById(int id) {
        Optional<Article> articleOptional = articleRepository.findById(id);
        if (articleOptional.isPresent()) {
            articleRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
