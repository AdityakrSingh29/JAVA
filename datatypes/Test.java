public class Test{

    public static class Second {
        int a=10; //INSTANCE VARIABLE
        static  double b=20.5; //STATIC VARIABLE
        public static  void main(String [] args){
            boolean c=true; //LOCAL VARIABLE
            Second s=new Second(); //TO ACCESS INSTANCE VARIBLE
            System.out.println(s.a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(s.a+" "+b+" "+c);
        }
    }
}
