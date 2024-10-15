class Meta{

	Meta(){

		System.out.println("In const: Meta");

	}

}

class Instagram extends Meta{
	
	Instagram(){

		System.out.println("In const: Instagram");

	}

}

class Facebook extends Meta{

	Facebook(){

		System.out.println("In const: facebook");

	}

}

class Client{

	public static void main(String[] args){

		Meta met1 = new Instagram();
		Meta met2 = new Facebook();
	}


}
