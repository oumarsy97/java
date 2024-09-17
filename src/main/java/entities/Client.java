package entities;

public class Client {
    private int id;
    private String surnom;
    private String telephone ;
    private String adresse;
    private long userId;

    public Client(int id, String surnom, String telephone, String adresse) {
        this.id = id;
        this.surnom = surnom;
        this.telephone = telephone;
        this.adresse = adresse;

    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurnom() {
        return surnom;
    }

    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
