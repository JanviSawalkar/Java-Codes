class Receipe{

	Receipe(){

		System.out.println("In Const: Receipe");
	}
}

class BreakFastReceipe extends Receipe{

	BreakFastReceipe(){

		System.out.println("In Const:BreakFastReceipe ");
	

	}
	

}

class Client{

	public static void main(String[] args){

		Receipe rec = new BreakFastReceipe();

	}


}