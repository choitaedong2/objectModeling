package _02_Builder3_solution.copy;

public class Subway {
	int size;
	String bread;
	String cheese;
	String source;
	String extraTopping;
	boolean vagetable;
	
	public Subway() {}

	public Subway(int size, String bread, String cheese, String source, String extraTopping, boolean vagetable) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.source = source;
		this.extraTopping = extraTopping;
		this.vagetable = vagetable;
	}
	
	@Override
	public String toString() {
		return "Subway [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", source=" + source
				+ ", extraTopping=" + extraTopping + ", vagetable=" + vagetable + "]";
	}
}
