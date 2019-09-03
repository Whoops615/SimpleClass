package by.htp.hame.main8.Task08;

public class CustomerLogic {
	
	public static boolean intervalCreditCard(int start, int end, Customer cs) {
		
		if(cs.getCreditCardNumber() >= start & cs.getCreditCardNumber() <= end) {
			return true;
		}				
		return false;
	}
	

}
