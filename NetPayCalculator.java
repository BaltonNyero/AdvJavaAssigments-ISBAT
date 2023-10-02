//Student Name: Stephen Balton NYERO | MscIT, Year One-Sem One | Assignment
//This program accepts an employee's Gross Salary, computes NSSF, PAYE and outputs NetPay less of all the taxes

import java.util.Scanner;

public class NetPayCalculator {
    public static void main(String[] args) {
        // Read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Enters the employee's Gross pay
        System.out.print("Enter Gross Pay: ");
        double grossPay = scanner.nextDouble();

        // Formular for calculating NSSF ( 5%)
        double nssfEmployee = 0.05;
        double nssfEmployer = 0.1;
        double payee = 0;

        // Calculates the  deductions
        double nssfAmountEmployee = grossPay * nssfEmployee;
        double nssfAmountEmployer = grossPay * nssfEmployer;

        if (grossPay <=235000) {
             payee=0;
        } else if (grossPay > 235000 && grossPay <= 335000) {
           payee= 0.1 * grossPay;
        } else if (grossPay > 335000 && grossPay <= 410000) {
            payee= 10000 + (0.2*grossPay);
        } else if (grossPay > 410000 && grossPay <= 10000000) {
                payee= 25000 + (0.3*grossPay);
        } else if (grossPay > 10000000 ) {
             payee= 0.1 * grossPay;
        }   

        double employeeDeductions = nssfAmountEmployee + payee;

        double netPay = grossPay - employeeDeductions;

        // Output
        System.out.println("Gross Pay: UGX" + grossPay);
        System.out.println("Deductions:  UGX" + employeeDeductions);
        System.out.println("Net Pay: UGX" + netPay);

        // Close the scanner
        scanner.close();
    }
}