package corelab.structurededonnees.lescollections.lesmap.sortedMap.aveccomparator;

import java.util.Objects;

public class Utilisateur {

    private int id;
    private String name;
    private int age;

    public Utilisateur(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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


    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Utilisateur that)) return false;

        return id == that.id && Objects.equals(name, that.name) && Objects.equals(age, that.age);
    }


    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(age);
        return result;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
