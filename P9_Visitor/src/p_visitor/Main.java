package p_visitor;
import java.util.Iterator;

// 동작 테스트용 클래스
public class Main {
    public static void main(String[] args) {
    	try {
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));
            
            /* /root(30000)가 출력될 때 Entry 클래스의 toString에 의해 root가 출력.
               - /root/bin (30000)은 ListVisitor 클래스에서 entry.accept(this); 가 실행되면,
               ListVisitor의 visit 메소드가 호출.
               - 인스턴스가 File인지 Directory인지에 따라 호출되는 메소드가 다르다.
               File이면 출력이 마무리 되고, Directory면 재귀적으로 계속 파일이 나올 때까지 검사.
            */

            Directory Kim = new Directory("Kim");
            Directory Lee = new Directory("Lee");
            Directory Park = new Directory("Park");
            usrdir.add(Kim);
            usrdir.add(Lee);
            usrdir.add(Park);
            Kim.add(new File("hyejaKim.txt", 100));
            Kim.add(new File("hyeja.java", 150));
            Lee.add(new File("Leehyeja.txt", 200));
            Lee.add(new File("Leehyeonjung.html", 250));
            Park.add(new File("Parkhyeja.txt", 300));
            Park.add(new File("Hyeja.txt", 500));
            
            FileNameFindVisitor fnfv = new FileNameFindVisitor("hyeja");     
            rootdir.accept(fnfv);   
            
            // 문자열 "hyeja"를 포함하는 파일만 출력.
            // 해당 조건은 "hyeja"가 문자열 시작(startWith)에 위치하였는지, 끝(endsWith)에 위치하였는지는 중요하지 않음
            // "hyeja" 자체가 파일의 문자열 내에 존재하면 출력해주는 것이 중요(contains)
            System.out.println("hyeja files are:");
            Iterator it = fnfv.getFoundFiles();                      
            while (it.hasNext()) {
                File file = (File)it.next();
                System.out.println(file.toString());
            }                                                       
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
