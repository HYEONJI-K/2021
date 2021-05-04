package idcard;
import framework.*;

// Product 클래스의 하위클래스로 use() 메소드를 구현
public class IDCard extends Product{	// Product 클래스에 상속
	// 생산된 IDCard 제품의 owner와 serial을 쌍으로 저장
	private String owner;
	private int serial;
	IDCard(String owner, int serial){
		System.out.println("(" + owner + "/" + serial + ")의 카드를 만듭니다.");
		this.owner = owner;
		this.serial = serial;
	}
	public void use() {
		System.out.println("(" + owner + "/" + serial + ")의 카드를 사용합니다.");	// 메시지 출력
	}
	public String getOwner() {
		return owner;
	}
	public int getSerial() {
		return serial;
	}
}
