import java.io.*;

class Mobile{

	int noOfapps = 0;
	int priceOfMobile = 0;
	String mobileBrand = null;
	int mobBatteryLife = 0;
	String typeOfDisplay = null;
	
	Mobile(){
	
		noOfapps = 0;
		priceOfMobile = 0;
		mobileBrand = null;
		mobBatteryLife = 0;
		typeOfDisplay = null;

	}
	
	Mobile(int noOfapps ,int priceOfMobile, String mobileBrand, int mobBatteryLife,String typeOfDisplay){

		this.noOfapps = noOfapps ;
		this.priceOfMobile = priceOfMobile;
		this.mobileBrand = mobileBrand;
		this.mobBatteryLife = mobBatteryLife;
		this.typeOfDisplay = typeOfDisplay;
	}

	void display(){

		System.out.println("No of apps in mobile are    : " +this.noOfapps);
		System.out.println("Price of mobile is          : " +this.priceOfMobile);
		System.out.println("Brand of mobile             : " +this.mobileBrand);
		System.out.println("Batterylife of mobile       : " +this.mobBatteryLife);
		System.out.println("Type of display             : " +this.typeOfDisplay);

	}
	
	int getNoOfApps(){

		return this.noOfapps;

	}
	
	void setNoOfApps(int noOfapps){

		this.noOfapps = noOfapps;

	}

	int getPriceOfMobile(){

		return this.priceOfMobile;

	}

	void setPriceOfMobile(int priceOfMobile){

		this.priceOfMobile = priceOfMobile;

	}
	
	String getMobileBrand(){

		return this.mobileBrand;
	}

	void setMobileBrand(String mobileBrand){

		this.mobileBrand = mobileBrand;

	}
	
	int getBatteryLife(){

		return this.mobBatteryLife;

	}

	void setBatteryLife(int mobBatteryLife){

		this.mobBatteryLife = mobBatteryLife;

	}

	String getDisplayType(){

		return this.typeOfDisplay;
	}

	void setDisplayType(String typeOfDisplay){

		this.typeOfDisplay = typeOfDisplay;

	}

	
	
	

}

class Client{

	public static void main(String[] args) throws IOException{
		Mobile mob = new Mobile(20 , 35000 , "Samsung", 5 , "Gorilla Display");
		mob.display();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter no of apps, Mobile price , Mobile brand ,Batterylife of mobile, display");

		mob.setNoOfApps(Integer.parseInt(br.readLine()));
		mob.setPriceOfMobile(Integer.parseInt(br.readLine()));
		mob.setMobileBrand(br.readLine());
		mob.setBatteryLife(Integer.parseInt(br.readLine()));
		mob.setDisplayType(br.readLine());
		mob.display();



	}

}