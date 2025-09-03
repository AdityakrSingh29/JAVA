//SUPER KEYWORD WITH CONSTRUCTOR
class A 
{
    A()
    {
        System.out.println("Hello bhai?");
    }
}
class  B extends A{
    B()
    {
        //REMBER HERE Super keywod is added automatically by java compiler if we are not writing-->same op if we write super keyword also
        System.out.println("Hello!");
    }
}
class Test1
{
    public static void main(String[] args) {
        B r=new B();
    }
}