package com.RTO.service;

public abstract class Vehicle {

		 protected String ownerName;
		 protected  int modelYr;
		 protected  int vehicleId;
		 protected  String modelName;
		 protected long licenseNo;
		 protected String state;
		 protected String vehicleNo;
		
		protected static final String country="India";
		
		public void Vehiclereg(String ownerName,int modelYr,int vehicleId,String modelName,long licenseNo,String state, String vehicleNo)
		{
			this.ownerName=ownerName;
			this.modelYr=modelYr;
			this.vehicleId=vehicleId;
			this.modelName=modelName;
			this.licenseNo=licenseNo;
			this.state=state;
			this.vehicleNo=vehicleNo;
		}
		
		public abstract boolean regCar();
		public abstract void regDetails();	
}
