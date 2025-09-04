//SIMPLE INHERITENCE IN JAVA
class student //super class
 {
    int roll,marks;
    String name;
    void input()
    {
        System.out.println("Enter roll name & marks....");
    }
 }
class Aditya extends student //sub-class
 {
    void disp()
    {
        roll=1;name="aditya";marks=95;
        System.out.println(roll+" "+name+" "+marks);
    }
    public static void main(String[] args) {
        Aditya a=new Aditya();
        a.input();
        a.disp();
    }
 }