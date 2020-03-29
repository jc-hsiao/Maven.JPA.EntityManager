package services;

import entities.Item;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public abstract class Services<T> {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    EntityManager e = emf.createEntityManager();

    public T findById(Class<T> classType , int id){
        return e.find( classType , id );
    }

    public List<T> findAll(Class<T> classType){
        TypedQuery<T> q = e.createQuery("SELECT i from " + classType.getSimpleName() +" i", classType);
        return q.getResultList();
    }

    public void update(T t){
        e.getTransaction().begin();
        e.merge(t);
        e.getTransaction().commit();
    }

    public void create(T t){
        e.getTransaction().begin();
        e.persist(t);
        e.getTransaction().commit();

    }

    public void delete(Class<T> classType, int id){
        T t = findById(classType, id);
        e.getTransaction().begin();
        e.remove(t);
        e.getTransaction().commit();
    }

}
