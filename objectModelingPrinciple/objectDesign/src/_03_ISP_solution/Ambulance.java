package _03_ISP_solution;

public class Ambulance implements Car {

	@Override
	public void drive() {
		System.out.println("운전중~~");

	}
	public void patientTransport() {
		System.out.println("환자 수송중");
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


}