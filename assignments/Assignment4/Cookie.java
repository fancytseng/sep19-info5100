package Assignment4;

public class Cookie extends DessertItem{
        private int number;
        private int unitPrice;
        private int cost;

        public Cookie(String name, int number, int unitPrice) {
            super(name);
            this.number = number;
            this.unitPrice = unitPrice;
        }

        public int getQuantity(){
            return number;
        }

        public int getUnitPrice(){
            return unitPrice;
        }

        public int getCost(){
            this.cost = (int) Math.round(this.number * this.unitPrice);
            return cost;
        }
}
