//INTERFACE
interface vehical
{
    String name="TVS"; //public+static+final
    // int speed=100;

    void start();
    void stop(); //public+abstaract
    default  void color()
    {
        System.out.println("TVS COLOR IS RED");
    }
    static void speed()
    {
        System.out.println("TVS SPEED IS 100KM/HR");
    }
}
class Customer1 implements vehical{
    @Override
    public void start()
    {
        System.out.println("start(): insert key & press start button...");
    }
    @Override
    public void stop()
    {
        System.out.println("Stop():exit key");
    }

    public static void main(String[] args) {
        Customer1 c=new Customer1();
        c.start();
        c.stop();
        c.color();
        vehical.speed();
    }
}
