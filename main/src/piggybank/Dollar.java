package piggybank;

public class Dollar extends Money {
    
    public Dollar(int quantity) {
        super(quantity);
        this.type = "Dollar";
        this.individualValue = 1.00;
    }
    public Dollar() {
        super(1);
        this.type = "Dollar";
        this.individualValue = 1.00;
	}
}