package myproject;

import java.util.*;


public class first {
	public static void main(String[] args) {
		int arr[][]=new int[4][4];
		int b[][]=new int[4][4];
		int c[][]=new int[4][4];
		int Dia=0,Non=0,Id=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		for(int j=0;j<4;j++)
		{
			for(int k=0;k<4;k++)
			{
				b[j][k]=sc.nextInt();
			}
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("\n");
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				c[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if((i!=j)&&(arr[i][j]!=0))
				{
					Non=1;
				}
			}
		}
		
		if(arr[0][0]==1 && arr[1][1]==1 && arr[2][2]==1 && arr[3][3]==1 && Non!=1)
		{
			Id=1;
		}
		else
		{
			Dia=1;
		}
			
		
		System.out.println(Dia+" ");
		System.out.println(Non+" ");
		System.out.println(Id+" ");
		
		int mul[][]=new int[4][4];
		
		if(Dia==1)
		{
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					for(int k=0;k<4;k++)
					{
						mul[i][j]+=b[i][k]*c[k][j];
					}
				}
			}
		}
		else if(Non==1)
		{
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					mul[i][j]=b[i][j]+c[i][j];
				}
			}
		}
		else
		{
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					mul[j][i]=c[i][j];
				}
			}
		}
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(mul[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}
