package idcard;
import framework.*;
import java.util.*;

// Factory Ŭ���� ���
public class IDCardFactory extends Factory {
	// owner�� serial ������ ����
	private HashMap data = new HashMap();
	private int serial = 1;	// serial ���� ��ȣ
	protected Product createProduct(String owner) {		// ����
		return new IDCard(owner, serial++);
	}
	protected void registerProduct(Product product) {	// �߰� ���
		IDCard c = (IDCard)product;
		data.put(new Integer(c.getSerial()), c.getOwner());
	}
	public Hashtable getDatabase() {
		return data;
	}
}
