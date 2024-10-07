import java.util.Scanner;

public class RunAmountDue {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        AmountDue due = new AmountDue();
        
        System.out.println("Press any of the following then enter the values seperated by spaces:");
        System.out.println("1 - Price Only");
        System.out.println("2 - Price and Quantity");
        System.out.println("3 - Price, quantity, and discount amount");
        
        int choice = sc.nextInt();
        double amountDue = 0;
        
        if (choice == 1){
            System.out.print("Enter Price: ");
            double p1 = sc.nextDouble();
            amountDue = due.computeAmountDue(p1);
        }
        else if (choice == 2){
            System.out.print("Enter Price and Quantity: ");
            double p2 = sc.nextDouble();
            int q2 = sc.nextInt();
            amountDue = due.computeAmountDue(p2, q2);
        }
        else if (choice == 3){
            System.out.print("Enter Price, Quantity and Discount: ");
            double p3 = sc.nextDouble();
            int q3 = sc.nextInt();
            double d3 = sc.nextDouble();
            amountDue = due.computeAmountDue(p3, q3, d3);
        }
        System.out.println("Amount due is: " + amountDue);
        sc.close();
    }
}
