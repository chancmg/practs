import java.util.*;

class Empytest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n,d;
        double s;
        ArrayList<Employee> al=new ArrayList<Employee>();

        System.out.println("Enter the number of Employees");
        int num=sc.nextInt();
        do{
            System.out.println("Enter Employee name:");
            n=sc.next();

            System.out.println("Enter the Domain:");
            d=sc.next();

            System.out.println("Enter the Salary");
            s=sc.nextDouble();

            al.add(new Employee(n,d,s));

            System.out.println("Employee added to DB");
            num-=1;
        }while(num>0);

        Iterator it=al.iterator();

        while(it.hasNext())
        {
            Employee e=(Employee)it.next();
            System.out.println("Recorded Details");
            e.raisesal();
            e.raisesal();
            e.raisesal();
            e.raisesal();
            e.raisesal();
            e.raisesal();
            e.raisesal();
            System.out.println("Name:"+e.getName()+"\nSalary:"+e.getSalary()+"\nDomain:"+e.getDomain());
        }

        
    }

    
}

class Employee{
    private String name;
    private String domain;
    private double salary;


Employee(String name,String domain,double salary)
{
this.name=name;
this.domain=domain;
this.salary=salary;
}

public String getName()
{
return name;
}

public String getDomain()
{
    return domain;
}

public double getSalary()
{
    return salary;
}

void raisesal()
{
    this.salary+=1000;
}

}