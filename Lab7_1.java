package myproject;
import java.util.*;


class lab
{
    public String num;
    
    lab(String n) throws datatype,len
    {
        
        if(n.length()!=12)
        {
            throw new len("Not a valid number");
        }
        
        for(int i=0;i<12;i++)
        {
            if(Character.isLetter(n.charAt(i)))
            {
                throw new datatype("Invalid number - no characters");
            }
        }
        
        this.num=n;
    }
}



class datatype extends Exception
{
    public String info;
    
    datatype(String a)
    {
        this.info=a;
    }
    
    public String toString()
    {
        return this.info;
    }
}


public class Main
{
	public static void main(String[] args) 
	{
	    Scanner Sc=new Scanner(System.in);
	    
	    System.out.println("Give number");
	    String n=Sc.next();
        int chances=0;
	
	        
        try
        {
            lab l1=new lab(n);
            System.out.println("The mobile number is "+n);
            chances=chances+1;
        
        } 
        catch(datatype e)
        {
            System.out.println(e);
        }
    
        catch(len e)
        {
            System.out.println(e);
        }
	        
	   if(chances==0)
        {
            System.out.println("Try once last time");
            String n1=Sc.next();
                    try 
                    {
                        lab l1=new lab(n1);
                        System.out.println("Retyped number : "+n);
                        
                    } 
                    catch(datatype e) 
                    {
                        System.out.println(e);
                        System.out.println("Chances over");
                        System.exit(0);
                    }

                    catch(len e)
                    {
                        System.out.println(e);
                        System.out.println("Chances over");
                        System.exit(0);
                    }
        }
	        
	}
}

class len extends Exception
{
    public String infor;
    
    len(String a)
    {
        this.infor=a;
    }
    
    public String toString()
    {
        return this.infor;
    }
}
