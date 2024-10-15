import java.io.*;

class ShopperStop{

	int noOfsections = 0;
	int noOfBrands = 0;
	String BrandName = null;
	int Trialrooms = 0;
	
	
	Space(){
	
		noOfsections = 0;
		noOfBrands = 0;
		BrandName = null;
		Trialrooms = 0;
	

	}
	
	Space(int noOfsections ,int noOfBrands, String BrandName, int Trialrooms){

		this.noOfsections = noOfsections;
		this.noOfBrands = noOfBrands;
		this.BrandName = BrandName;
		this.Trialrooms = Trialrooms;
		

	}

	void display(){

		System.out.println("No Of galaxies in space are : " +this.noOfsections);
		System.out.println("Total no of noOfBrands in space       : " +this.noOfBrands);
		System.out.println("Galaxy name             : " +this.BrandName);
		System.out.println("Total no of Trialrooms      : " +this.Trialrooms);
		}
	
	int getnoOfsections(){

		return this.noOfsections;

	}
	
	void setnoOfsections(int noOfsections){

		this.noOfsections = noOfsections;

	}

	int getnoOfBrands(){

		return this.noOfBrands;

	}

	void setnoOfBrands(int noOfBrands){

		this.noOfBrands = noOfBrands;

	}
	
	String getBrandName(){

		return this.BrandName;
	}

	void setBrandName(String BrandName){

		this.BrandName = BrandName;

	}
	
	int getTrialrooms(){

		return this.Trialrooms;

	}

	void setTrialrooms(int Trialrooms){

		this.Trialrooms = Trialrooms;

	}

	
	
	
	

}

class Client{

	public static void main(String[] args) throws IOException{
		Space Space = new Space(3 , 17 , "Pooma", 7);
		Space.display();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter no of sections ,noOfBrands , BrandName ,Trialrooms");

		Space.setnoOfsections(Integer.parseInt(br.readLine()));
		Space.setnoOfBrands(Integer.parseInt(br.readLine()));
		Space.setBrandName(br.readLine());
		Space.setTrialrooms(Integer.parseInt(br.readLine()));
		Space.setplanets(Integer.parseInt(br.readLine()));
		Space.display();



	}

}