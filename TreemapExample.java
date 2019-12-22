import java.util.*;
public class TreemapExample
{
   static HashMap<Integer,String> hm=new HashMap<Integer,String>();
    
    
    public static void method()
    {
       TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
       tm.putAll(hm);
       
       for(Map.Entry<Integer,String> m:tm.entrySet())
       {
           System.out.println(m.getKey()+" ");
       }
    }
    
    public static void main(String args[])
    {
        hm.put(5,"hulk");
        hm.put(1,"tony");
        hm.put(6,"loki");
        
        method();
    }
}