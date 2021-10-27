package loginTela1;

import java.awt.*;

import javax.swing.*;

public class Login extends JFrame {
	JLabel lblEmail = new JLabel("Email: ");
	JTextField txtEmail = new JTextField(40);
	JLabel lblPassword = new JLabel("Senha: ");
	JTextField txtPassword = new JTextField(40);
	JButton btSend = new JButton("OK");
	
	public JPanel createInputJPanel(JLabel label, JTextField txt) {
		JPanel panel = new JPanel(new FlowLayout());		
		panel.add(label);
		panel.add(txt);
 		return panel;
	}
	
	public Login() {
		super("Tela de Login");
		this.setLayout(new BorderLayout(5,5));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 800, 480);
		//setLocationRelativeTo(null);
		
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		
		add(this.createInputJPanel(lblEmail, txtEmail), BorderLayout.NORTH);
		add(this.createInputJPanel(lblPassword, txtPassword), BorderLayout.CENTER);
		add(btSend, BorderLayout.SOUTH);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setVisible(true);
		pack();		
	}
}
