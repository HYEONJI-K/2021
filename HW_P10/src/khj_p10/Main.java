package khj_p10;

public class Main {
	public static void main(String[] args) {
        Support hyeonji = new HwSupport("������");
        Support bob = new LimitSupport("�� ��", 132);
        Support charlie = new SpecialSupport("������", 208);
        Support diana = new LimitSupport("���̾Ƴ� ��", 285);
        Support elmo = new OddSupport("�ڿ���");
        Support fred = new LimitSupport("������", 450);
        // ������ ����
        hyeonji.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        // �پ��� Ʈ���� �߻�
        for (int i = 1; i < 500; i += 23) {
            hyeonji.support(new Trouble(i));
        }
    }
}
