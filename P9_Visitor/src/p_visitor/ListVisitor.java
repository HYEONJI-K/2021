package p_visitor;
import java.util.Iterator;

//Visitor 클래스의 하위 클래스로 파일이나 디렉토리의 종류를 나타내는 클래스
public class ListVisitor extends Visitor {
    private String currentdir = "";                        
    public void visit(File file) {  // 이미 방문했다.          
        System.out.println(currentdir + "/" + file);
    }
    public void visit(Directory directory) {   
        System.out.println(currentdir + "/" + directory);	// 디렉터리 전체 경로 출력
        String savedir = currentdir;	// 현재 디렉터리를 임시로 savedir에 저장
        currentdir = currentdir + "/" + directory.getName();	// 현재 디렉터리를 입력 인자로 들어온 디렉터리로 바꿈.
        Iterator it = directory.iterator();	// 입력 인자로 들어온 디렉터리의 iterator()를 얻늗나.
        while (it.hasNext()) {	// 입력 인자로 들어온 디렉터리가 유지하는 원소들을 차례로 방문하면서,  
            Entry entry = (Entry)it.next();
            entry.accept(this);	// accept(this)를 호출하여 방문자가 방문하였음을 알림.
        }	// while 루프가 끝나면,
        currentdir = savedir;	// currentdir을 원래 디렉터리로 복귀한다.
    }
}