abstract class Receipe{
	
	abstract void cook();

}

class CakeReceipe extends Receipe{
	
	void cook(){

		System.out.println("In CakeReceipe");

	}
}

class Client{

	public static void main(String[] args){

		Receipe rec = new CakeReceipe();
		rec.CakeReceipe();
	}
}
