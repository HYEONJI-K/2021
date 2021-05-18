package khj_p10;

public class SpecialSupport extends Support {
    private int number;									 // �ش� ��ȣ�� �ذ��� �� �ִ�
    public SpecialSupport(String name, int number) {    // ������
        super(name);
        this.number = number;
    }
    protected boolean resolve(Trouble trouble) {	// �ذ�� �޼ҵ�
        if (trouble.getNumber() == number) {
            return true;
        } else {
            return false;
        }
    }
}
