package p_visitor;
import java.util.Iterator;
import java.util.ArrayList;

// file 매개변수와 디렉터리 내 파일들을 비교해주는 클래스
public class FileNameFindVisitor extends Visitor {
	private String name;	// 비교해 줄 문자열 변수 선언
    private ArrayList found = new ArrayList();
    
    public FileNameFindVisitor(String name) { // 가져온 이름 지정 (비교해 줄 이름이 됨)
    	this.name = name;
    }
    public Iterator getFoundFiles() { // 발견한 파일을 가져옴
        return found.iterator();
    }
    public void visit(File file) { // 파일을 방문할 때 호출
        if (file.getName().contains(name)) {
            found.add(file);
        }
    }
    public void visit(Directory directory) { // 디렉터리를 방문할 때 호출
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
    }
}
