package _04_DIP_solution;
/*
 * 의존역전원칙(DIP, Dependency Inversion Principle)
  	- 고수준모듈은저수준모듈의구현에의존해서는안된다
		: 즉, interface(or 추상클래스)에 의존 해야지 구현
	- 클래스(변경이 빈번하게이루어짐)에의존해서는안된다
 		고수준모듈: 추상화된모듈(interface, 추상 클래스)
 		저수준모듈: interface(추상클래스)의 기능을 구현한 모듈
 */

public class T01_DIP {
	public static void main(String[] args) {
		Pet pet = new Pet();
		
		pet.setPetInter(new Cat());
		System.out.println(pet.getPetInter());
		
		pet.setPetInter(new Dog());
		System.out.println(pet.getPetInter());
		
		pet.setPetInter(new Hamster());
		System.out.println(pet.getPetInter());
	}
}