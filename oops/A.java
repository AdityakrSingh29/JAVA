//DEFAULT CONSTRUCTOR

package com.ok.java.oops;

public class A {
    int a;
    String b;
    boolean c;
    A(){ //DEFAULT
        a=100;
        b="Aditya";
        c=true;
    }
    void Disp()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
class C
{
    public  static  void  main(String[]args) {
        A r = new A();
        r.Disp();
    }
}