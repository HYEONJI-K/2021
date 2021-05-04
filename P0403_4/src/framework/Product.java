package framework;

public abstract class Product implements Cloneable{
	public abstract void use(String s);
	// final은 재할당(만) 금지
	public Product createClone() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
