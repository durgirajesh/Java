package myproject;

import java.util.*;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[4][4];
		int b[]=new int[16];

		int k=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				a[i][j]=sc.nextInt();
				b[k]=a[i][j];
				k++;
			}
		}
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		for(int i=0;i<16;i++)
		{
			System.out.println(b[i]+"\t");
		}
		
		int r[]=new int[16];

		int g=-1;
		for(int i=0;i<16;i++)
		{
			int count=1;
			for(int j=i+1;j<16;j++)
			{
				if(b[i]==b[j])
				{
					count++;
					r[j]=g;
				}
			}
			if(r[i]!=g)
			{
				r[i]=count;
			}
		}
		
		System.out.println("Number Frequency");
		for(int i=0;i<r.length;i++)
		{
			if(r[i]!=g)
			{
				System.out.println(b[i]+" "+r[i]+" ");
			}
		}
	}
}

