package _03_ISP;

public class Ambulance implements Car {

	@Override
	public void drive() {
		System.out.println("운전중~~");

	}

	@Override
	public void turnLeft() {
		System.out.println("좌회전");

	}

	@Override
	public void turnRight() {
		System.out.println("우회전");

	}

	@Override
	public void stop() {
		System.out.println("정지!!");

	}

	@Override
	public void water() {
		System.out.println("물물물");
		
	}

	@Override
	public void patientTransport() {
		// TODO Auto-generated method stub
		
	}

}