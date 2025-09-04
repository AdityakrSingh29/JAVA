//READ DATA FROM FILES.
import java.io.*;
class FileReader1
{
    public static void main(String[] args) {
        try {
            FileReader r=new FileReader("C:\\Users\\ADITYA singh\\Desktop\\Coding1.txt");
            try {
                int i;
                while ((i=r.read())!=-1) { 
                    System.out.print((char)i);
                }
            } finally {
                r.close();
                System.out.println("File closed!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

//BUFFEREDREADER,SCANNER CLASS,FILEIP STREAM-->this can be also used to read te file