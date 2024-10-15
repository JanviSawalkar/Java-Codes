abstract class Booking{
	
	abstract void confirm();

}

class TravelsBooking extends Booking{
	
	void confirm(){

		System.out.println("In TravelsBooking");

	}
}

class Client{

	public static void main(String[] args){

		Booking bk = new TravelsBooking();
		bk.confirm();

	}

}
