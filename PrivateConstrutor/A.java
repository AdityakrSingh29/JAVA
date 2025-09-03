//PRIVATE CONSTRUCTOR
class A 
{
    int a;
    double b;
    String c;
    private A()
    {
        a=10;
        b=30.56;
        c="ADITYA";
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        A r=new A();
    }
}