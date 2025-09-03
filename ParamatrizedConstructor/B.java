//PARAMATRIZED CONSTRUCTOR
class A
{
    int x;
    int y;
    A(int a,int b)
    {
        x=a;
        y=b;
    }

    A(int a,String b) //CREATING 2ND ONE ALSO 
    {
        System.out.println(a+" "+b);
    }
    void show()
    {
        System.out.println(x+" "+y);
    }
}
class B 
{
    public static void main(String[]args){
        A r=new A(10,20);
        r.show();
        A ref=new A(100,"Aditya");
    }
}
