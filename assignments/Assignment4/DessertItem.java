package Assignment4;

abstract class DessertItem {

    protected String name;
    private static final int MAX_ITEM_NAME_SIZE = 22;//I count from "Oatmeal Raisin Cookies"


    public DessertItem(String name) {
        if (name.length() <= DessertItem.MAX_ITEM_NAME_SIZE)
            this.name = name;
        else {
            this.name = name.substring(0, DessertItem.MAX_ITEM_NAME_SIZE);
        }
    }
    //constructor:判斷-public+class(這個括號裡面可以是空的或是參數)
    public DessertItem() {
    }


    //method:判斷-public+返回值類型+動作
    public final String getName() {
        return name;
    }

    //it is abstract so we cannot have{}, we just have to end it up with;
    public abstract int getCost();
}

//public​ ​class​ ​Question_3 {
//        ​public​ ​static​ ​void​ ​main​(​String​[] ​args​) {
//        Checkout checkout ​=​ ​new​ Checkout();
//        50​));
//        checkout​.​enterItem(​new​ Candy(​"Peanut Butter Fudge"​, ​2.25​, ​399​));
//        checkout​.​enterItem(​new​ IceCream(​"Vanilla Ice Cream"​, ​105​));
//        checkout​.​enterItem(​new​ Sundae(​"Choc. Chip Ice Cream"​, ​145​, ​"Hot Fudge"​,
//        checkout​.​enterItem(​new​ Cookie(​"Oatmeal Raisin Cookies"​, ​4​, ​399​));
//        "\n"​);
//        System​.​out​.​println(​"\nNumber of items: "​ ​+​ checkout​.​numberOfItems() ​+
//        System​.​out​.​println(​"\nTotal cost: "​ ​+​ checkout​.​totalCost() ​+​ ​"\n"​);
//        System​.​out​.​println(​"\nTotal tax: "​ ​+​ checkout​.​totalTax() ​+​ ​"\n"​);
//        System​.​out​.​println(​"\nCost + Tax: "​ ​+​ (checkout​.​totalCost() ​+
//        checkout​.​totalTax()) ​+​ ​"\n"​);
//        System​.​out​.​println(checkout);
//        checkout​.​clear();
//        50​));
//        checkout​.​enterItem(​new​ IceCream(​"Strawberry Ice Cream"​, ​145​));
//        checkout​.​enterItem(​new​ Sundae(​"Vanilla Ice Cream"​, ​105​, ​"Caramel"​,
//        checkout​.​enterItem(​new​ Candy(​"Gummy Worms"​, ​1.33​, ​89​));
//        checkout​.​enterItem(​new​ Cookie(​"Chocolate Chip Cookies"​, ​4​, ​399​));
//        checkout​.​enterItem(​new​ Candy(​"Salt Water Taffy"​, ​1.5​, ​209​));
//        checkout​.​enterItem(​new​ Candy(​"Candy Corn"​, ​3.0​, ​109​));
//        System​.​out​.​println(​"\nNumber of items: "​ ​+​ checkout​.​numberOfItems() ​+
//        "\n"​);
//        System​.​out​.​println(​"\nTotal cost: "​ ​+​ checkout​.​totalCost() ​+​ ​"\n"​);
//        System​.​out​.​println(​"\nTotal tax: "​ ​+​ checkout​.​totalTax() ​+​ ​"\n"​);
//        System​.​out​.​println(​"\nCost + Tax: "​ ​+​ (checkout​.​totalCost() ​+
//        checkout​.​totalTax()) ​+​ ​"\n"​);
//        System​.​out​.​println(checkout);
//        }
//}
