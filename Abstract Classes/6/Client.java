abstract class Painting{
	
	abstract void draw();

}

class AcrylicPainting extends Painting{
	
	void draw(){

		System.out.println("In AcrylicPainting ");

	}
}

class Client{

	public static void main(String[] args){

		Painting pn = new AcrylicPainting();
		pn.draw();

	}
}
