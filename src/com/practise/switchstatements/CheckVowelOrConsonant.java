package com.practise.switchstatements;

import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch=scan.next().charAt(0);
        switch (Character.toLowerCase(ch)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Given character is Vowel");
                break;
            default:
                if(Character.isLetter(ch)){
                    System.out.print("Given Character is Consonant");
                }
                else {
                    System.out.println("Given Character is not an alphabet");
                }
        }
    }
}
