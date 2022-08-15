class RoomChargeCalculator {

	private double fixedFee;
	private double balcony;
	private double parking;
	private double tv;
	private double kitchen;
	private double wifi;
	private double garden;
	private double ac;
	private double total;

	public RoomChargeCalculator() {
		this.fixedFee = fixedFee;
		this.balcony = balcony;
		this.parking = parking;
		this.tv = tv;
		this.kitchen = kitchen;
		this.wifi = wifi;
		this.garden = garden;
		this.ac = ac;
		this.total = total;
	}

	public void getChargeDeluxDouble(boolean balcony,boolean parking,boolean tv,boolean kitchen,boolean wifi) {
		
		fixedFee = 5000;
		total = fixedFee;
		 
		if(balcony) {
			this.balcony = 500;
			total += this.balcony;
		}
		 
		if (parking) {
			this.parking = 200;	
			total += this.parking;
		}
		 
		if(tv) {
			this.tv = 200;
			total += this.tv;
		}

		if (kitchen) {
			this.kitchen = 1000;
			total += this.kitchen;
		}

		if (wifi) {
			this.wifi = 100;
			total += this.wifi;
		}else {
			 System.out.println("\nNo additional charges");
		}
		 
		System.out.println("Total : " + total);
	}
	public void getChargeStandardFamily(boolean parking,boolean kitchen,boolean garden) {
		
		fixedFee = 3000;
		 
		total = fixedFee;
		 
		 if (parking) {
			this.parking = 200;	
			total += this.parking;
		}
		 
		if(kitchen) {
			this.kitchen = 500;
			total += this.kitchen;
		}
			 
		if (garden) {
			this.garden = 200;
			total += this.garden;
		 
		}else {
			System.out.println("\nNo additional charges\n");
		}
	
	}

	public void getChargeStandardSingle(boolean parking, boolean ac, boolean wifi) {

		fixedFee = 2000;
		total = fixedFee;

		if (parking) {
			this.parking = 200;
		}

		if (ac) {
			this.ac = 500;
		}

		if (wifi) {
			this.wifi = 100;
		} else {
			System.out.println("\nNo additional charges\n");
		}
	}	
}