package p_visitor;
import java.util.Iterator;

// File과 Directory의 상위 클래스로 파일이나 디렉토리의 종류를 나타내는 클래스
public abstract class Entry implements Element {
    public abstract String getName();	// 이름을 얻음                    
    public abstract int getSize();             
    
    public Entry add(Entry entry) throws FileTreatmentException {      
        throw new FileTreatmentException();	// 엔트리 추가
    }
    public Iterator iterator() throws FileTreatmentException {   
        throw new FileTreatmentException();	// Iterator의 생성
    }
    public String toString() {     // 문자열 표현                                 
        return getName() + " (" + getSize() + ")";
    }
}
