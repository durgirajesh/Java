import java.util.*;

interface usercompare{
    public void compare(double area);
}

interface userclone{
    public Object clone();
}

abstract class uobject{
    public double area;
    
    abstract void areacal();
    
    public void display()
    {
        System.out.println(area);
    }
    
}

class circle1 extends uobject implements usercompare,userclone
{
    private double r1;
    
    circle1(double radius)
    {
        this.r1=radius;
    }
    
    void areacal()
    {
        super.area=3.14*r1*r1;
        super.display();
    }
    
    public void compare(double a1)
    {
        System.out.println(a1);
         if(this.area==a1)
        {
           System.out.println("same area");
        }
        else if(this.area<a1)
        {
           System.out.println("Area of t1 is less than t2");
            
        }
        else
        {
           System.out.println("Area of c1 is greater than c2");
        }
    }
    
    public circle1 clone()
    {
        return this;
    }
}

class triangle1 extends uobject implements usercompare,userclone
{
    private double b,h;
    
    triangle1(double base,double height)
    {
        this.b=base;
        this.h=height;
    }
    
    void areacal()
    {
        super.area=0.5*b*h;
        super.display();
    }
    
    public void compare(double a1)
    {
        System.out.println(a1);
        if(this.area==a1)
        {
           System.out.println("same area");
        }
        else if(this.area<a1)
        {
           System.out.println("Area of c1 is less than c2");
            
        }
        else
        {
           System.out.println("Area of c1 is greater than c2");
        }
    }
    
    public triangle1 clone()
    {
        return this;
    }
}

public class Main 
{
    public static void main(String[] args)
    {
        circle1 c1=new circle1(5);
        c1.areacal();
        
        circle1 c2=c1.clone();
        c1.compare(c2.area);
        
        triangle1 t1=new triangle1(12.3,1.4);
        t1.areacal();
        
        triangle1 t2=t1.clone();
        t2.compare(t1.area);
    }
}
