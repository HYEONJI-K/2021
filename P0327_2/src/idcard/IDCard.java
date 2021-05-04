package idcard;
import framework.*;

// Product 클래스의 하위클래스로 use() 메소드를 구현
public class IDCard extends Product{	// Product 클래스에 상속
	private String owner;
	IDCard(String owner){
		System.out.println(owner + "의 카드를 만듭니다.");
		this.owner = owner;
	}
	public void use() {
		System.out.println(owner + "의 카드를 사용합니다.");	// 메시지 출력
	}
	public String getOwner() {
		return owner;
	}
}
