//NORMAL PROGRAM TO UNDERSTAND ABOUT CLASS AND OBJECT IN JAVA
//CLASS IS A VIRTUAL PART
//OBJECT IS A REAL PART

package com.ok.java.oops;

public class person {
    int age=21;
    int weight=56;
    String color="white"; //PROPERTIES

    void eat(){
        System.out.println("I AM EATING!");
    }
    void sleep(){
        System.out.println("I AM SLEEPING");
    }  //BEHAVIOUR
    public static  void main(String [] args){
        person p=new person();
        System.out.println(p.age);
        System.out.println(p.weight);
        System.out.println(p.color);

        p.eat();
        p.sleep();
    }
}
