package web.models;

public class Car {
    private final String model;
    private final int year;
    private final String colour;

    public Car(String model, int year, String colour) {
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                '}';
    }
}
