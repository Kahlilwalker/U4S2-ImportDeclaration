package partA.activity;

import javax.swing.*;
import java.util.Scanner;

public class Activity01_ExplicitImport {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int total = 0;

        int count = 3;

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter integer " + i + ":");
            total += scan.nextInt();
        }

        System.out.println("The sum is: " + total);
        scan.close();
    }
}
