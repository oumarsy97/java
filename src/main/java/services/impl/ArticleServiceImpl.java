package services.impl;

import articles.interfaces.ArticleRepo;
import entities.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.ArticleService;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


@Service
public class ArticleServiceImpl implements ArticleService {
    protected ArticleRepo articleRepo;

    @Autowired
    public ArticleServiceImpl(ArticleRepo articleRepo) {
        this.articleRepo = articleRepo;
    }
    @Override
    public Article save(Article article) {
         return articleRepo.save(article);
    }

    @Override
    public Collection<Article> findAll() {
        return articleRepo.findAll();
    }

    @Override
    public Optional<Article> findById(int id) {
         return articleRepo.findById(id);
    }

    @Override
    public Article update(int id,Article article) {
         return articleRepo.save( article);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Article findArticleByLibelle(String libelle) {
        return null;
    }
}
