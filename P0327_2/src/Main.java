import framework.*;
import idcard.*;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product c1 = factory.create("김현지");	// 생성
		Product c2 = factory.create("김행복");
		Product c3 = factory.create("홍길동");
		c1.use();	// 사용
		c2.use();
		c3.use();
	}
}
