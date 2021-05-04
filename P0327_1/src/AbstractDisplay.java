public abstract class AbstractDisplay { // �߻�Ŭ����
	public abstract void open();	// ����Ŭ������ ������ �ñ�� �߻� �޼ҵ�
	public abstract void print();
	public abstract void close();
	
	public final void display() {	// �߻�Ŭ�������� �����Ǵ� �޼ҵ�
		open();
		for (int i = 0; i < 5; i++) print();
		close();
	}	// ������ ������ �� �ִٴ� ����
	
}