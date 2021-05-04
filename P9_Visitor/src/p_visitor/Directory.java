package p_visitor;
import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
    private String name;   // 디렉터리 이름                 
    private ArrayList dir = new ArrayList();	// 디렉터리 항목들 엔트리의 집합   
    public Directory(String name) {         	// 생성자
        this.name = name;
    }
    public String getName() {   // 이름을 얻음       
        return name;
    }
    public int getSize() {      // 디렉터리의 크기 = 디렉터리에 포함된 엔트리의 크기   
        int size = 0;
        Iterator it = dir.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();	// 모든 파일의 합 = 디렉터리 + 모든 파일의 합
        }
        return size;
    }
    public Entry add(Entry entry) {   // 엔트리 추가   
        dir.add(entry);
        return this;
    }
    public Iterator iterator() {     // Iterator 생성
        return dir.iterator();	// 디렉터리가 유지하고 있는 엔트리에 대한 값 반환
    }
    public void accept(Visitor v) {  // Visitor v : 입력 인자
        v.visit(this);             	 // Visitor 자기 자신을 매개변수로 해서 visit() 호출.
    }                           
}