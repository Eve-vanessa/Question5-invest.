/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bukoto;

/**
 *
 * @author user 2022
 */
         import java.util.Scanner; 
public class BUKOTO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Assuming we have 5 members for simplicity
        int numberOfMembers = 5;
        double interestRate;
        int timeFrame;
        double[] principalAmounts = new double[numberOfMembers];
        double[] finalAmounts = new double[numberOfMembers];

        // Input interest rate and time frame
        System.out.print("Enter the annual interest rate (in %): ");
        interestRate = scanner.nextDouble();
        System.out.print("Enter the time frame (in years): ");
        timeFrame = scanner.nextInt();

        // Input principal amounts
        for (int i = 0; i < numberOfMembers; i++) {
            System.out.print("Enter principal amount for member " + (i + 1) + ": ");
            principalAmounts[i] = scanner.nextDouble();
        }

        // Calculate final amounts using compound interest formula
        for (int i = 0; i < numberOfMembers; i++) {
            finalAmounts[i] = principalAmounts[i] * Math.pow((1 + interestRate / 100), timeFrame);
        }

        // Output the results
        System.out.println("Member\tPrincipal\tFinal Amount");
        for (int i = 0; i < numberOfMembers; i++) {
            System.out.printf("%d\t%.2f\t%.2f%n", (i + 1), principalAmounts[i], finalAmounts[i]);
        }

        scanner.close();
    }
}
