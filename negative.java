import java.util.Scanner;

public class negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("enter integer :-");
        int num = sc.nextInt();
        if (num<0)
        {
            System.out.println("the number is negative and skipped");
        }
        else
            System.out.println("the number is positive");
    }

}
