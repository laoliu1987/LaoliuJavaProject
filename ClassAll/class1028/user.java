package ClassAll.class1028;

import java.io.Serializable;

public class user implements Serializable {

    private static final long serialVersionUID=1L;
    private int id;
    public user(){}
    public user(int id, String name){
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String name;

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
