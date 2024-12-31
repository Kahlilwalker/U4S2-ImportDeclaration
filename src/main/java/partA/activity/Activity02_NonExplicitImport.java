package partA.activity;

public class Activity02_NonExplicitImport {
    public static double tax = .05;
    public  static double tip = .15;

    public static double findTotal(double price){
        double total = price*(1+tax+tip);
        System.out.println("$" +total);


        return total;
    }
    public static void main(String[] args) {
        System.out.println(findTotal(34));
    }

}


