package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int topping;// topping prise veries for veg and non-veg

    // to add only one time we check using flag
    boolean cheeseadded;
    boolean toppoingAdded;
    boolean takeaway;
    boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg){
            this.price = 300;
            this.topping = 70;
        }else{
            this.price = 400;
            this.topping = 120;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!cheeseadded){
            this.price += 80;
            cheeseadded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!toppoingAdded){
            this.price += this.topping;
            toppoingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!takeaway){
            this.price += 20;
            takeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated) {
            if (cheeseadded) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (toppoingAdded) {
                this.bill += "Extra Toppings Added: " + this.topping + "\n";
            }
            if (takeaway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: " + this.price;
            isBillGenerated = true;
        }
        return this.bill;
    }
}
