//COLLECTIONS in java----QUEUE
import java.util.ArrayDeque;
class Test4
{
    public static void main(String args[]){
        ArrayDeque<String> Name=new ArrayDeque<>(); //FIFO
        Name.push("aditya");
        Name.push("mohit");
        System.out.println(Name);
        Name.pop();
    }
}