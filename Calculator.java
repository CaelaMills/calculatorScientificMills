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
        System.out.println("Let's see this number in different conversions");
        convertToHexadecimal1(num1);
        convertToDecimal1(num1);
        convertToOctal1(num1);
        convertToBinary1(num1);


        System.out.print("Enter an operator (+, -, *, /, S, C): ");
        operator = scanner.next().charAt(0);


        num2 = 0;
        if ( operator != 'S' && operator != 'C') {
            System.out.print("Enter second number: ");
            num2 = (int) scanner.nextDouble();
            System.out.println(num2);
            System.out.println("Let's see this number in different conversions");
            convertToHexadecimal2(num2);
            convertToDecimal2(num2);
            convertToOctal2(num2);
            convertToBinary2(num2);

            System.out.println("Bitwise Functions");
            // Bitwise "AND"
            System.out.println("num1&num2 = " + (num1 & num2));


            // Bitwise "OR"
            System.out.println("num1|num2 = " + (num1 | num2));


            // Bitwise "XOR"
            System.out.println("num1^num2 = " + (num1 ^ num2));


        }


        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            //sine
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














