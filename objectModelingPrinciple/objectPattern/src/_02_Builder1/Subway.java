package _02_Builder1;

public class Subway {
	int size;
	String bread;
	String cheese;
	String source;
	String extraTopping;
	boolean vagetable;
	@Override
	public String toString() {
		return "Subway [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", source=" + source
				+ ", extraTopping=" + extraTopping + ", vagetable=" + vagetable + "]";
	}
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
	
}
