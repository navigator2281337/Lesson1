package Products;

public class Pencil extends Stationery {
    public Pencil() {
    }

    public Pencil(String color) {
        super(color);
    }

    public Pencil(String color, String model) {
        super(color, model);
    }

    public Pencil(String color, String model, float size) {
        super(color, model, size);
    }

    public Pencil(String color, String model, float size, String city) {
        super(color, model, size, city);
    }

    public Pencil(String color, String model, float size, String city, int price) {
        super(color, model, size, city, price);
    }

    public Pencil(String color, String model, float size, String city, int price, int amount) {
        super(color, model, size, city, price, amount);
    }

    @Override
    public String toString() {
        return "Pencil:" + super.toString();
    }
}
