package _02_Builder3_solution.copy;

public class T01_SubwayBuilder {

	public static void main(String[] args) {
		Subway menu1 = new SubwayBuilder(15, "통밀", "머스타드").Cheese("모짜렐라").build();
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder(13, "밀", "핫소스").Cheese("모짜렐라").build();
		System.out.println(menu2);
	
	}
}
