package p_visitor;

// �����̳� ���丮�� �湮�ϴ� �湮�ڸ� ��Ÿ�� �߻� Ŭ����
//�޼ҵ�� ������, Ÿ�Կ� ���� �޼ҵ带 �ĺ��ϴ� �޼ҵ� �����ε带 ���.

public abstract class Visitor {
    public abstract void visit(File file); 
    public abstract void visit(Directory directory);
}