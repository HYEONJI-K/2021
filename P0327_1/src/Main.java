public class Main {
	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('K');
		AbstractDisplay d2 = new StringDisplay("Hello, Ms.Kim");
		AbstractDisplay d3 = new StringDisplay("�ȳ��ϼ���. �������Դϴ�.");
		d1.display();
		d2.display();
		d3.display();
	}
}
