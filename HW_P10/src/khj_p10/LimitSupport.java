package khj_p10;

public class LimitSupport extends Support {
    private int limit;	// �ش� ��ȣ �̸��̸� �ذ��� �� �ִ�
    
    public LimitSupport(String name, int limit) { // ������
        super(name);
        this.limit = limit;
    }
    
    protected boolean resolve(Trouble trouble) { // �ذ�� �޼ҵ�
        if (trouble.getNumber() < limit) {
            return true;
        } else {
            return false;
        }
    }
}
