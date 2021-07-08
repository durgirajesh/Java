package myproject;
import java.util.*;

public class lab10b {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Map<String,String> Student=new LinkedHashMap<>();
		System.out.println("Enter student details");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter ccode and student name");
			String ccode=sc.next();
			String name=sc.next();
			
			Student.put(ccode,name);
		}
		
		Map<String,String> faculty=new LinkedHashMap<>();
		System.out.println("Enter faculty details");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter ccode and faculty name(No courses can have same faculty)");
			String ccode=sc.next();
			String name=sc.next();
			
			faculty.put(ccode,name);
		}
		
		Map<String,String> stud=new TreeMap<>();
		
		for(Map.Entry<String,String> ef:Student.entrySet())
		{
			String key=ef.getKey();
			for(Map.Entry<String,String> eh:faculty.entrySet())
			{
				String key1=eh.getKey();
				if(key.equals(key1))
				{
					
					String value1=ef.getValue();
					String value2=eh.getValue();
					stud.put(value1, value2);
				}
				else
				{
					String v1=ef.getValue();
					stud.put(v1,"New Prof");
				}
			}
		}
		
		for(Map.Entry<String, String> af:stud.entrySet())
		{
			
			System.out.println(af.getKey()+" "+af.getValue()+" ");
		}
	}

}

