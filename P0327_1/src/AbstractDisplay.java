public abstract class AbstractDisplay { // 추상클래스
	public abstract void open();	// 하위클래스에 구현을 맡기는 추상 메소드
	public abstract void print();
	public abstract void close();
	
	public final void display() {	// 추상클래스에서 구현되는 메소드
		open();
		for (int i = 0; i < 5; i++) print();
		close();
	}	// 로직만 수정할 수 있다는 장점
	
}