package piggybank;

public class Dime extends Money {
    public Dime(int quantity){
        super(quantity);
        this.individualValue = 0.10;
        this.type = "Dime";
    }
    public Dime(){
        super(1);
        this.individualValue = 0.10;
        this.type = "Dime";
    }
}