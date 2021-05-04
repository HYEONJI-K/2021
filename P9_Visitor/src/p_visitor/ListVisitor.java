package p_visitor;
import java.util.Iterator;

//Visitor Ŭ������ ���� Ŭ������ �����̳� ���丮�� ������ ��Ÿ���� Ŭ����
public class ListVisitor extends Visitor {
    private String currentdir = "";                        
    public void visit(File file) {  // �̹� �湮�ߴ�.          
        System.out.println(currentdir + "/" + file);
    }
    public void visit(Directory directory) {   
        System.out.println(currentdir + "/" + directory);	// ���͸� ��ü ��� ���
        String savedir = currentdir;	// ���� ���͸��� �ӽ÷� savedir�� ����
        currentdir = currentdir + "/" + directory.getName();	// ���� ���͸��� �Է� ���ڷ� ���� ���͸��� �ٲ�.
        Iterator it = directory.iterator();	// �Է� ���ڷ� ���� ���͸��� iterator()�� ��f��.
        while (it.hasNext()) {	// �Է� ���ڷ� ���� ���͸��� �����ϴ� ���ҵ��� ���ʷ� �湮�ϸ鼭,  
            Entry entry = (Entry)it.next();
            entry.accept(this);	// accept(this)�� ȣ���Ͽ� �湮�ڰ� �湮�Ͽ����� �˸�.
        }	// while ������ ������,
        currentdir = savedir;	// currentdir�� ���� ���͸��� �����Ѵ�.
    }
}