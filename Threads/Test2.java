//IMPLEMENTING THREAD USING RUNNABLE INTERFACE
class Test implements Runnable
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("MY CHILD THREAD....");
        }
    }
}
class Test2
{
    public static void main(String[] args) {
        Test r=new Test();
        Thread t=new Thread(r);
        t.start();

        for(int i=0;i<=5;i++)
        {
            System.out.println("MY MAIN THREAD");
        }
    }
}