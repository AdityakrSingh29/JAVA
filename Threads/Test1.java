//BY EXTENDING THREAD CLASS.
class Test extends Thread
{
    @Override
    public void run()
    {
        try {
            for(int i=0;i<=5;i++)
        {
            System.out.println("Aditya..");
          Thread.sleep(1000);
        }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
class Test1
{
    public static void main(String[] args) throws  InterruptedException{
        Test t=new Test();
        t.start();

         for(int i=0;i<=5;i++)
        {
            System.out.println("ditya..");
            Thread.sleep(1000);
        }
    }
}