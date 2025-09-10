//COLLECTIONS in java----LINKEDLIST
import java.util.LinkedList;
class Test2
{
    public static void main(String args[]){
        LinkedList<String> Name=new LinkedList<String>();
        Name.add("ADI");
        Name.add("MOHIT");
        System.out.println(Name);

        Name.addFirst("naman"); //add at bgn
        Name.addLast("Amir"); //add at end
        Name.add(3,"anish"); //add at middle
        Name.remove(); //begn elem delete
        Name.removeFirst();//emove from middle
        Name.removeLast();//remove from last
    }
}