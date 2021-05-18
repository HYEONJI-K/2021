import java.awt.Frame;
import java.awt.Color;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueCheckbox checkMember;
    
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueTextField textIDCard;
    
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    // 생성자
    // Colleague들을 생성하고, 배치한 후에 표시를 실행한다
    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        
        // 레이아웃 매니저를 사용해서 5X3의 그리드를 만든다
        setLayout(new GridLayout(5, 3));
        
        // Colleague들의 생성
        createColleagues();
        // 배치
        
        add(checkGuest);
        add(checkLogin);
        add(checkMember);
        
        add(new Label("Username:"));
        add(textUser);
        add(new Label(""));
        
        add(new Label("Password:"));
        add(textPass);
        add(new Label(""));

        add(new Label("주민등록번호:"));
        add(textIDCard);
        add(new Label(""));
        
        add(buttonOk);
        add(buttonCancel);
        
        // 유효/무효의 초기 지정
        colleagueChanged();
        // 표시
        pack();
        show();
    }

    // Colleague들을 생성한다
    public void createColleagues() {
        // 생성
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);
        checkMember = new ColleagueCheckbox("Member", g, false);
        
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textIDCard = new ColleagueTextField("", 13);
        
        textPass.setEchoChar('*');
        textIDCard.setEchoChar('*');
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");
        
        // Mediator의 세트
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        checkMember.setMediator(this);
        
        textUser.setMediator(this);
        textPass.setMediator(this);
        textIDCard.setMediator(this);
        
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        
        // Listener의 세트
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        checkMember.addItemListener(checkMember);
        
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        textIDCard.addTextListener(textIDCard);
        
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    // Colleague에서의 통지로 Colleague의 유효/무효를 판정
    public void colleagueChanged() {                          
        if (checkGuest.getState()) { // Guest 모드
            textUser.setColleagueEnabled(false);                
            textPass.setColleagueEnabled(false);
            textIDCard.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);               
        }
        else if (checkLogin.getState()) { // Login 모드
            textUser.setColleagueEnabled(true);
            textIDCard.setColleagueEnabled(false);
            userpassChanged();
        }
        else {	// Member 모드
        	textUser.setColleagueEnabled(true);
        	textPass.setColleagueEnabled(true);
            userpassChanged();
        }
    }
    
    // 각 Colleague의 유효/무효를 판정
    private void userpassChanged() {
    	String n = textIDCard.getText();	// textIDCard의 입력 문자열을 n에 저장.
    	boolean t = true;
    	int num = 0;
    	
        if (textUser.getText().length() > 0) {	// UserName의 길이가 0이 아닐 때
            textPass.setColleagueEnabled(true); // Password에 입력 가능하도록 
            if (textPass.getText().length() > 0) {	// Password의 길이가 0이 아닐 때
            	if (checkMember.getState()) {	// checkMember의 상태일 경우
            		textIDCard.setColleagueEnabled(true); // 주민등록번호 입력 가능하도록
                	if (textIDCard.getText().length() == 13) {	// 13의 길이가 되면
                    	for(int i = 0; i < n.length(); i++) {	// 해당 문자열의 문자 하니씩 비교
                    		if (!Character.isDigit(n.charAt(i))) {
                            	t = false;
                            	num++;
                            }
                    		else { 
                    			t = true; 
                    		}
                    	}
                    	if (num == 0) {
                    		buttonOk.setColleagueEnabled(true);
                    	}
                    	else { buttonOk.setColleagueEnabled(false); }
                	}
                }
            	else {	// checkMember가 아닌 Login 모드일 때
            		buttonOk.setColleagueEnabled(true);
            	}
            } 
            else {
                buttonOk.setColleagueEnabled(false);
            }
        }
        
        else {
            textPass.setColleagueEnabled(false);
            textIDCard.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
