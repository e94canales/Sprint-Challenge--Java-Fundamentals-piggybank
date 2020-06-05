package piggybank;

public class Quarter extends Money {
    public Quarter(int quantity){
        super(quantity);
        this.individualValue = 0.25;
        this.type = "Quarter";
    }
    public Quarter(){
        super(1);
        this.individualValue = 0.25;
        this.type = "Quarter";
    }
}