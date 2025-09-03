//THIS KEYWORD call default CONSTRUCTOR

class Test2 {

    Test2() {
        System.out.println("OR BHAI?");
    }
    Test2(int a)
    {
        this(); //it will call default constructor of same class
        System.out.println(a);
    }
    
    public static void main(String[] args) {
        Test2 r=new Test2(100);    
    }
}