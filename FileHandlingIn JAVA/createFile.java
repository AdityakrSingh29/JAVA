//FILE HANDLING IN JAVA
// import  java.io.*;

//   class createFile
//   {
//     public static void main(String[] args) {
//         File f=new File("C:\\Users\\ADITYA singh\\Desktop\\Coding.txt");
//         try {
//              if (f.createNewFile()) {
//           System.out.println("File successfully created.....");
//         }
//         else{
//           System.out.println("File Alredy existis....");
//         }
//         } catch (IOException e) {
//           System.out.println(e);
//         }
       
//     }
//   }

  //NOW I DONT WANT TO USE TRY CATCH THEN WE WILL BYPASS THIS USING THROW KEYWORD.

  import  java.io.*;

  class createFile
  {
    public static void main(String[] args)  throws IOException  {
        File f=new File("C:\\Users\\ADITYA singh\\Desktop\\Coding.txt");
       
             if (f.createNewFile()) {
          System.out.println("File successfully created.....");
             }
        else{
          System.out.println("File Alredy existis....");
        }
        } 
    }
  