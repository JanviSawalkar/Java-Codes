import java.io.*;

class Showroom{

	int noOfCars = 0;
	String CarCompany = null;
	int noOfTwowheelers = 0;
	String Cartype = null;

	Showroom(){
	
		noOfcars = 0;
		CarCompany = null;
		noOfTwowheelers = 0;
		Cartype = null;

	}
	
	Showroom(int noOfCars ,String CarCompany, int noOfTwowheelers,String Cartype){

		this.noOfCars = noOfCars;
		this.CarCompany = CarCompany;
		this.noOfTwowheelers = noOfTwowheelers;
		this.Cartype = Cartype;

	}

	void display(){

		System.out.println("No Of Cars : " +this.noOfCars);
		System.out.println("CarCompany in Showroom       : " +this.CarCompany);
		System.out.println("Total no of noOfTwowheelers      : " +this.noOfTwowheelers);
		System.out.println("type of car          : " +this.Cartype);

	}
	
	int getnoOfCars(){

		return this.noOfCars;

	}
	
	void setnoOfCars(int noOfCars){

		this.noOfCars = noOfCars;

	}

	String getCarCompany(){

		return this.CarCompany;

	}

	void setCarCompany(int CarCompany){

		this.CarCompany = CarCompany;

	}
	
		
	int getnoOfTwowheelers(){

		return this.noOfTwowheelers;

	}

	void setnoOfTwowheelers(int noOfTwowheelers){

		this.noOfTwowheelers = noOfTwowheelers;

	}

	String getcartype(){

		return this.Cartype;

	}

	void setcartype(String Cartype){

		this.Cartype =Cartype;

	}

		
	

}

class Client{

	public static void main(String[] args) throws IOException{
		Showroom Showroom = new Showroom(15 , "mercedes" , 5 , "electric");
		Showroom.display();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter no of cars,CarCompany , noOfTwowheelers, type of car");

		Showroom.setnoOfCars(Integer.parseInt(br.readLine()));
		Showroom.setCarCompany(br.readLine());
		Showroom.setnoOfTwowheelers(Integer.parseInt(br.readLine()));
		Showroom.setcartype(br.readLine());
		Showroom.display();



	}

}