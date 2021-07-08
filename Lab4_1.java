import java.util.Scanner;

import java.util.*;

class myDate
{
	int date;
	int month;
	int year;
	
	String[] mon={"January","Febraury","march","april","may","June","July","August","September","October","November","December"};
	int[] num={31,28,31,30,31,30,31,31,30,31,30,31};
	
	myDate(int a,int b,int c)
	{
		date=a;
		month=b;
		year=c;
		
		if(date < 1 || date >31)
		{
		    System.out.println("Invalid date");
		}
		else if(month<1 || month>12)
		{
		    System.out.println("Invalid year");
		}
	}
	
	public void disp()
	{
	    System.out.println(month+"/"+date+"/"+year);
	}
	
	public void disp1()
	{
	    System.out.println(mon[month-1]+" "+date+","+year);
	}
		
	public void nextday()
	{
	    int d=num[month-1];
	    int q=date;
	    int r=month;
	    int t=year;
	    int g;
	    
	    if(q==31 && r==12)
	    {
	        q=1;
	        r=1;
	        t=t+1;
	    }
	    else if(q==30 || q==31 && r!=12)
	    {
	        q=1;
	        r=r+1;
	    }
	    else
	    {
	        q=q+1;
	    }
	    System.out.println("Next day : "+r+"/"+q+"/"+t);
	    System.out.println(mon[r-1]+" "+q+","+t);
	}
	
	public void nextmonth()
	{
	    int a=month;
	    int b=date;
	    int c=year;
	    if(b==31 && a==12)
	    {
	        a=1;
	        b=num[a-1];
	        c=c+1;
	    }
	    else if(b!=31 && a==12)
	    {
	        a=1;
	    }
	    else if(b==31 || b==30 && a!=12)
	    {
	        a=a+1;
	        b=num[a-1];
	    }
	    else
	    {
	        a=a+1;
	    }
	    System.out.println("Next month : "+a+"/"+b+"/"+c);
	    System.out.println(mon[a-1]+" "+b+","+c);
	}
}

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		myDate D1=new myDate(31,12,2001);
		myDate D2=new myDate(12,7,2020);
		D1.disp();
		D2.disp1();
		D1.nextday();
		D1.nextmonth();
		System.out.println("------------------------");
		D2.nextday();
		D2.nextmonth();
	}
}
