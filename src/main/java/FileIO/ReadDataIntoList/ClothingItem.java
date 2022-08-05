package FileIO.ReadDataIntoList;

import java.util.Objects;

public class ClothingItem {
    private String name;
    private double price;

    public ClothingItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean equals(ClothingItem o) {
        return o.price == price && o.name.equals(name);
    }
}
