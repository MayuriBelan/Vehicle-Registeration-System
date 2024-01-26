package com.RTO.ui;
import java.util.*;

import com.RTO.impl.Car;
import com.RTO.service.Vehicle;

public class Test extends Car{

	public static void main(String[] args) {
		
		Vehicle v=new Car();
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("Welcome to RTO");
			System.out.println("1.Register your vehicle\n2.View details");
			System.out.println("What is your choice? ");
		int ch=s.nextInt();
			switch(ch)
			{
			case 1:v.regCar();
					break;
					
			case 2:v.regDetails();
					break;
					
			case 3: System.out.println("Wrong choice, please try again");		
					break;
			}
			
		}while(true);
			
       }

	}


