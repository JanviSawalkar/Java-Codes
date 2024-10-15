abstract class Sports{

		
	abstract void Rules();

}

class Cricket extends Sports{

	void Rules(){

		System.out.println("Writing essay");

	}


}

class Client{

	public static void main(String[] args){

		Sports spr = new Cricket();
		spr.Rules();


	}
}
