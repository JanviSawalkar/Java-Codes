abstract class Media{
	
	abstract void Play();

}

class Songs extends Media{
	
	void Play(){

		System.out.println("In Songs");

	}
}

class Client{

	public static void main(String[] args){

		Media med = new Songs();
		med.Play();

	}
}
