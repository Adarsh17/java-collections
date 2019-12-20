import java.util.*;
public class AlBasic
{
    public static void main(String args[])
    {
        ArrayList<String> al=new ArrayList<String>();
        
        al.add("Shivan");
        al.add("Vishnu");
        al.add("Brahma");
        
        System.out.println(al);
        
        al.add("Saibaba");
        
        System.out.println(al);
        
        al.add(3,"Hanuman");
        
         System.out.println(al);
         
         al.remove(4);
         System.out.println(al);
         
         ArrayList<String> al2=new ArrayList<String>();
        
        al2.add("Jesus");
        al2.add("Allah");
        al2.add("Buddha");
        
        al.addAll(al2);
        System.out.println(al);
        
        al.removeAll(al2);
        System.out.println(al);
        
        al.clear();
        System.out.println(al);
    }
}