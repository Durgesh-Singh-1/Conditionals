import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter operation ( +, -, *, / ");
        char cal =sc.next().charAt(0);
        System.out.println("enter 2 number for operation :- ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        switch (cal)
            {
                case '+':
                {
                 int add = num1 + num2;
                    System.out.println(add);
                    break;
                }
                case '-' :
                {
                    int sub = num1 - num2;
                    System.out.println(sub);
                    break;
                }
                case '*' :
                {
                    int mul = num1 * num2 ;
                    System.out.println(mul);
                    break;
                }
                case '/' : {
                    int div = num1 / num2;
                    System.out.println(div);
                    break;
                }
                default:
                {
                    System.out.println("invalid input ");
                }
            }

    }
}