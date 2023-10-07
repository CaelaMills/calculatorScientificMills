import java.util.Scanner;
import java.lang.Math;


import static java.lang.Math.cos;
import static java.lang.Math.sin;


public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num1, num2, result;
        char operator;


        System.out.print("Enter first number: ");
        num1 = (int) scanner.nextDouble();
        System.out.println(num1);
        System.out.println("\n");
        System.out.println("Let's see this number in different conversions");
        System.out.println("\n");
        System.out.println("num1 in hexadecimal value: ");
        convertToHexadecimal1(num1);
        System.out.println("num1 in decimal value: ");
        convertToDecimal1(num1);
        System.out.println("num1 in octal value: ");
        convertToOctal1(num1);
        System.out.println("num1 in binary value: ");
        convertToBinary1(num1);


        System.out.println("\n");
        System.out.print("Enter an operator (+, -, *, /, S, C): ");
        operator = scanner.next().charAt(0);


        num2 = 0;
        if ( operator != 'S' && operator != 'C') {
            System.out.print("Enter second number: ");
            num2 = (int) scanner.nextDouble();
            System.out.println(num2);
            System.out.println("\n");
            System.out.println("Let's see this number in different conversions");
            System.out.println("\n");
            System.out.println("num2 in hexadecimal value: ");
            convertToHexadecimal2(num2);
            System.out.println("num2 in decimal value: ");
            convertToDecimal2(num2);
            System.out.println("num2 in octal value: ");
            convertToOctal2(num2);
            System.out.println("num2 in binary value: ");
            convertToBinary2(num2);

            System.out.println("\n");
            System.out.println("Bitwise Functions");
            System.out.println("\n");
            // Bitwise "AND"
            System.out.println("Result of num1 and num2 using Bitwise 'AND' ");
            System.out.println("num1&num2 = " + (num1 & num2));


            // Bitwise "OR"
            System.out.println("Result of num1 and num2 using Bitwise 'OR' ");
            System.out.println("num1|num2 = " + (num1 | num2));


            // Bitwise "XOR"
            System.out.println("Result of num1 and num2 using Bitwise 'XOR' ");
            System.out.println("num1^num2 = " + (num1 ^ num2));
            System.out.println("\n");


        }


        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                System.out.println("\n");
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                System.out.println("\n");
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                System.out.println("\n");
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                    System.out.println("\n");
                } else {
                    System.out.println("Error: Division by zero");
                    System.out.println("\n");
                }
                break;
            //Sine
            case 'S':
                num2 = (int) Math.toRadians(num1);
                result = (int) sin(num2);
                System.out.println("Sine: " + result);
                break;
            //Cosine
            case 'C':
                num2 = (int) Math.toRadians(num1);
                result = (int) cos(num2);
                System.out.println("Cosine: " + result);
                break;
            default:
                System.out.println("Error: Invalid operator");


        }




        scanner.close();
    }


    public static void convertToHexadecimal1(int num1) {
        String hexadecimal = Integer.toHexString(num1);
        System.out.println(hexadecimal);
    }


    public static void convertToHexadecimal2(int num2) {
        String hexadecimal = Integer.toHexString(num2);
        System.out.println(hexadecimal);
    }


    public static void convertToDecimal1(double num1) {
        System.out.println(num1);
    }


    public static void convertToDecimal2(double num2) {
        System.out.println(num2);
    }


    public static void convertToOctal1(int num1) {
        String octalString = Integer.toOctalString(num1);
        System.out.println(octalString);
    }


    public static void convertToOctal2(int num2) {
        String octalString = Integer.toOctalString(num2);
        System.out.println(octalString);
    }


    public static void convertToBinary1(int num1) {
        String binary = Integer.toBinaryString(num1);
        System.out.println(binary);
    }


    public static void convertToBinary2(int num2) {
        String binary = Integer.toBinaryString(num2);
        System.out.println(binary);
    }
}














