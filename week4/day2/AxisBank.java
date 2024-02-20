package week4.day2;

public  class AxisBank implements RBI,Banker{

	
	public void withDraw() {
		System.out.println(amount+"Min balance");
		
	}

	
	

	
	public void eduLoan() {
		// TODO Auto-generated method stub
		
	}
	 public void rateInterest() {
		 
	 }
	public static void main(String[] args) {
		AxisBank ab =new AxisBank();
		ab.eduLoan();
		ab.submitKYC();
		ab.rateInterest();
		
	}


	@Override
	public void cardDetails() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void submitKYC() {
		// TODO Auto-generated method stub
		
	}

}
