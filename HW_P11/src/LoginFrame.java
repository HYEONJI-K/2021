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

    // ������
    // Colleague���� �����ϰ�, ��ġ�� �Ŀ� ǥ�ø� �����Ѵ�
    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        
        // ���̾ƿ� �Ŵ����� ����ؼ� 5X3�� �׸��带 �����
        setLayout(new GridLayout(5, 3));
        
        // Colleague���� ����
        createColleagues();
        // ��ġ
        
        add(checkGuest);
        add(checkLogin);
        add(checkMember);
        
        add(new Label("Username:"));
        add(textUser);
        add(new Label(""));
        
        add(new Label("Password:"));
        add(textPass);
        add(new Label(""));

        add(new Label("�ֹε�Ϲ�ȣ:"));
        add(textIDCard);
        add(new Label(""));
        
        add(buttonOk);
        add(buttonCancel);
        
        // ��ȿ/��ȿ�� �ʱ� ����
        colleagueChanged();
        // ǥ��
        pack();
        show();
    }

    // Colleague���� �����Ѵ�
    public void createColleagues() {
        // ����
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
        
        // Mediator�� ��Ʈ
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        checkMember.setMediator(this);
        
        textUser.setMediator(this);
        textPass.setMediator(this);
        textIDCard.setMediator(this);
        
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        
        // Listener�� ��Ʈ
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        checkMember.addItemListener(checkMember);
        
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        textIDCard.addTextListener(textIDCard);
        
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    // Colleague������ ������ Colleague�� ��ȿ/��ȿ�� ����
    public void colleagueChanged() {                          
        if (checkGuest.getState()) { // Guest ���
            textUser.setColleagueEnabled(false);                
            textPass.setColleagueEnabled(false);
            textIDCard.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);               
        }
        else if (checkLogin.getState()) { // Login ���
            textUser.setColleagueEnabled(true);
            textIDCard.setColleagueEnabled(false);
            userpassChanged();
        }
        else {	// Member ���
        	textUser.setColleagueEnabled(true);
        	textPass.setColleagueEnabled(true);
            userpassChanged();
        }
    }
    
    // �� Colleague�� ��ȿ/��ȿ�� ����
    private void userpassChanged() {
    	String n = textIDCard.getText();	// textIDCard�� �Է� ���ڿ��� n�� ����.
    	boolean t = true;
    	int num = 0;
    	
        if (textUser.getText().length() > 0) {	// UserName�� ���̰� 0�� �ƴ� ��
            textPass.setColleagueEnabled(true); // Password�� �Է� �����ϵ��� 
            if (textPass.getText().length() > 0) {	// Password�� ���̰� 0�� �ƴ� ��
            	if (checkMember.getState()) {	// checkMember�� ������ ���
            		textIDCard.setColleagueEnabled(true); // �ֹε�Ϲ�ȣ �Է� �����ϵ���
                	if (textIDCard.getText().length() == 13) {	// 13�� ���̰� �Ǹ�
                    	for(int i = 0; i < n.length(); i++) {	// �ش� ���ڿ��� ���� �ϴϾ� ��
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
            	else {	// checkMember�� �ƴ� Login ����� ��
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
