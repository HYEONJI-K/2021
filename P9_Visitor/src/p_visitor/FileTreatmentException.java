package p_visitor;

// File에 대해서 add한 경우에 발생하는 예외 클래스
public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {
    }
    public FileTreatmentException(String msg) {	// 문자열을 매개변수로 받는 생성자
        super(msg);	// RuntimeException 클래스의 생성자를 호출한다.
    }
}