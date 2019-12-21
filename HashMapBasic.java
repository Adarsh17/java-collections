import java.util.*;
public class HashMapBasic
{
    public static void main(String args[])
    {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        
        hm.put(4,"adarsh");
        hm.put(1,"tony");
        hm.put(3,"steve");
        System.out.println(hm.size());
        System.out.println(hm);
        
        //printing specific value using key by get method
        System.out.println(hm.get(4));
        
        //removing specific value using key by remove method
        hm.remove(3);
        System.out.println(hm);
        
        //printing size of hashmap using size() method
        System.out.println(hm.size());
        
        //printing only key using keySet() method
        for(int i:hm.keySet())
        {
            System.out.println(i+" ");
        }
        
        //printing only values using values() method
        for(String i:hm.values())
        {
            System.out.println(i+" ");
        }
        
        //printing both keys and values using loop
        for(int i:hm.keySet())
        {
            System.out.println(i+" "+hm.get(i));
        }
        
        
    }
}