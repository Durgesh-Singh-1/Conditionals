import java.util.Scanner;

public class SqareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length and height of Square :-");
        int length = sc.nextInt();
        int height = sc.nextInt();
        if (length==height)
        {
            System.out.println("it is a Square ");
        }
        else
            System.out.println("it is not a square  ");
    }
}
