public class CharDisplay extends AbstractDisplay{
	
	private char ch;
	
	public CharDisplay(char ch) {	// �����ڿ��� ���޵� ���� ch �ʵ� ���
		this.ch = ch;
	}
	
	public void open() {
		System.out.print("<<");
	}
	public void print() {
		System.out.print(ch);
	}
	public void close() {
		System.out.println(">>");
	}
}
