import java.util.Scanner;

public class Calculator {
        public static void main(String []args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First Number");
                float number1=scan.nextFloat();

        System.out.println("Enter Second Number");
                float number2=scan.nextFloat();

                System.out.print("Enter Number are: ");
                System.out.print(number1);
                System.out.print(" and ");
                System.out.println(number2);


                System.out.println("Enter 1 for Addition, 2 for Substraction, 3 for Multiplication, 4 for Devision ");
                int value=scan.nextInt();

                if(value==1)
                {
                        System.out.println("The result after addition is:");
                        System.out.println(number1 + number2);
                }
                else if (value==2)
                {
                        System.out.println("The result after Substraction is:");
                        System.out.println(number1 - number2);
                }
                else if (value==3)
                {
                        System.out.println("The result after Multiplication is");
                        System.out.println(number1 * number2);
                }
                else if (value==4)
                {
                        System.out.println("The result after Devision is:");
                        System.out.println(number1 / number2);
                }
                else
                        System.out.println("Invalid input");

    }
}
