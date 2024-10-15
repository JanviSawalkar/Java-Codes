abstract class Music{
	
	abstract void sing();

}

class ClassicalMusic extends Music{
	
	void sing(){

		System.out.println("In ClassicalMusic");

	}
}

class Client{

	public static void main(String[] args){

		Music mus = new ClassicalMusic();
		mus.sing();

	}
}
