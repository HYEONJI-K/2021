import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			Triple triple = Triple.getInstance(i%3);
			System.out.println(i +" : "+ triple);
		}
		System.out.println("End.");
	}
}
