import java.io.*;

class Laptop{

	int noOfFolders = 0;
	int priceOfLaptop = 0;
	String LaptopBrand = null;
	int LaptopBatteryLife = 0;
	String typeOfDisplay = null;
	
	Laptop(){
	
		noOfFolders = 0;
		priceOfLaptop = 0;
		LaptopBrand = null;
		LaptopBatteryLife = 0;
		typeOfDisplay = null;

	}
	
	Laptop(int noOfFolders ,int priceOfLaptop, String LaptopBrand, int LaptopBatteryLife,String typeOfDisplay){

		this.noOfFolders = noOfFolders;
		this.priceOfLaptop = priceOfLaptop;
		this.LaptopBrand = LaptopBrand;
		this.LaptopBatteryLife = LaptopBatteryLife;
		this.typeOfDisplay = typeOfDisplay;
	}

	void display(){

		System.out.println("No of Folders in Laptop are : " +this.noOfFolders);
		System.out.println("Price of Laptop is          : " +this.priceOfLaptop);
		System.out.println("Brand of Laptop             : " +this.LaptopBrand);
		System.out.println("Batterylife of Laptop       : " +this.LaptopBatteryLife);
		System.out.println("Type of display             : " +this.typeOfDisplay);

	}
	
	int getnoOfFolders(){

		return this.noOfFolders;

	}
	
	void setnoOfFolders(int noOfFolders){

		this.noOfFolders = noOfFolders;

	}

	int getPriceOfLaptop(){

		return this.priceOfLaptop;

	}

	void setPriceOfLaptop(int priceOfLaptop){

		this.priceOfLaptop = priceOfLaptop;

	}
	
	String getLaptopBrand(){

		return this.LaptopBrand;
	}

	void setLaptopBrand(String LaptopBrand){

		this.LaptopBrand = LaptopBrand;

	}
	
	int getBatteryLife(){

		return this.LaptopBatteryLife;

	}

	void setBatteryLife(int LaptopBatteryLife){

		this.LaptopBatteryLife = LaptopBatteryLife;

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
		Laptop Laptop = new Laptop(150 , 90000 , "HP", 6 , "Crystal Display");
		Laptop.display();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter no of apps, Laptop price , Laptop brand ,Batterylife of Laptop, display");

		Laptop.setnoOfFolders(Integer.parseInt(br.readLine()));
		Laptop.setPriceOfLaptop(Integer.parseInt(br.readLine()));
		Laptop.setLaptopBrand(br.readLine());
		Laptop.setBatteryLife(Integer.parseInt(br.readLine()));
		Laptop.setDisplayType(br.readLine());
		Laptop.display();



	}

}