package Assignment4;

public class Candy extends DessertItem {

    //declare variables
    private double weight;
    private int unitPrice;
    private int cost;

    //constructor. because it is public + class + (could be empty or perimeter)
    public Candy(String name, double weight, int unitPrice) {
        //"super": inheritance from its parents
        super(name);
        this.weight = weight;
        this.unitPrice = unitPrice;
    }

    public int getUnitPrice() {
        return this.unitPrice;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getCost() {
        this.cost = (int) Math.round(this.weight * this.unitPrice);
        return this.cost;
    }
}
