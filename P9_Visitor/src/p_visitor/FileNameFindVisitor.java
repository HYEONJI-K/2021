package p_visitor;
import java.util.Iterator;
import java.util.ArrayList;

// file �Ű������� ���͸� �� ���ϵ��� �����ִ� Ŭ����
public class FileNameFindVisitor extends Visitor {
	private String name;	// ���� �� ���ڿ� ���� ����
    private ArrayList found = new ArrayList();
    
    public FileNameFindVisitor(String name) { // ������ �̸� ���� (���� �� �̸��� ��)
    	this.name = name;
    }
    public Iterator getFoundFiles() { // �߰��� ������ ������
        return found.iterator();
    }
    public void visit(File file) { // ������ �湮�� �� ȣ��
        if (file.getName().contains(name)) {
            found.add(file);
        }
    }
    public void visit(Directory directory) { // ���͸��� �湮�� �� ȣ��
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
    }
}
