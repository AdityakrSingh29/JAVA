//MULTI LEVEL INHERITENCE' using claa
class A  //SUPER CLASS
{
    int a,b,c;
    void add()
    {
        a=10;
        b=20;
        c=a+b;
        System.out.println("Sum of two no is" +c);
    }

    void sub()
    {
        a=100;
        b=200;
        c=a-b;
        System.out.println("Sub of two no is" +c);
    }
}
class B extends  A  //SUB CLASS-1
{
    void mul()
    {
        a=10;
        b=20;
        c=a*b;
        System.out.println("Mul. of two no is" +c);
    }

    void div()
    {
        a=10;
        b=2;
        c=a/b;
        System.out.println("Div. of two no is" +c);
    }
}
class C extends B       //sub class-2
{
    void rem()
    {
        a=10;
        b=20;
        c=a%b;
        System.out.println("Rem. of two no is" +c);
    }
}
class Test
{
    public static void main(String[] args) {
        C c=new C();
        c.add();
        c.div();
        c.mul();
        c.sub();
    }
}