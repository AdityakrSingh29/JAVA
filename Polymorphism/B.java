

//Runtime Poly.
//METHOD OVERRIDING

class shape
{
    void draw()
    {
        System.out.println("Cant say the shape type...");
    }
}
class square extends shape{

    @Override
    void draw()
    {
        super.draw();
        System.out.println("Square shape...");
    }
}
class B
{
    public static void main(String[] args) {
        square s=new square();
        s.draw();
    }
}
