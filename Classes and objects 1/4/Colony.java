import java.io.*;

class Colony{

	int noOfHouses = 0;
	int Parkingareas = 0;
	String GardenName = null;
	int noOfBuildings = 0;
	int noOfFamilies = 0;
	
	Colony(){
	
		noOfHouses = 0;
		Parkingareas = 0;
		GardenName = null;
		noOfBuildings = 0;
		noOfFamilies = 0;

	}
	
	Colony(int noOfHouses ,int Parkingareas, String GardenName, int noOfBuildings,int noOfFamilies){

		this.noOfHouses = noOfHouses;
		this.Parkingareas = Parkingareas;
		this.GardenName = GardenName;
		this.noOfBuildings = noOfBuildings;
		this.noOfFamilies = noOfFamilies;

	}

	void display(){

		System.out.println("No of Folders in Colony are : " +this.noOfHouses);
		System.out.println("Price of Colony is          : " +this.Parkingareas);
		System.out.println("Brand of Colony             : " +this.GardenName);
		System.out.println("Batterylife of Colony       : " +this.noOfBuildings);
		System.out.println("Type of display             : " +this.noOfFamilies);

	}
	
	int getnoOfHouses(){

		return this.noOfHouses;

	}
	
	void setnoOfHouses(int noOfHouses){

		this.noOfHouses = noOfHouses;

	}

	int getParkingareas(){

		return this.Parkingareas;

	}

	void setParkingareas(int Parkingareas){

		this.Parkingareas = Parkingareas;

	}
	
	String getGardenName(){

		return this.GardenName;
	}

	void setGardenName(String GardenName){

		this.GardenName = GardenName;

	}
	
	int getnoOfBuildings(){

		return this.noOfBuildings;

	}

	void setnoOfBuildings(int noOfBuildings){

		this.noOfBuildings = noOfBuildings;

	}

	int getnoOfFamilies(){

		return this.noOfFamilies;
	}

	void setnoOfFamilies(int noOfFamilies){

		this.noOfFamilies = noOfFamilies;

	}

	
	
	

}

class Client{

	public static void main(String[] args) throws IOException{
		Colony Colony = new Colony(20 , 10 , "Vivekanand Garden", 7 , 17);
		Colony.display();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter no of Houses, Parking areas , GardenName ,noOfBUildings, noOfFamilies");

		Colony.setnoOfHouses(Integer.parseInt(br.readLine()));
		Colony.setParkingareas(Integer.parseInt(br.readLine()));
		Colony.setGardenName(br.readLine());
		Colony.setnoOfBuildings(Integer.parseInt(br.readLine()));
		Colony.setnoOfFamilies(Integer.parseInt(br.readLine()));
		Colony.display();



	}

}