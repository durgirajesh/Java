package myproject;
import java.util.*;

class bank
{
    String actnum;
    String Name;
    double Bal;
    
    
    bank(String a,String b, double c) throws bal,fail
    {
        actnum=a;
        Name=b;
        Bal=c;
        
        System.out.println("Account number : "+actnum+"\nUser : "+Name+"\nBalance : "+Bal);
        
        if(Bal<200)
        {
            throw new bal("Balance is less than 200!");
        }
        
        Random r1=new Random();
        int num=r1.nextInt(1000);
        
        System.out.println("random number : "+num);
        if(num%2==0)
        {
            throw new fail("Transaction wasnt concurrent");
        }
    }
}

class bal extends Exception
{
    String info;

    bal(String a)
    {
        this.info = a;
    }
    public String toString()
    {
        return this.info;
    }
}

class fail extends Exception
{
    String info;

    fail(String b)
    {
        this.info=b;
    }
    public String toString()
    {
        return this.info;
    }
}


public class Main
{
	public static void main(String[] args) {
		
		int add=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter account number : ");
		String a=sc.next();
		System.out.println("Enter name");
		String b=sc.next();
		System.out.println("Enter balance");
		int d=sc.nextInt();
		
		try 
		{
		    bank b1=new bank(a,b,d);
		} 
		catch(bal e) 
		{
		    System.out.println(e);
		    add=add+1;
		}
		catch(fail e)
		{
		    System.out.println(e);
		}
		
		finally
		{
		    if(add==0)
		    {
		        System.out.println("Transaction Succesfull");
		    }
		    else
		    {
		        System.out.println("Transaction didnt commit or interrupted");
		    }
		}
		
	}
}
