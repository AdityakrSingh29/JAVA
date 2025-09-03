//THIS KEYWORD IN JAVA
class Test
{
    void show()
    {
        System.out.println(this);
    }
    public static void main(String[] args) {
        Test r=new Test();
        System.out.println(r);
        r.show();
    }
}