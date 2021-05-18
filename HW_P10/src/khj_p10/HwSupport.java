package khj_p10;

public class HwSupport extends Support{
	
	public HwSupport(String name) {    // ������   
        super(name);
    }
	
	public static boolean calcPrimeNumber(int n) {
		int p;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			p = n % i;
			if (p == 0) {prime = false; break;} // �Ҽ��� �ƴϸ� pass
			else prime = true;	// �Ҽ��� �� Ʈ���� �ذ�
		}
		return prime;	// �Ҽ� ���� ��ȯ
	}
	
    protected boolean resolve(Trouble trouble) {	// �ذ�� �޼ҵ�
        if (calcPrimeNumber(trouble.getNumber()) == true) {
            return true;
        } else {
            return false;
        }
    }
}
