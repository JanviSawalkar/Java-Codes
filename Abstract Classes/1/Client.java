abstract class Literature{

	void read(){

		System.out.println("Reading");

	}
	
	abstract void write();

}

class Essay extends Literature{

	void read(){

		System.out.println("Reading Novel");

	}
	
	void write(){

		System.out.println("Writing essay");

	}


}

class Client{

	public static void main(String[] args){

		Literature lit = new Essay();
		lit.write();


	}
}
