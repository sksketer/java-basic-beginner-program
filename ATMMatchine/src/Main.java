import java.util.Scanner;
import ExternalHandlers.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printStatements p = new printStatements();
        breakAmount ba = new breakAmount();

        p.Sop("Welcome to XYZ ATM Matching");
        p.pf("Enter amount: ");
        int amount = sc.nextInt();
        if(amount > 500){
            if(amount%50 == 0)
                ba.breakAmountInto(amount);
            else{
                int err = amount%50;
                p.pf("This ATM Machine only give ");
                p.pf(amount-err);
                p.pf(" Rs. don't give ");
                p.pf(err);
                p.Sop(" Rs. ");
            }
        }
        else
            p.Sop("Amount should greater than or equals to 500 Rs.");

        sc.close();
    }
}
