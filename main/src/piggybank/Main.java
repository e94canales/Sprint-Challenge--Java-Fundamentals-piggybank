package piggybank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void executeCode(){
       List<Money> piggyBank = new ArrayList<>();
       piggyBank.add(new Quarter(8));
       piggyBank.add(new Dime(23));
       piggyBank.add(new Nickel(4));
       piggyBank.add(new Penny(50));
       piggyBank.add(new Dollar(28));
       piggyBank.add(new Nickel());
       
       System.out.println("\n");
       double total = 0;
       for ( Money m : piggyBank ){
           System.out.println(m);
           total = total + m.getTotalValue();
       }
       DecimalFormat df = new DecimalFormat("0.00");
       System.out.println("\nThis PiggyBank holds a grand total of $" + df.format(total) + "!");

       System.out.println("\n");
       for (Money m : piggyBank){
           if (m.getType() == "Dollar" || m.getType() == "Penny"){
                System.out.println(m.remove(5));
                total = total - m.removeValue(5);
           }
           if (m.getType() == "Dime"){
                System.out.println(m.remove(3));
                total = total - m.removeValue(3);
           }
       }
       System.out.println("\n");
       for ( Money m : piggyBank ){
        System.out.println(m);
    }

       System.out.println("\nThis PiggyBank holds a grand total of $" + df.format(total) + "! \n");
    }
    public static void main(String[] args){
        executeCode();
    }
}