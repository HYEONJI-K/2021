package framework;

public abstract class Factory {
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	// 하위클래스에서 구현하기 위해 추상메소드를 호출
	protected abstract Product createProduct(String owner);	
	protected abstract void registerProduct(Product product);
}
