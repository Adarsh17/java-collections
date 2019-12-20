import java.util.*;
class Student implements Comparable<Student>
{
    String name;
    int rollno;
    
    Student(String n,int r)
    {
        name=n;
        rollno=r;
    }
    
    public int compareTo(Student s)
    {
        return this.rollno-s.rollno;
    }
}


public class ComparableExample
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
        
        Collections.sort(al);
        
       al.forEach(i->{
           System.out.println(i.rollno + "  " +i.name);
       });
    }
}