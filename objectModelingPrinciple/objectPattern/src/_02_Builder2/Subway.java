package _02_Builder2;

public class Subway {
	int size;
	String bread;
	String cheese;
	String source;
	String extraTopping;
	boolean vagetable;

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public String getCheese() {
		return cheese;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getExtraTopping() {
		return extraTopping;
	}
	public void setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
	}
	public boolean isVagetable() {
		return vagetable;
	}
	public void setVagetable(boolean vagetable) {
		this.vagetable = vagetable;
	}
	
	public Subway() {}
	
	public Subway(int size) {
		this.size = size;
	}
	
	public Subway(int size, String bread) {
		this.size = size;
		this.bread = bread;
	}
	// 오버로딩 안됨. 생성자 또는 메서드 모두 모든 주문 선택을 넣을 수 없음
	public Subway(int size, String bread, String cheese) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
	}
	
	public Subway(int size, String bread, String cheese, String source) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.source = source;
	}
	
	public Subway(int size, String bread, String cheese, String source, String extraTopping) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.source = source;
		this.extraTopping = extraTopping;
	}
	
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
