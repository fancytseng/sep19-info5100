package Assignment4;

public class Sundae extends IceCream {
    private int cost;
    private String toppingName;
    private int toppingCost;

    public Sundae (String iceCreamName, int iceCreamCost, String toppingName, int toppingCost){
        super(iceCreamName, iceCreamCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }
    public int getCost(){
        cost = super.getCost() + this.toppingCost;
        return cost;
    }
    public String getTopping(){
        return toppingName;
    }
}

