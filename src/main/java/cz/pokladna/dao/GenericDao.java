package cz.pokladna.dao;

import java.util.List;

/**
 *
 * @author Michal
 */
public interface GenericDao<E, K> {
    void add (E entity);
    void update (E entity);
    void remove (E entity);
    E find (K key);
    List<E> list();
}
