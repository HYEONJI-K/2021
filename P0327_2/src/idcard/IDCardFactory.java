package idcard;
import java.util.*;
import framework.*;

// Factory 클래스 상속
public class IDCardFactory  extends Factory{
	private List owners = new ArrayList();
	// 
	protected Product createProduct(String owner) {		// 생성
		return new IDCard(owner);
	}
	protected void registerProduct(Product product) {	// 추가 등록
		owners.add(((IDCard)product).getOwner());
	}
	public List getOwner() {
		return owners;
	}
}
