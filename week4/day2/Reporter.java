package week4.day2;

public abstract class Reporter implements RBI {

	public void getReport() {//implement
		System.out.println("Get Report from abstract clas");
	}

	public abstract void setReport();//unimplemented method

	@Override
	public void eduLoan() {
	System.out.println("EDU loan from abstract  class");
		
	}

	
}
