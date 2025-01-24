package _02_Builder3_solution;

public class T01_SubwayBuilder {

	public static void main(String[] args) {
		Subway menu1 = new SubwayBuilder().setBread("통밀").withCheese("모짜렐라").Size(13).build();
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder().setBread("밀").Size(14).withVagetable(true).setExtraTopping("토마토").build();
		System.out.println(menu2);	
	}
}
