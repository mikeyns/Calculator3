public class Calculator3 {
    public double tax = .05;
    public double tip = .15;
    
    public void findTotal(double price){
        double total = price*(1+tax+tip);
        System.out.println("$" +total);

    }
}
class Calculator {
    
    void findTotal (int i) {
     throw new UnsupportedOperationException ("Not supported yet.");    
    }
}
