package idcard;
import framework.*;

// Product Ŭ������ ����Ŭ������ use() �޼ҵ带 ����
public class IDCard extends Product{	// Product Ŭ������ ���
	private String owner;
	IDCard(String owner){
		System.out.println(owner + "�� ī�带 ����ϴ�.");
		this.owner = owner;
	}
	public void use() {
		System.out.println(owner + "�� ī�带 ����մϴ�.");	// �޽��� ���
	}
	public String getOwner() {
		return owner;
	}
}
