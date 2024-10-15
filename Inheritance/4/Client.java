class Account{

	Account(){

		System.out.println("In Cons:Accounts");	

	}
}

class SavingAccount extends Account{

	SavingAccount(){

		System.out.println("In Const: SavingAccount");

	}

}

class Client{

	public static void main(String[] args){
	
		Account acc = new SavingAccount();
	}
	

}