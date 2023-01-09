import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost price :-" );
        int  cp = sc.nextInt();
        System.out.println("Enter selling price :-");
        int sp = sc.nextInt();
        if (cp>sp)
        {
            int loss = cp - sp;
            System.out.println("total loss = " + loss);
        }
        else {
            int profit = sp - cp;
            System.out.println("total Profit = " + profit);
        }
    }
}
