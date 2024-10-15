import java.io.*;

class Artgallery{

	int Arts = 0;
	int Artists = 0;
	String Arttype = null;
	int DurationForArt = 0;
		
	Artgallery(){
	
		Arts = 0;
		Artists = 0;
		Arttype = null;
		DurationForArt = 0;
			}
	
	Artgallery(int Arts ,int Artists, String Arttype, int DurationForArt){

		this.Arts = Arts;
		this.Artists = Artists;
		this.Arttype = Arttype;
		this.DurationForArt = DurationForArt;
		

	}

	void display(){

		System.out.println("No Of galaxies in Artgallery are : " +this.Arts);
		System.out.println("Total no of Artists in Artgallery       : " +this.Artists);
		System.out.println("Galaxy name             : " +this.Arttype);
		System.out.println("Total no of DurationForArt      : " +this.DurationForArt);
	}
	
	int getArts(){

		return this.Arts;

	}
	
	void setArts(int Arts){

		this.Arts = Arts;

	}

	int getArtists(){

		return this.Artists;

	}

	void setArtists(int Artists){

		this.Artists = Artists;

	}
	
	String getArttype(){

		return this.Arttype;
	}

	void setArttype(String Arttype){

		this.Arttype = Arttype;

	}
	
	int getDurationForArt(){

		return this.DurationForArt;

	}

	void setDurationForArt(int DurationForArt){

		this.DurationForArt = DurationForArt;

	}

		
	

}

class Client{

	public static void main(String[] args) throws IOException{
		Artgallery Artgallery = new Artgallery(10 , 10 , "WarliPAinting", 10);
		Artgallery.display();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter no of Arts ,Artists , Arttype ,DurationForArt");

		Artgallery.setArts(Integer.parseInt(br.readLine()));
		Artgallery.setArtists(Integer.parseInt(br.readLine()));
		Artgallery.setArttype(br.readLine());
		Artgallery.setDurationForArt(Integer.parseInt(br.readLine()));
		Artgallery.display();



	}

}
