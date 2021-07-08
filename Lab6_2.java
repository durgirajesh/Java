package myproject;

import java.util.*;
import java.util.Random;




interface employee
{	
	public int a=1,b=2,c=3,d=4,e=5;
}


class promotion implements employee
{
	public void status(int r1)
	{
		if(r1==a)	
			System.out.println("Not Eligible");
		else if(r1==b)
			System.out.println("Poor");
		else if(r1==c)
			System.out.println("Average");
		else if(r1==d)
			System.out.println("Good");
		else if(r1==e)
			System.out.println("Excellent");
	}
}

public class lab6
{
    public static void main(String[] args)
    {
    	promotion p1=new promotion();
    	
    	
    	int M=5;
    	int m=1;
    	int r=M-m+1;
    	
    	int b=(int)(Math.random()*r)+m;
    	System.out.println(b);
    	p1.status(b);
    }
}

