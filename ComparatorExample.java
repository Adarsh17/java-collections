import java.util.*;
class Student
{
    String name;
    int rollno;
    
    Student(String n,int r)
    {
        name=n;
        rollno=r;
    }
  
}

class SortByRollno implements Comparator<Student>
{
     public int compare(Student s1,Student s2)
    {
        return s1.rollno-s2.rollno;
    }
}

class SortByName implements Comparator<Student>
{
     public int compare(Student s1,Student s2)
    {
        return s1.name.compareTo(s2.name);
    }
}


public class ComparatorExample
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Student> al=new ArrayList<Student>();
        
        for(int i=0;i<=n;i++)
        {
            String name=scanner.next();
            int rollno=scanner.nextInt();
            al.add(new Student(name,rollno));
        }
        
        Collections.sort(al,new SortByRollno());
        System.out.println("Sort by Roll Number");
       al.forEach(i->{
           System.out.println(i.rollno + "  " +i.name);
       });
       

        Collections.sort(al,new SortByName());
         System.out.println("Sort by Name");
       al.forEach(i->{
           System.out.println(i.rollno + "  " +i.name);
       });
    }
}