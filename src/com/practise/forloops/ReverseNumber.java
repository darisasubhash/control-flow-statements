package com.practise.forloops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int n=scan.nextInt();
        int rev=0;
        for(int i=n;i>0;i=i/10){
            int rem=i%10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
    }
}
