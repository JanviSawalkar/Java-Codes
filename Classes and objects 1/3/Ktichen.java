import java.io.*;

class Kitchen{

	int noOfcutleries = 0;
	int noOfUtensils = 0;
	String StoveBrand = null;
	int minicupboards = 0;
	String FreezeBrand = null;
	
	Kitchen(){
	
		noOfcutleries = 0;
		noOfUtensils = 0;
		StoveBrand = null;
		minicupboards = 0;
		FreezeBrand = null;

	}
	
	Kitchen(int noOfcutleries ,int noOfUtensils, String StoveBrand, int minicupboards,String FreezeBrand){

		this.noOfcutleries = noOfcutleries;
		this.noOfUtensils = noOfUtensils;
		this.StoveBrand = StoveBrand;
		this.minicupboards = minicupboards;
		this.FreezeBrand = FreezeBrand;

	}

	void display(){

		System.out.println("No of cutleries in Kitchen are : " +this.noOfcutleries);
		System.out.println("No of utensils in kitchen       : " +this.noOfUtensils);
		System.out.println("Brand of stove in  Kitchen             : " +this.StoveBrand);
		System.out.println("Total no. of minicupbords in kitchen      : " +this.minicupboards);
		System.out.println("Brand of freeze in kitchen          : " +this.FreezeBrand);

	}
	
	int getnoOfcutleries(){

		return this.noOfcutleries;

	}
	
	void setnoOfcutleries(int noOfcutleries){

		this.noOfcutleries = noOfcutleries;

	}

	int getnoOfUtensils(){

		return this.noOfUtensils;

	}

	void setnoOfUtensils(int noOfUtensils){

		this.noOfUtensils = noOfUtensils;

	}
	
	String getStoveBrand(){

		return this.StoveBrand;
	}

	void setStoveBrand(String StoveBrand){

		this.StoveBrand = StoveBrand;

	}
	
	int getminiCupboards(){

		return this.minicupboards;

	}

	void setminiCupboards()(int minicupboards){

		this.minicupboards = minicupboards;

	}

	String getFreezeBrand(){

		return this.FreezeBrand;
	}

	void setFreezeBrand(String FreezeBrand){

		this.FreezeBrand = FreezeBrand;

	}

	
	
	

}

class Client{

	public static void main(String[] args) throws IOException{
		Kitchen Kitchen = new Kitchen(15 , 40 , "Prestige", 6 , "Whirpool");
		Kitchen.display();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter no of cutleries,no of utensils ,Stove brand , mini cupboards, freeze brand");

		Kitchen.setnoOfcutleries(Integer.parseInt(br.readLine()));
		Kitchen.setnoOfUtensils(Integer.parseInt(br.readLine()));
		Kitchen.setStoveBrand(br.readLine());
		Kitchen.setminiCupBoards(Integer.parseInt(br.readLine()));
		Kitchen.setFreezeBrand(br.readLine());
		Kitchen.display();



	}

}