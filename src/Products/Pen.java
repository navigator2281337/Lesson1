package Products;

import java.util.Objects;

public class Pen extends Stationery {

    public Pen() {
    }

    public Pen(String color) {
        super(color);
    }

    public Pen(String color, String model) {
        super(color, model);
    }

    public Pen(String color, String model, float size) {
        super(color, model, size);
    }

    public Pen(String color, String model, float size, String city) {
        super(color, model, size, city);
    }

    public Pen(String color, String model, float size, String city, int price) {
        super(color, model, size, city, price);
    }

    public Pen(String color, String model, float size, String city, int price, int amount) {
        super(color, model, size, city, price, amount);
    }

    @Override
    public String toString() {
        return "Pen:" + super.toString();
    }

}
