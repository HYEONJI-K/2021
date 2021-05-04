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
	
	// synchronized : 동일한 자리의 티켓을 발급하면 안되니까
	// getNextTicketNumber() 메소드가 (복수의 쓰레드에서 호출해도) 같은 값을 반환하지 않도록 synchronized 추가
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
}
