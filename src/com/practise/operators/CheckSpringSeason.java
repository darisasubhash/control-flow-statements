package com.practise.operators;

import java.util.Scanner;

public class CheckSpringSeason {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the month");
        int m= scan.nextInt();
        System.out.println("Enter the day");
        int d= scan.nextInt();
        boolean found= (m == 3 && d >= 20 && d <= 31) ||
                      (m == 4 && d >= 1  && d <= 30) ||
                      (m == 5 && d >= 1  && d <= 31) ||
                      (m == 6 && d >= 1  && d <= 20);
        if(found){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
