package khj_p10;

public class HwSupport extends Support{
	
	public HwSupport(String name) {    // 생성자   
        super(name);
    }
	
	public static boolean calcPrimeNumber(int n) {
		int p;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			p = n % i;
			if (p == 0) {prime = false; break;} // 소수가 아니면 pass
			else prime = true;	// 소수일 때 트러블 해결
		}
		return prime;	// 소수 값을 반환
	}
	
    protected boolean resolve(Trouble trouble) {	// 해결용 메소드
        if (calcPrimeNumber(trouble.getNumber()) == true) {
            return true;
        } else {
            return false;
        }
    }
}
