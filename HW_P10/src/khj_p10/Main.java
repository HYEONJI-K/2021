package khj_p10;

public class Main {
	public static void main(String[] args) {
        Support hyeonji = new HwSupport("김현지");
        Support bob = new LimitSupport("김 밥", 132);
        Support charlie = new SpecialSupport("이찰리", 208);
        Support diana = new LimitSupport("다이아나 최", 285);
        Support elmo = new OddSupport("박엘모");
        Support fred = new LimitSupport("프레드", 450);
        // 연쇄의 형성
        hyeonji.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        // 다양한 트러블 발생
        for (int i = 1; i < 500; i += 23) {
            hyeonji.support(new Trouble(i));
        }
    }
}
