package ejemplo05beans;

public class MorcillaDeLeon {
	@Override
	public String toString() {
		return "MorcillaDeLeon [sabor=" + sabor + ", color=" + color + "]";
	}
	private String sabor;
	private String color;
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
