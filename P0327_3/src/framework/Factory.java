package framework;

public abstract class Factory {
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	// ����Ŭ�������� �����ϱ� ���� �߻�޼ҵ带 ȣ��
	protected abstract Product createProduct(String owner);	
	protected abstract void registerProduct(Product product);
}
