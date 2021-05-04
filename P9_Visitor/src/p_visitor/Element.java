package p_visitor;

//Visitor 클래스의 인스턴스를 받아들이는 데이터 구조를 나타내는 인터페이스
public interface Element {
    public abstract void accept(Visitor v);
}