package homework10;

import java.util.Objects;
import java.util.Random;

public class User implements Cloneable{
    private final String name;
    private final String surname;
    private final int id;

    public User(String name, String surname,int id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User name is " + name
                + "\nSurname is " + surname
                + "\nId is " + id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return id == user.id && Objects.equals(this.name, user.name) && Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname,id);
    }
}
