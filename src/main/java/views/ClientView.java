package views;

import entities.Client;

public interface ClientView {
    public void create(Client value);
    public void destroy();
    public void update(Object value);
    public Object getValue();
    public void show();

}
