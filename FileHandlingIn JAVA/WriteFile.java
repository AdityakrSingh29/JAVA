
import java.io.*;

//FILE ME WRITE.

class WriteFile
{
    public static void main(String[] args) {
        try {
            FileWriter f=new FileWriter("C:\\Users\\ADITYA singh\\Desktop\\Coding1.txt");
            try
            {
                f.write("Java pogramming is the best language!....");
            }
           finally
           {
            f.close();
           }
           System.out.println("Successfully wrote data into a file.....");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}