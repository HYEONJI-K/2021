import java.io.*;

public class Main {
	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try {
			f.readFromFile("file.txt");
			f.setValue("year", "2004");
			f.setValue("month", "3");
			f.setValue("day", "20");
			f.writeToFile("newfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
