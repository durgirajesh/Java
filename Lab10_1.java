package myproject;
import java.util.*;

public class lab10 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> A1=new ArrayList<>();
		ArrayList<Integer> A2=new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			int x1=sc.nextInt();
			int x2=sc.nextInt();
			A1.add(x1);
			A2.add(x2);
		}
		
		System.out.println(A1);
		System.out.println(A2);
		
		int cmn=0;
		int j=0;
		Iterator<Integer> it=A1.iterator();
		Iterator<Integer> it1=A2.iterator();
		while(it.hasNext() && it1.hasNext())
		{
			int t=it.next();
			int t1=it1.next();
					
			if(t==t1) {
				cmn++;
			}
			
		}
		System.out.println("Number of common elements : "+ cmn);
	}

}
