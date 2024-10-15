class Mercedes{

	Mercedes(){

		System.out.println("In Cons: Mercedes");
	}

}

class Cclass extends Mercedes{

	Cclass(){
	
		System.out.println("In Cons: Cclass");
	}

}

class GWagon extends Mercedes{

	GWagon(){

		System.out.println("In Cons: Gwagon");
	}

}

class Client{

	public static void main(String[] args){

		Mercedes mer = new Cclass();
		Mercedes mer2 = new GWagon();



	}

}
 