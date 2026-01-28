package com.practise.operators;

import java.util.Scanner;

//import java.util.lang;

public class FindingRoots {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a");
        int a= scan.nextInt();
        System.out.println("Enter b");
        int b= scan.nextInt();
        System.out.println("Enter c");
        int c= scan.nextInt();
        int delta=b*b-4*a*c;
        if(delta>0){
            double root1=(-b + Math.sqrt(delta))/(2*a);
            double root2=(-b - Math.sqrt(delta))/(2*a);
            System.out.println(root1 +"  "+root2);
        }
        else if(delta==0){
            double root=-b/(2*a);
            System.out.println("Two roots are equal "+ root +"  "+root);
        }
        else{
            System.out.println("Roots are imaginary");
        }


    }
}
