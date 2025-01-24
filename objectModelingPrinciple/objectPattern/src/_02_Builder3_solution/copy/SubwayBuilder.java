package _02_Builder3_solution.copy;

public class SubwayBuilder {
	// 1. 인스턴스변수를 동일하게 넣는다.
	int size;
	String bread;
	String cheese;
	String source;
	String extraTopping;
	boolean vagetable;
	
	/* 2. 속성에 setter메소드 구현
	 	- 반환형 : 내 객체
	 	
	 * 메소드를 지정하는 방법
	  1) 속성명 : setter메서드와 구분을 위해 -> size(int size)
	  2) set속성명 : setSize(int size)
	  3) with속성명 : setter메소드와 구분을 위해 'with'키워드 사용 -> withSize(int size)
	*/
	// 반드시 넣어야되는 것들은 생성자로
	public SubwayBuilder(int size, String bread, String source) {
		this.size = size;
		this.bread = bread;
		this.source = source;
	}
	
	// 생성자에 넣지 않은 필드들은 setter메서드 이용
	public SubwayBuilder Cheese(String cheese) {
		this.cheese = cheese;
		return this;
	}
	public SubwayBuilder setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
		return this;
	}
	public SubwayBuilder withVagetable(boolean vagetable) {
		this.vagetable = vagetable;
		return this;
	}
	
	// 3. Subway 객체를 생성하여 리턴 : Subway생성자 호출로
	public Subway build() {
		return new Subway(size, bread, cheese, source, extraTopping, vagetable);
	}
}
