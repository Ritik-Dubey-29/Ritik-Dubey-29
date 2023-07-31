import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        
        Doctor[] doctors=new Doctor[n];
        for(int i=0;i<=doctors.length;i++){
            int id=sc.nextInt();
            int age=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            Double Salary=sc.nextDouble();sc.nextLine();
            
            Doctors[i]=new Doctor(id,age,name,salary);
        }
        
        Doctor res1= findMaximumAgeDoctor(Doctors);
        if(res1!=null){
        	System.out.println("id"+res1.getid());
            System.out.println("age"+res1.getage());
            System.out.println("name"+res1.getname());
            System.out.println("salary"+res1.getsalary());
        }
      
        String name=sc.nextLine();
        Bus res2=Doctors[i]; searchDoctorByName(Doctors,name);
        if(res2!=null){
            	  System.out.println("id"+res2.getid());
                  System.out.println("age"+res2.getage());
                  System.out.println("name"+res2.getname());
                  System.out.println("Salary"+res2.getsalary());
        }
       
        else{
            System.out.println("No Doctor found with mentioned Name.");
        }
        
    }
    
public static Doctor findMaximumAgeDoctor(Doctor[] Doctors){
    Doctor res1=null;
    int max=Integer.MIN_VALUE;
    
    for(int i=0;i<Doctors.length;i++){
        if(buses[i].getage()>=max){
            max=Doctors[i].getage();
            res1=Doctors[i];
        }
    }
    return res1;
} 

public static Bus searchDoctorByName(Doctor[] doctors,String name ){
	 Bus res2=null;
     
     for(int i=0;i<Doctors.length;i++){
         if(Doctors[i].getname().equalsIgnoreCase(name)){
             res2=Doctors[i];
         }
     }
     return res2;
}
}

class Doctor{
    int id;
    int age;
    String name;
    double salary;
    
    Doctor(int id, int age,String name,double salary){
    	this.id=id;
    	this.age=age;
    	this.name=name;
    	this.salary=salary;
    }
	public int getid() {
		return id;
	}

	public int getage() {
		return age;
	}

	public String getname() {
		return name;
	}
	
	public Double getsalary() {
		return salary;
	}  
}