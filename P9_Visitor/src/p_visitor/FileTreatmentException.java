package p_visitor;

// File�� ���ؼ� add�� ��쿡 �߻��ϴ� ���� Ŭ����
public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {
    }
    public FileTreatmentException(String msg) {	// ���ڿ��� �Ű������� �޴� ������
        super(msg);	// RuntimeException Ŭ������ �����ڸ� ȣ���Ѵ�.
    }
}