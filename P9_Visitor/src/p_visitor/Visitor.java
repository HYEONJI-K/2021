package p_visitor;

// 파일이나 디렉토리를 방문하는 방문자를 나타낸 추상 클래스
//메소드는 같지만, 타입에 따라 메소드를 식별하는 메소드 오버로드를 사용.

public abstract class Visitor {
    public abstract void visit(File file); 
    public abstract void visit(Directory directory);
}