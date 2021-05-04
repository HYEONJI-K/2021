package idcard;
import framework.*;
import java.util.*;

// Factory 클래스 상속
public class IDCardFactory extends Factory {
	// owner와 serial 쌍으로 저장
	private HashMap data = new HashMap();
	private int serial = 1;	// serial 시작 번호
	protected Product createProduct(String owner) {		// 생성
		return new IDCard(owner, serial++);
	}
	protected void registerProduct(Product product) {	// 추가 등록
		IDCard c = (IDCard)product;
		data.put(new Integer(c.getSerial()), c.getOwner());
	}
	public Hashtable getDatabase() {
		return data;
	}
}
