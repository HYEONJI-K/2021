public class Triple {
	// �迭 ���
	private static Triple[] triple = new Triple[] {
			new Triple(0),
			new Triple(1),
			new Triple(2)
	};
	private int id;
	private Triple(int id) {
		System.out.println("�ν��Ͻ� " + id + "�� �����Ǿ����ϴ�.");
		this.id = id;
	}
	public static Triple getInstance(int id) {
		return triple[id];
	}
	public String toString() {
		return "[Triple id = "+id+"]";
	}
}
