package piggybank;

import java.text.DecimalFormat;

abstract class Money {
    public static int maxId = 0;
    public int id;
    public String type;
    public int quantity;
    public double individualValue;
    public double totalValue;

    public Money(int quantity){
        maxId++;
        id = maxId;
        this.quantity = quantity;
    }

    // GETTERS

    public int getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getIndividualValue() {
        return individualValue;
    }
    public double getTotalValue() {
        this.totalValue = quantity * individualValue;
        return totalValue;
    }
    public String remove(int amount){
        double tempValue = amount * individualValue;
        return "You removed $" + df.format(tempValue) + " worth of (" + amount + ") " + getType() + "/s from this pocket!";
    }
    public double removeValue(int amount){
        double tempValue = amount * individualValue;
        this.quantity = quantity - amount;
        return tempValue;
    }

    DecimalFormat df = new DecimalFormat("0.00");

    @Override
    public String toString(){
        return "This pocket contains " + getQuantity() + " " + getType() + "/s. Pocket value: $" + df.format(getTotalValue());
    }
}