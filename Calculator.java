/**
 * Aamnah Malik
 * Week 3
 * 02/07/2023
 * Calculator Git Repo
 */

import java.util.Scanner;

public class Calculator 
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        //ask for two numbers
        System.out.println("Enter the first number:");
        float num1 = input.nextFloat();
        System.out.println("Enter the second number:");
        float num2 = input.nextFloat();

        //ask user if they want to add or subtract
        System.out.println("Enter the number corresponding to the operation you would like to perform: ");
        System.out.print("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n");
        int operation = input.nextInt();

        //perform and print result of operation
        if (operation == 1)
        {
            System.out.println(num1 + num2);
        }
        else if (operation == 2)
        {
            System.out.println(num1 - num2);
        }
        else if (operation == 3)
        {
            System.out.println(num1 * num2);
        }
        else 
        {
            if (num2 == 0)
            {
                System.out.println("Error: Divide by Zero");
            }
            else
            {
                System.out.println(num1/num2);
            }
        }
    }
}
