package com.practise.operators;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x= Integer.parseInt(args[0]);
        int y= Integer.parseInt(args[1]);
        double distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println(distance);
    }
}
