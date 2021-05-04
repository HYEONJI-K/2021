import framework.*;

public class Underline extends Product{
	private char ulchar;
	public Underline(char ulchar) {
		this.ulchar = ulchar;
	}
	public void use(String s) {
		int length = s.getBytes().length;
		System.out.print("/" + s + "/");
		System.out.println(" ");
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println(" ");
	}
}
