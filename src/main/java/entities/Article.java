package entities;

public class Article {
    private int id;



    private String libelle;
    private double prix;
    private int qte;

    // Constructeur
    public Article(int id, String libelle, double prix,int qte ) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
        this.qte = qte;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", prix=" + prix + '\''+
                ", qte" + qte+
                '}';
    }
}
