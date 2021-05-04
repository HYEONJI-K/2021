package p_visitor;
import java.util.Iterator;

// ���� �׽�Ʈ�� Ŭ����
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
            
            /* /root(30000)�� ��µ� �� Entry Ŭ������ toString�� ���� root�� ���.
               - /root/bin (30000)�� ListVisitor Ŭ�������� entry.accept(this); �� ����Ǹ�,
               ListVisitor�� visit �޼ҵ尡 ȣ��.
               - �ν��Ͻ��� File���� Directory������ ���� ȣ��Ǵ� �޼ҵ尡 �ٸ���.
               File�̸� ����� ������ �ǰ�, Directory�� ��������� ��� ������ ���� ������ �˻�.
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
            
            // ���ڿ� "hyeja"�� �����ϴ� ���ϸ� ���.
            // �ش� ������ "hyeja"�� ���ڿ� ����(startWith)�� ��ġ�Ͽ�����, ��(endsWith)�� ��ġ�Ͽ������� �߿����� ����
            // "hyeja" ��ü�� ������ ���ڿ� ���� �����ϸ� ������ִ� ���� �߿�(contains)
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
