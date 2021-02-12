package ExternalHandlers;

public class breakAmount {
    public void breakAmountInto(int amt){

        printStatements p = new printStatements();

        int rupees50=0, rupees100=1, rupees200=0, rupees500=0, rupees2000=0;

        int orgAmt = amt;
        amt = amt-100;

        rupees2000 = amt/2000;
        amt = amt%2000;

        rupees500 = amt/500;
        amt = amt%500;

        rupees200 = amt/200;
        amt = amt%200;

        rupees100 = rupees100 + amt/100;
        amt = amt%100;

        rupees50 = amt/50;
        amt = amt%50;

        p.pf("Your amount is "); p.pf(orgAmt); p.Sop(" and you get: ");
        p.Sop();
        p.pf(rupees2000); p.Sop(" : 2000 Rs. Note");
        p.pf(rupees500); p.Sop(" : 500 Rs. Note");
        p.pf(rupees200); p.Sop(" : 200 Rs. Note");
        p.pf(rupees100); p.Sop(" : 100 Rs. Note");
        p.pf(rupees50); p.Sop(" : 50 Rs. Note");
    }
}
