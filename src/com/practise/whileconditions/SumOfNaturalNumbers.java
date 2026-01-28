package com.practise.whileconditions;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number you want sum of natural numbers");
        int n= scan.nextInt();
        int sum=0;
        while(n>0){
            sum+=n;
            n--;
        }
        System.out.println(sum);
    }
}
