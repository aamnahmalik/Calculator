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
        System.out.println("Enter the first integer:");
        int num1 = input.nextInt();
        System.out.println("Enter the second integer:");
        int num2 = input.nextInt();

        //add numbers
        int sum = num1 + num2;

        //print sum
        System.out.println(sum);
    }
}
