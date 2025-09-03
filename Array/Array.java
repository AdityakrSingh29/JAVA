package com.ok.java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[]args){
//        int a[]={10,20,30,40,50}; 1ST WAY TO CREATE 1D ARRAY
          int a[]=new int[5];
          Scanner s=new Scanner(System.in);
          System.out.println("Enter array elements: ");
          for(int i=0;i<5;i++)
          {
             a[i]=s.nextInt();
          }
        Arrays.sort(a);
          System.out.println("Sorted Array elemts are: ");

//        System.out.println(a[2]);

        for(int i:a){
            System.out.println(i+" ");
        }

    }
}
