package sample;

public class MyPayments {
	
public static void main(String[] args) {
	
	Payment pay=new Payment();
	pay.setCreditCardNumber("0000 0000 0000 0000");
	System.out.println(pay.getCreditCardNumber());
	//System.out.println(pay.creditCardNumber);
}
}
