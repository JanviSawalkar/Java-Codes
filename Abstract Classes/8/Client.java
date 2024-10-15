abstract class Documentation{
	
	abstract void write();

}

class Report extends Documentation{
	
	void write(){

		System.out.println("In Report ");

	}
}

class Client{

	public static void main(String[] args){

		Documentation doc = new Report();
		doc.write();

	}
}
