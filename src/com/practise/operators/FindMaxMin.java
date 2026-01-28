package com.practise.operators;

import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a= scan.nextInt();
        System.out.println("Enter Second Number");
        int b= scan.nextInt();
        System.out.println("Enter Third Number");
        int c= scan.nextInt();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

//        i) a+b*c ii) c+a/b
//        iii) a%b+c iV) a*b+c

        int val1 = a + b * c;
        int val2 = c + a / b;
        int val3 = a % b + c;
        int val4 = a * b + c;

        if(val1>max){
            max=val1;
        }
        if (val1<min) {
            min=val1;
        }
        if(val2>max){
            max=val2;
        }
        if (val2<min) {
            min=val2;
        }
        if(val3>max){
            max=val3;
        }
        if (val3<min) {
            min=val3;
        }
        if(val4>max){
            max=val4;
        }
        if (val4<min) {
            min=val4;
        }
        System.out.println("Minimum value is : "+min);
        System.out.println("Maximum value is : "+max);
    }
}
