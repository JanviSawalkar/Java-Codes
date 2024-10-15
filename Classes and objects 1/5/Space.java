import java.io.*;

class Space{

	int noOfGalaxies = 0;
	int satellites = 0;
	String Galaxyname = null;
	int stars = 0;
	int planets = 0;
	
	Space(){
	
		noOfGalaxies = 0;
		satellites = 0;
		Galaxyname = null;
		stars = 0;
		planets = 0;

	}
	
	Space(int noOfGalaxies ,int satellites, String Galaxyname, int stars,int planets){

		this.noOfGalaxies = noOfGalaxies;
		this.satellites = satellites;
		this.Galaxyname = Galaxyname;
		this.stars = stars;
		this.planets = planets;

	}

	void display(){

		System.out.println("No Of galaxies in space are : " +this.noOfGalaxies);
		System.out.println("Total no of satellites in space       : " +this.satellites);
		System.out.println("Galaxy name             : " +this.Galaxyname);
		System.out.println("Total no of stars      : " +this.stars);
		System.out.println("Total no of planets            : " +this.planets);

	}
	
	int getnoOfGalaxies(){

		return this.noOfGalaxies;

	}
	
	void setnoOfGalaxies(int noOfGalaxies){

		this.noOfGalaxies = noOfGalaxies;

	}

	int getsatellites(){

		return this.satellites;

	}

	void setsatellites(int satellites){

		this.satellites = satellites;

	}
	
	String getGalaxyname(){

		return this.Galaxyname;
	}

	void setGalaxyname(String Galaxyname){

		this.Galaxyname = Galaxyname;

	}
	
	int getstars(){

		return this.stars;

	}

	void setstars(int stars){

		this.stars = stars;

	}

	int getplanets(){

		return this.planets;
	}

	void setplanets(int planets){

		this.planets = planets;

	}

	
	
	

}

class Client{

	public static void main(String[] args) throws IOException{
		Space Space = new Space(5 , 10 , "MilkyWAy", 500 , 8);
		Space.display();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter no of galaxies,satellites , Galaxyname ,stars, planets");

		Space.setnoOfGalaxies(Integer.parseInt(br.readLine()));
		Space.setsatellites(Integer.parseInt(br.readLine()));
		Space.setGalaxyname(br.readLine());
		Space.setstars(Integer.parseInt(br.readLine()));
		Space.setplanets(Integer.parseInt(br.readLine()));
		Space.display();



	}

}