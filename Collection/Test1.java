//COLLECTIONS in java----ARRAYLIST
import java.util.ArrayList;
class Test1
{
    public static void main(String args[]){
        ArrayList<String> Name=new ArrayList<String>();
        Name.add("ADI");
        Name.add("MOHIT");
        System.out.println(Name);

        //add element in middle
        Name.add(1,"Rohit");
        System.out.println(Name);
        Name.remove(1);
        System.out.println(Name);
        Name.set(0, "Sachin"); //VALUE REPLACE
        System.out.println(Name);
        System.out.println(Name.get(1));
        // Name.clear(); //DELETE ALL
    }
}