class RoomChargeCalculator {

	private double fixedFee;
	private double balcony;
	private double parking;
	private double tv;
	private double kitchen;
	private double wifi;

	public RoomChargeCalculator() {
		this.fixedFee = fixedFee;
		this.balcony = balcony;
		this.parking = parking;
		this.tv = tv;
		this.kitchen = kitchen;
		this.wifi = wifi;
	}

	public void getChargeDeluxDouble(boolean balcony,boolean parking,boolean tv,boolean kitchen,boolean wifi) {
		
		 fixedFee = 5000;
		 
		 
		 if(balcony) {
			 this.balcony = 500;
		 }
		 
		 if (parking) {
			this.parking = 200;	
		 }
		 
		 if(tv) {
			this.tv = 200;	
		 }

		 if (kitchen) {
			 this.kitchen = 1000; 
		 }

		 if (wifi) {
			 this.wifi = 100; 
		 }else {
			 System.out.println("\nNo additional charges");
		 }
	}

	public void getChargeStandardFamily(boolean parking,boolean kitchen,boolean garden) {
		
		 fixedFee = 3000;
		 
		 if (parking) {
			this.parking = 200;	
		 }
		 
		 if(kitchen) {
			 this.kitchen = 500;
		 }
			 
		 if (garden) {
			 this.garden = 200;
		 
		 }else {
			 System.out.println("\nNo additional charges\n");
		 }

	}
}