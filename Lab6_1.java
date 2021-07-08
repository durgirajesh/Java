package myds;

public class intstack {
	
	int max_size=100;
    int top=-1;
    int arr[]=new int[max_size];
	public void push(int a)
	{
		top=top+1;
		if(arr[top]==max_size-1)
		{
		    System.out.println("overflow");
		}
		else
		{
			arr[top]=a;
		}
	}
	
	public void pop()
	{
		if(arr[top]==-1)
		{
			System.out.println("underflow");
		}
		else
		{
			top--;
		}
	}
	
	public void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}






package myds;

public class charstack {
	
	static int size=100;
	static int Top=-1;
	static char ch[]=new char[size];
	static public void cpush(char a)
	{
		Top=Top+1;
		if(ch[Top]==size-1)
		{
			System.out.println("overflow");
		}
		else
		{
			ch[Top]=a;
		}
	}
	
	static public void cpop()
	{		
		if(ch[Top]==-1)
		{
			System.out.println("underflow");
		}
		else
		{
			Top--;
		}
	}
	
	static public void cdisp()
	{
		for(int i=0;i<=Top;i++)
		{
			System.out.println(ch[i]+" ");
		}
	}
}

package test;

import myds.intstack;
import static myds.charstack.*;

import java.util.*;

public class testpck {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1->Intstack\n2->Charstack");
		int x=sc.nextInt();
		
		intstack A1=new intstack();
		
		Random r1=new Random();
		
		switch(x) {
		case 1:
			
			System.out.println("Enter n");
			int n=sc.nextInt();
			
			for(int i=0;i<n;i++)
			{
				
				int j=r1.nextInt(15);
				System.out.println("pushed..->");
				A1.push(j);
			}
			A1.display();
			break;
			
		case 2:
			System.out.println("Enter n1");
			int n1=sc.nextInt();
			char q;
			for(int i=0;i<n1;i++)
			{
				q=sc.next().charAt(0);
				cpush(q);
			}
			cdisp();
			break;
		}
	}
}
