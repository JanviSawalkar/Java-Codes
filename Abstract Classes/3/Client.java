abstract class OS{
	
	abstract void memManagement();

}

class Windows extends OS{
	
	void memManagement(){

		System.out.println("In Windows memManag..");

	}
}

class Client{

	public static void main(String[] args){

		OS os = new Windows();
		os.memManagement();
	}
}
