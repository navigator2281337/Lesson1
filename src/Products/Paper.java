package Products;

public class Paper extends Stationery {
    public Paper() {
    }

    public Paper(String color) {
        super(color);
    }

    public Paper(String color, String model) {
        super(color, model);
    }

    public Paper(String color, String model, float size) {
        super(color, model, size);
    }

    public Paper(String color, String model, float size, String city) {
        super(color, model, size, city);
    }

    public Paper(String color, String model, float size, String city, int price) {
        super(color, model, size, city, price);
    }

    public Paper(String color, String model, float size, String city, int price, int amount) {
        super(color, model, size, city, price, amount);
    }

    @Override
    public String toString() {
        return "Paper:" + super.toString();
    }

}
