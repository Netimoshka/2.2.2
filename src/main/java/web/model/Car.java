package web.model;

public class Car {

    private String model;
    private long id;
    private String color;

    public Car() {
    }

    public Car(long id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}