import java.util.*;
public class HashmapBasic2
{
    public static void main(String args[])
    {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(3,"thor");
        hm.put(1,"tony");
        hm.put(4,"hulk");
        
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();
        
        hm.putIfAbsent(2,"steve");
        
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();
        
        HashMap<Integer,String> hm2=new HashMap<Integer,String>();
        hm2.put(8,"black widow");
        hm2.put(5,"loki");
        hm2.put(7,"panther");
        
        hm.putAll(hm2);
        
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();
        
        hm.remove(2);
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();
        
        hm.replace(3,"pepper");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();
        
        hm.replace(3,"pepper","steve");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();
        
        
    }
}