//POLYMORPHISM IN JAVA
 //METHOD OVERLOADING
//COMPILE TIME POLY.

 class A
 {
    int add()
    {
        int a=10,b=20,c;
        c=a+b;
        return c;
    }

    void add(int x,int y)
    {
        int c;
        c=x+y;
        System.out.println(c);
    }

     void add(double x,double y)
    {
        double c;
        c=x+y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        A r=new A ();
       int add= r.add();
       System.out.println(add);
        r.add(100,200);
        r.add(1.2,1.6);
    }
 }