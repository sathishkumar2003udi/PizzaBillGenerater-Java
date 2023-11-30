public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToopingsPrice=150;
    private int backPackPrice=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded=false;
    private boolean isOptedForTakeAway=false;


    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded=true;

        this.price += extraToopingsPrice;
    }

    public void takeAway(){
        isOptedForTakeAway=true;

        this.price += backPackPrice;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Pizza: "+ basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra Cheese added:"+ extraCheesePrice+"\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Toppings added:"+ extraToopingsPrice+"\n";
        }
        if(isOptedForTakeAway){
            bill += "Take Away:"+ backPackPrice+"\n";
        }
        bill += "Bill:"+this.price+"\n";
        System.out.println(bill);
    }

}
/*
    Base pizza:300
    Toppings: 150
    Cheese:100
    Take away:20
 */