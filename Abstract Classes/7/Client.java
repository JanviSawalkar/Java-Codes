abstract class Fitness{
	
	abstract void calOxy();

}

class Bodycheckup extends Fitness{
	
	void calOxy(){

		System.out.println("In Bodycheckup ");

	}
}

class Client{

	public static void main(String[] args){

		Fitness fit = new Bodycheckup();
		fit.calOxy();

	}
}
