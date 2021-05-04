public class TicketMaker {
	private int ticket = 1000;
	
	// -singleton : private static singleton
	private static TicketMaker singleton = new TicketMaker();
	
	// -Singleton : private Singleton
	private TicketMaker() {
	}
	
	// +getInstance : public static getInstance
	public static TicketMaker getInstance() {
		return singleton;
	}
	
	// synchronized : ������ �ڸ��� Ƽ���� �߱��ϸ� �ȵǴϱ�
	// getNextTicketNumber() �޼ҵ尡 (������ �����忡�� ȣ���ص�) ���� ���� ��ȯ���� �ʵ��� synchronized �߰�
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
}
