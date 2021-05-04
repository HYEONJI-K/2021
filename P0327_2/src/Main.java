import framework.*;
import idcard.*;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product c1 = factory.create("������");	// ����
		Product c2 = factory.create("���ູ");
		Product c3 = factory.create("ȫ�浿");
		c1.use();	// ���
		c2.use();
		c3.use();
	}
}
