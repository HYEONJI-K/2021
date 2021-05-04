package p_visitor;
import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
    private String name;   // ���͸� �̸�                 
    private ArrayList dir = new ArrayList();	// ���͸� �׸�� ��Ʈ���� ����   
    public Directory(String name) {         	// ������
        this.name = name;
    }
    public String getName() {   // �̸��� ����       
        return name;
    }
    public int getSize() {      // ���͸��� ũ�� = ���͸��� ���Ե� ��Ʈ���� ũ��   
        int size = 0;
        Iterator it = dir.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();	// ��� ������ �� = ���͸� + ��� ������ ��
        }
        return size;
    }
    public Entry add(Entry entry) {   // ��Ʈ�� �߰�   
        dir.add(entry);
        return this;
    }
    public Iterator iterator() {     // Iterator ����
        return dir.iterator();	// ���͸��� �����ϰ� �ִ� ��Ʈ���� ���� �� ��ȯ
    }
    public void accept(Visitor v) {  // Visitor v : �Է� ����
        v.visit(this);             	 // Visitor �ڱ� �ڽ��� �Ű������� �ؼ� visit() ȣ��.
    }                           
}