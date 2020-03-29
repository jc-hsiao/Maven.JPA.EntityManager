package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Witch {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    int id;
    String name;
    int age;
    String orbColor;

    public Witch(){}

    public Witch(int id, String name, int age, String orbColor) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.orbColor = orbColor;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOrbColor() {
        return orbColor;
    }

    public void setOrbColor(String orbColor) {
        this.orbColor = orbColor;
    }
}
