package homework10;

import java.util.GregorianCalendar;
import java.util.Objects;

public class User implements Cloneable {
    private final String name;
    private final String surname;
    private final int age;
    private long id;

    public User(String name, String surname,int age, long id){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User name is " + name
                + "\nSurname is " + surname
                + "\nHis age " + age
                + "\nId is " + id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return id == user.id && age == user.age && Objects.equals(this.name, user.name) && Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, id);
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
    public User deepClone() throws CloneNotSupportedException {
        User cloneUser = (User) super.clone();
        cloneUser.id = this.id;
        return cloneUser;
    }
}
