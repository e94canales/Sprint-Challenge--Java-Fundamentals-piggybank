package piggybank;

public class Penny extends Money {
    public Penny(int quantity){
        super(quantity);
        this.individualValue = 0.01;
        this.type = "Penny";
    }
    public Penny(){
        super(1);
        this.individualValue = 0.01;
        this.type = "Penny";
    }
}