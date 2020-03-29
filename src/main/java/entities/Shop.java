package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Shop {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    int id;
    String name;
    String type;

    @OneToMany()
    Set<Witch> witches = new HashSet<>();

    @ManyToMany()
    Set<Item> items = new HashSet<>();


    public Shop(){}

    public Shop(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
