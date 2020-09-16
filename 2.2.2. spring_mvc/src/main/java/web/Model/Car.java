package web.Model;

import java.io.Serializable;

public class Car  implements Serializable {

    public Car() {
    }

    public Car(int id, String name, String owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    private int id;

    private String name;

    private String owner;

    public Integer getId() {
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
