class Instagram{

	Instagram(){

		System.out.println("In Const: Instagram");
	}

}
class Threads extends Instagram{

	Threads(){

		System.out.println("In Const: THreads");

	}

}
class Client{

	public static void main(String[] args){

		Instagram inst = new Threads();

	}
}