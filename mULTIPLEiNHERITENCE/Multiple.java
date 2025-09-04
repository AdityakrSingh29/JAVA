//MULTIPLE INHERITENCE IN JAVA
// class A
// {
//     void show()
//     {
//         System.out.println("This is a Class-A");
//     }
// }
// class B 
// {
//     void show()
//     {
//         System.out.println("This is class-B");
//     }
// }
// class Multiple extends A,B
// {
//     public static void main(String[] args) {
//         Multiple m=new Multiple();
//         m.show();
//     }
// }--<This codw will give error to solve this intrfeca is used

interface A 
{
    void show();
}
interface B
{
    void Disp();
}
class Multiple implements A,B
{
    public void show()
    {
        System.out.println("Interface A & B");
    }
    public void Disp()
    {
        System.out.println("This is a disp!");
    }
        public static void main(String[] args) {
        Multiple m=new Multiple();
        m.show();
        m.Disp();
    }
}