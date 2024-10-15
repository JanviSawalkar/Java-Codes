class Reliance{

	Reliance(){

		System.out.println("In const: Reliance");

	}

}

class RelianceJio extends Reliance{

	RelianceJio(){

		System.out.println("In const: RelianceJio");

	}

}
class Client{

	public static void main(String[] args){

		Reliance rel = new RelianceJio();


	}
}