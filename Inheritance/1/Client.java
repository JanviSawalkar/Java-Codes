class India{

	India(){

		System.out.println("In Cons: INDIA");

	}

}

class Maharashtra extends India{

	Maharashtra(){
	
		System.out.println("In Cons: MAHARASHTRA");

	}

}

class Yavatmal extends Maharashtra{

	Yavatmal(){

		System.out.println("In Cons: Yavatmal");

	}

}

class Client{

	public static void main(String [] args){

		India ind = new Yavatmal();


	}


}