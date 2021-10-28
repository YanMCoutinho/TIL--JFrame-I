package loginTela1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Panel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPasswordField;
import java.awt.Dimension;
import java.awt.Cursor;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpringLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class loginWB extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginWB frame = new loginWB();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loginWB() {
		setTitle("Fa\u00E7a seu login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 412);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTitle = DefaultComponentFactory.getInstance().createTitle("LOGIN");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(Color.decode("#00CC66"));
		lblTitle.setFont(new Font("Poppins SemiBold", Font.PLAIN, 30));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(new MigLayout("", "[][grow]", "[][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Email: ");
		panel_2.add(lblNewLabel, "cell 0 1");
		lblNewLabel.setFont(new Font("Poppins", Font.PLAIN, 16));
		
		textField = new JTextField();
		panel_2.add(textField, "flowx,cell 1 2,growx");
		textField.setFont(new Font("Poppins", Font.PLAIN, 16));
		textField.setColumns(20);
		
		JLabel lblNewLabel_1 = new JLabel("Senha: ");
		panel_2.add(lblNewLabel_1, "cell 0 2,alignx trailing");
		lblNewLabel_1.setFont(new Font("Poppins", Font.PLAIN, 16));
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("10dlu"),
				ColumnSpec.decode("444px"),},
			new RowSpec[] {
				FormSpecs.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("65px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("90px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("40px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("66px"),}));
		contentPane.add(lblTitle, "2, 2, fill, fill");
		contentPane.add(panel_2, "2, 4, fill, fill");
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Poppins", Font.PLAIN, 15));
		panel_2.add(passwordField, "cell 1 1,growx");
		
		Button button = new Button("Fazer Login");
		contentPane.add(button, "2, 8");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button.setBackground(Color.decode("#00994D"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button.setBackground(Color.decode("#00CC66"));
			}
		});
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setMinimumSize(new Dimension(36, 37));
		button.setBackground(Color.decode("#00CC66"));
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Poppins", Font.BOLD, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		
		Label label = new Label("Esqueceu sua senha?");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Então tenta lembrar", "", JOptionPane.NO_OPTION);
			}
		});
		panel_1.setLayout(new BorderLayout(0, 0));
		panel_1.add(label, BorderLayout.EAST);
		label.setFont(new Font("Poppins", Font.PLAIN, 16));
		
		Label label_1 = new Label("Fazer cadastro");
		label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_1.setFont(new Font("Poppins", Font.PLAIN, 16));
		panel_1.add(label_1, BorderLayout.WEST);
		contentPane.add(panel_1, "2, 12, fill, fill");
	}
}
