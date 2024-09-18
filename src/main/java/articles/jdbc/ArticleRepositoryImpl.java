package repositories.impl;

import database.Database;
import entities.Article;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.CrudRepository;
import repositories.interfaces.ArticleRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArticleRepositoryImpl extends CrudRepository<Article>  implements ArticleRepo {
    private final Database database;

    @Autowired
    public ArticleRepositoryImpl(Database database) {
        super();
        this.database = database;
    }

    @Override
    protected String getTableName() {
        return "articles";
    }

    @Override
    protected Object mapResultSetToEntity(ResultSet rs) throws SQLException {
        return null;
    }

    @Override
    protected void setParameters(PreparedStatement stmt, Object entity) throws SQLException {

    }

    @Override
    public Article findArticleByLibelle(String libelle) {
      return null;
    }


}
