package com.ok.java.String;

public class StringImmutable {
    public static void main(String [] args) {

        String str = "Ankush"; //IMMUTABLE-
//    str.concat("kumar"); //CANNOT BE DONT AS IT IS IMMUTABLE
        String str2=str.concat("kumar"); //can be done by creating dublicate copy
        System.out.println(str2);
    }
}
