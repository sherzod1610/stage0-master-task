package com.epam.loops;
import java.util.Scanner;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numberTableToPrint + " x " + i + " = " + (numberTableToPrint * i));
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if (number <= 0) {
            System.out.println("Invalid input.");
            return;
        }
        
        MultiplicationTable table = new MultiplicationTable();
        table.printTable(number);
    }
}
