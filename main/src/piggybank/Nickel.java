package piggybank;

public class Nickel extends Money {
    public Nickel(int quantity){
        super(quantity);
        this.individualValue = 0.05;
        this.type = "Nickel";
    }
    public Nickel(){
        super(1);
        this.individualValue = 0.05;
        this.type = "Nickel";
    }
}