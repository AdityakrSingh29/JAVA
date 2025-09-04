//EXPECTION HANDLING IN JAVA

class Test
{
    public static void main(String[] args) {
        System.out.println("Main class started....");
        int a=10;
        int b=0,c;
        // c=a/b; //c=10/0;--<Exception here
        try {  //HANDLING EXCEPTION HERE.....
            c=a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Main ended....");
    }
}