public class Triple {
	// 배열 사용
	private static Triple[] triple = new Triple[] {
			new Triple(0),
			new Triple(1),
			new Triple(2)
	};
	private int id;
	private Triple(int id) {
		System.out.println("인스턴스 " + id + "가 생성되었습니다.");
		this.id = id;
	}
	public static Triple getInstance(int id) {
		return triple[id];
	}
	public String toString() {
		return "[Triple id = "+id+"]";
	}
}
