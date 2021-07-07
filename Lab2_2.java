package myproject;

public class Main {
	public static void main(String[] args)
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("8\t");
			}
			System.out.println("\n");
		}
		for(int i=4;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("8\t");
			}
			System.out.println("\n");
		}
	}
}
