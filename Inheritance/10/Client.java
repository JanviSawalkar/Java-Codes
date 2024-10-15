class Sanskrit{

	Sanskrit(){

		System.out.println("In const: Sanskrit");

	}

}

class Marathi extends Sanskrit{

	Marathi(){

		System.out.println("In const: Marathi");

	}

}

class Hindi extends Sanskrit{

	Hindi(){

		System.out.println("In const: Hindi");

	}

}
class Client{

	public static void main(String[] args){

		Sanskrit sans = new Marathi();
		Sanskrit sans2 = new Hindi();

	}
}