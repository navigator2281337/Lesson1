package Products;

import java.util.Comparator;
import java.util.Objects;

public abstract class Stationery  implements Comparable<Stationery>{

    private final String color;
    private final String model;
    private final float size;
    private final String city;
    private final int price;
    private final int amount;


    public Stationery() {
        this.color = "DEFAULT";
        this.model = "DEFAULT";
        this.size = 0;
        this.city = "DEFAULT";
        this.price = 0;
        this.amount = 0;
    }

    public Stationery(String color) {
        this.color = color;
        this.model = "DEFAULT";
        this.size = 0;
        this.city = "DEFAULT";
        this.price = 0;
        this.amount = 0;
    }

    public Stationery(String color, String model) {
        this.color = color;
        this.model = model;
        this.size = 0;
        this.city = "DEFAULT";
        this.price = 0;
        this.amount = 0;
    }

    public Stationery(String color, String model, float size) {
        this.color = color;
        this.model = model;
        this.size = size;
        this.city = "DEFAULT";
        this.price = 0;
        this.amount = 0;
    }

    public Stationery(String color, String model, float size, String city) {
        this.color = color;
        this.model = model;
        this.size = size;
        this.city = city;
        this.price = 0;
        this.amount = 0;
    }

    public Stationery(String color, String model, float size, String city, int price) {
        this.color = color;
        this.model = model;
        this.size = size;
        this.city = city;
        this.price = price;
        this.amount = 0;
    }

    public Stationery(String color, String model, float size, String city, int price, int amount) {
        this.color = color;
        this.model = model;
        this.size = size;
        this.city = city;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stationery that = (Stationery) o;
        return Float.compare(that.size, size) == 0 &&
                price == that.price &&
                amount == that.amount &&
                color.equals(that.color) &&
                model.equals(that.model) &&
                city.equals(that.city);
    }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model, size, city, price, amount);
    }

    @Override
    public String toString() {
        return "Stationery{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", city='" + city + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    public int getSum(){
        return this.amount * this.price;
    }

    @Override
    public int compareTo(Stationery s) {
        return this.price - s.price;
    }


    public static Comparator<Stationery> NameComparator = new Comparator<Stationery>() {

        @Override
        public int compare(Stationery o1, Stationery o2) {
            String color1 = o1.getColor().toUpperCase();
            String color2 = o2.getColor().toUpperCase();

            //ascending order
            return color1.compareTo(color2);
        }
    };
}
