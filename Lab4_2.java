import java.util.*;
class Bank{
    public int basic,DA,Total;
    public String bankname;
    public String branch;
    
    Bank()
    {
        bankname="Indian Bank";
        branch="VIT Branch";
    }
    
    public void salarycalc()
    {
        Total=basic+DA;
        System.out.println("Salary is : "+Total);
    }
}

class Employee extends Bank{
    private String Address="MUMBAI 40183";
    private String doj="April 10 2002";
    
    public void setsalary(int a,int b)
    {
        this.basic=a;
        this.DA=b;
    }
    
    public void getsalary()
    {
        System.out.println(bankname+"\n"+branch+"\n"+Address+"\n"+doj);
        super.salarycalc();
        
    }
    
}

public class Main{
    public static void main(String[] args)
    {
        Employee E1=new Employee();
        E1.setsalary(2000,505);
        E1.getsalary();
    }
}

