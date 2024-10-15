class Samsung{

	Samsung(){

		System.out.println("In const: Samsung");

	}

}

class SamsungS23 extends Samsung{

	SamsungS23(){

		System.out.println("In const: SamsungS23");

	}

}
class Client{

	public static void main(String[] args){

		Samsung sam = new SamsungS23();


	}
}