package com.pack.lombokdemo;

import lombok.NonNull;

public class App 
{
    public static void main( String[] args )
    {
        Emp e1 = new Emp("Ramesh", 21, 25000, "Programmer");
        display(e1);
        
//        Emp e2 = new Emp("Ramesh", 21, 25000, "Programmer");
//        e1.setAge(35);
//        e1.setDesignation("Manager");
//        e1.setSalary(45000);
//        
//        System.out.println(e1);
//        System.out.println(e2);
//        System.out.println(e1.equals(e2));

    }
    public static void display(@NonNull Emp e) {
    	System.out.println("Display");
    	System.out.println(e);
    }
}
