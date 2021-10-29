package ru.suptex.Dao;

import java.util.List;

public interface Dao<Entity, Key> {
    Entity findById (Key key);
    List<Entity> findAll ();
    void save (Entity entity);
    void update (Entity entity);
    void delete (Key key);
}
