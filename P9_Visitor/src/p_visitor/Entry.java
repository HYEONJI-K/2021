package p_visitor;
import java.util.Iterator;

// File�� Directory�� ���� Ŭ������ �����̳� ���丮�� ������ ��Ÿ���� Ŭ����
public abstract class Entry implements Element {
    public abstract String getName();	// �̸��� ����                    
    public abstract int getSize();             
    
    public Entry add(Entry entry) throws FileTreatmentException {      
        throw new FileTreatmentException();	// ��Ʈ�� �߰�
    }
    public Iterator iterator() throws FileTreatmentException {   
        throw new FileTreatmentException();	// Iterator�� ����
    }
    public String toString() {     // ���ڿ� ǥ��                                 
        return getName() + " (" + getSize() + ")";
    }
}
