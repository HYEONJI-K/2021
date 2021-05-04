public class StringDisplay extends AbstractDisplay{
	
	private String st;
	private int width;
	
	public StringDisplay(String st) {
		this.st = st;
		this.width = st.getBytes().length;
	}
	
	public void open() {
		printLine();
	}
	public void print() {
		System.out.println("|" + st + "|");
	}
	public void close() {
		printLine();
	}
	
	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}