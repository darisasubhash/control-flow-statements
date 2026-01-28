package com.practise.whileconditions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number you want to reverse it");
        int n=scan.nextInt();
        int reverse=0;
        while(n>0){
            int rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        System.out.println("Reverse of num : "+reverse);
    }
}
