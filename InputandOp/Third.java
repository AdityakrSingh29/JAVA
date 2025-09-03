//SUM OF TWO NUMBER JAVA PROGRAM

package com.ok.java.InputandOp;
import java.util.Scanner;

public class Third {
    public static void main(String [] args){
        int a,b,c;
        System.out.print("Enter any two number: ");
        Scanner s=new Scanner(System.in); //FOR TAKING INPUT
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println(c);
    }
}
