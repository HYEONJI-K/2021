public class CharDisplay extends AbstractDisplay{
	
	private char ch;
	
	public CharDisplay(char ch) {	// 생성자에서 전달된 문자 ch 필드 기억
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
