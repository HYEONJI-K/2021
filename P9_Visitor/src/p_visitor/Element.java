package p_visitor;

//Visitor Ŭ������ �ν��Ͻ��� �޾Ƶ��̴� ������ ������ ��Ÿ���� �������̽�
public interface Element {
    public abstract void accept(Visitor v);
}