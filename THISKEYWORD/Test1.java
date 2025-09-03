//THIS KEYWORD-->here we will be removing confusinon bw local and instance aribael using this keyword
class Test1{
    int a;
    Test1(int a)
    {
        this.a=a;
    }
    void show()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        Test1 r=new Test1(100);
        r.show();
    }
}