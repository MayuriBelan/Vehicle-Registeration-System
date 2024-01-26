package com.RTO.impl;
import com.RTO.service.*;
import java.util.*;

public class Car extends Vehicle{
	Scanner s=new Scanner(System.in);
	@Override
	public boolean regCar()
	{
		System.out.println("Do you have license?\n1\n Enter true if you have license otherwise enter false");
		boolean flag=s.nextBoolean();
		
		if(flag==true) {
			
		System.out.println("Enter license no: ");
		long licenseNo=s.nextLong();
		System.out.println("Enter owner name: ");
		String s1=s.nextLine();
		String ownerName=s.nextLine();
		System.out.println("Enter Model Year: ");
		int modelYr=s.nextInt();
		System.out.println("Enter vehicle ID: ");
		int vehicleId=s.nextInt();
		System.out.println("Enter model name: ");
		String modelName=s.next();
		System.out.println("Enter State: ");
		String state=s.next();
		System.out.println("Enter Vehicle No. ");
		String vehicleNo=s.next();
		Vehiclereg(ownerName, modelYr,vehicleId,modelName,licenseNo,state,vehicleNo);
		}
		else
			System.out.println("Please get a license first");
		return flag;
     }

	public void regDetails() 
	{
   	System.out.println("*******************Vehicle details***************************");
	System.out.println("Vehicle no: "+vehicleNo);
	System.out.println("Vehicle id: "+vehicleId);
	System.out.println("model name: "+modelName);
	System.out.println("Model Year: "+modelYr);
	System.out.println("Owner name: "+ownerName);
	System.out.println("license no: "+licenseNo);
	System.out.println("country: "+country);
	System.out.println("State: "+state+"\n");
  }
}
