package repositories.interfaces;

import entities.Article;
import repositories.Repository;

public interface ArticleRepo extends Repository<Article> {
    Article findArticleByLibelle(String libelle);

}
