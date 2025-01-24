package _04_DIP;

public class Pet {
	Dog dog;
	Cat cat;
	// 나중에 추가하려면 class를 변경 : DIP뿐만 아니라 OPC원칙에도 어긋남
	Hamster ham;
	
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
}
