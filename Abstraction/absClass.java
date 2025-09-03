//ABSTRACT CLASS
abstract class animal
{
    void legs()
    {
        System.out.println("ALL ANIMALS HAVE 4 LEGS!");
    }
    abstract void sound();
    abstract  void eat();
}

class Dog extends animal
{
    @Override
    void sound()
    {
        System.out.println("Bow Bow....");
    }
    void eat()
    {
        System.out.println("meat...eating...");
    }
}

class Cow extends animal
{
    @Override
    void sound()
    {
        System.out.println("aoooo...");
    }
    void  eat()
    {
        System.out.println("Eating grass...");
    }
}

class absClass {
    public static void main(String[] args) {
        Dog d=new Dog();
        Cow c=new Cow();
        d.sound();
        d.eat();
        d.legs();
        c.sound();
        c.eat();
        c.legs();
    }
}