package week4.day1;

public class BMW extends Car{
	
	public void applyBrake(String name) {
		System.out.println("ABS braking system");
	}
	
	public static void main(String[] args) {
		BMW car =new BMW();
		car.applyBrake("ABS");
		car.soundHorn();
	}
}
