package services;

import entities.Item;

import javax.persistence.*;
import java.util.List;

public class ItemServices {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    EntityManager e = emf.createEntityManager();

    public Item findById(int id){
        return e.find( Item.class, id );
    }

    public List<Item> findAll(){
        TypedQuery<Item> q = e.createQuery("SELECT i from item i", Item.class);
        return q.getResultList();
    }

    public void update(Item item){
        //e.merge(item); this wont persist
        e.getTransaction().begin();
        e.merge(item);
        e.getTransaction().commit();
        //UPDATE `local`.`item` SET `name` = 'Water' WHERE (`id` = '8');
    }

    public void create(Item item){
//        e.createNativeQuery("INSERT INTO item (name,price) VALUES( ?,?);")
//                .setParameter(1,item.getName())
//                .setParameter(2,item.getPrice());
        e.getTransaction().begin();
        e.persist(item);
        e.getTransaction().commit();

    }
//    delete()
}
