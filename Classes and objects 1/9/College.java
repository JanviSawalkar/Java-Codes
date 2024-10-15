import java.io.*;

class college{

	int noOfclasses = 0;
	int noOfseminarhall = 0;
	String DepartmentName = null;
	int noOfbuildings = 0;
	
	college(){
	
		noOfclasses = 0;
		noOfseminarhall = 0;
		DepartmentName = null;
		noOfbuildings = 0;

	}
	
	college(int noOfclasses ,int noOfseminarhall, String DepartmentName, int noOfbuildings){

		this.noOfclasses = noOfclasses;
		this.noOfseminarhall = noOfseminarhall;
		this.DepartmentName = DepartmentName;
		this.noOfbuildings = noOfbuildings;

	}

	void display(){

		System.out.println("No Of classrooms in college: " +this.noOfclasses);
		System.out.println("No of seminar halls in college       : " +this.noOfseminarhall);
		System.out.println("Department name  : " +this.DepartmentName);
		System.out.println("Total no of buildings in campus      : " +this.noOfbuildings);

	}
	
	int getnoOfclasses(){

		return this.noOfclasses;

	}
	
	void setnoOfclasses(int noOfclasses){

		this.noOfclasses = noOfclasses;

	}

	int getseminarhalls(){

		return this.noOfseminarhall;

	}

	void setseminarhalls(int noOfseminarhall){

		this.noOfseminarhall = noOfseminarhall;

	}
	
	String getDepartmentName(){

		return this.DepartmentName;
	}

	void setDepartmentName(String DepartmentName){

		this.DepartmentName = DepartmentName;

	}
	
	
	int getnoOfbuildings(){

		return this.noOfbuildings;
	}

	void setnoOfbuildings(int noOfbuildings){

		this.noOfbuildings = noOfbuildings;

	}

	
	
	

}

class Client{

	public static void main(String[] args) throws IOException{
		college Space = new college(50, 4 , "AI" , 5);
		Space.display();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter no ofclasses , seminar halls, department name, buildings");

		Space.setnoOfclasses(Integer.parseInt(br.readLine()));
		Space.setseminarhalls(Integer.parseInt(br.readLine()));
		Space.setDepartmentName(br.readLine());
		Space.setnoOfbuildings(Integer.parseInt(br.readLine()));
		Space.display();



	}

}