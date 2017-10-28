import java.io.*;
import java.util.*;


public class basics extends Employee {
	int bonus=4500;
    public static void main(String[] args) throws IOException {
    	basics bs=new basics();

    //operations

    	int a=10;
    	int b=20,s=1;
    	System.out.println(a+b);

 	//Conditional
    	if(a>b)
    	{
			System.out.println("a is Greater");
    	}
    	else
    	{
    		System.out.println("B is Greater");
    	}

    	switch(s)
    	{
    		case 1: 
    				System.out.println("Case 1 executed");
    				break;
    		default:
    				System.out.println("Default executed");

    	}

    //Looping
    	
    	while(a<20)
    	{
    		System.out.println(a);
    		a++;
    	}	
    	do{
    		System.out.println(a);
    		a--;
    	}while(a>0);

//inheritance
   System.out.println(bs.salary);
   System.out.println(bs.bonus);
    }
}

class Employee
{
	float salary=50000;
}