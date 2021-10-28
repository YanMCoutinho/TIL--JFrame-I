package cadFornecedor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextArea;

public class CadFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadFornecedor frame = new CadFornecedor();
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
	public CadFornecedor() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		setTitle("Cadastro de Fornecedor");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(new MigLayout("", "[37px][][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][26.00px][][21.00][74.00,grow][109.00][138.00px,grow][83.00,grow][70.00,grow][142.00px]", "[20px][40.00][40.00][40.00][40.00][40.00][40.00][40.00][40.00,grow][40.00]"));
		
		JLabel lblNewLabel = new JLabel("Código:");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel, "cell 0 0,alignx right,aligny center");
		
		JLabel lblNewLabel_1 = new JLabel("30");
		lblNewLabel_1.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		lblNewLabel_1.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		lblNewLabel_1.setForeground(Color.GRAY);
		panel.add(lblNewLabel_1, "cell 1 0,alignx left,aligny center");
		
		JLabel lblNewLabel_2 = new JLabel("Atividade/Profissão:");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblNewLabel_2, "cell 17 0,alignx right,aligny center");
		
		textField = new JTextField();
		textField.setFont(new Font("Poppins", Font.PLAIN, 11));
		panel.add(textField, "cell 18 0 3 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("PJ/PF:");
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		panel.add(lblNewLabel_3, "cell 0 1,alignx right");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Escolha uma op\u00E7\u00E3o");
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Poppins", Font.PLAIN, 11));
		comboBox.addItem("Pessoa jurídica");
		comboBox.addItem("Pessoa física");
		panel.add(comboBox, "cell 1 1 15 1,growx");
		
		JLabel lblNewLabel_4 = new JLabel("CEP:");
		lblNewLabel_4.setForeground(Color.DARK_GRAY);
		lblNewLabel_4.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		panel.add(lblNewLabel_4, "flowx,cell 17 1,alignx right");
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Poppins", Font.PLAIN, 11));
		panel.add(textField_1, "cell 18 1 2 1,growx");
		textField_1.setColumns(10);
		
		ImageIcon correios = new ImageIcon(getClass().getResource("./img/correios.jpg"));
		JButton btnNewButton = new JButton("BUSCAR   CEP");
		btnNewButton.setBackground(Color .decode("#00994D"));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Poppins ExtraBold", Font.BOLD, 12));
		btnNewButton.setIcon(correios);
		btnNewButton.repaint();
		panel.add(btnNewButton, "cell 20 1,grow");
		
		JLabel lblNewLabel_5 = new JLabel("Razão S./Nome:");
		lblNewLabel_5.setForeground(Color.DARK_GRAY);
		lblNewLabel_5.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		panel.add(lblNewLabel_5, "cell 0 2,alignx right");
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Poppins", Font.PLAIN, 11));
		panel.add(textField_2, "cell 1 2 16 1,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Estado:");
		lblNewLabel_6.setForeground(Color.DARK_GRAY);
		lblNewLabel_6.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		panel.add(lblNewLabel_6, "cell 17 2,alignx trailing");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("Escolha uma op\u00E7\u00E3o");
		comboBox_1.setMaximumRowCount(27);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setFont(new Font("Poppins", Font.PLAIN, 11));
		comboBox_1.addItem("AC");
		comboBox_1.addItem("AL");
		comboBox_1.addItem("AP");
		comboBox_1.addItem("AM");
		comboBox_1.addItem("BA");
		comboBox_1.addItem("CE");
		comboBox_1.addItem("DF");
		comboBox_1.addItem("ES");
		comboBox_1.addItem("GO");
		comboBox_1.addItem("MA");
		comboBox_1.addItem("MT");
		comboBox_1.addItem("MS");
		comboBox_1.addItem("MG");
		comboBox_1.addItem("PA");
		comboBox_1.addItem("PB");
		comboBox_1.addItem("PR");
		comboBox_1.addItem("PE");
		comboBox_1.addItem("PI");
		comboBox_1.addItem("RN");
		comboBox_1.addItem("RS");
		comboBox_1.addItem("RJ");
		comboBox_1.addItem("RO");
		comboBox_1.addItem("RR");
		comboBox_1.addItem("SC");
		comboBox_1.addItem("SP");
		comboBox_1.addItem("SE");
		comboBox_1.addItem("TO");
		panel.add(comboBox_1, "cell 18 2,growx");
		
		JLabel lblNewLabel_7 = new JLabel("CNPJ/CPF:");
		lblNewLabel_7.setForeground(Color.DARK_GRAY);
		lblNewLabel_7.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		panel.add(lblNewLabel_7, "cell 0 3,alignx right");
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Poppins", Font.PLAIN, 11));
		panel.add(textField_3, "cell 1 3 16 1,growx");
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Cidade:");
		lblNewLabel_8.setForeground(Color.DARK_GRAY);
		lblNewLabel_8.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		panel.add(lblNewLabel_8, "cell 17 3,alignx trailing");
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Poppins", Font.PLAIN, 11));
		panel.add(textField_4, "cell 18 3 3 1,growx");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Ins. Est./RG:");
		lblNewLabel_9.setForeground(Color.DARK_GRAY);
		lblNewLabel_9.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		panel.add(lblNewLabel_9, "cell 0 4,alignx right");
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Poppins", Font.PLAIN, 11));
		panel.add(textField_5, "cell 1 4 16 1,growx");
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Rua:");
		lblNewLabel_10.setForeground(Color.DARK_GRAY);
		lblNewLabel_10.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		panel.add(lblNewLabel_10, "cell 17 4,alignx trailing");
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Poppins", Font.PLAIN, 11));
		panel.add(textField_6, "cell 18 4 3 1,growx");
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Telefone 1:");
		lblNewLabel_11.setForeground(Color.DARK_GRAY);
		lblNewLabel_11.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		panel.add(lblNewLabel_11, "cell 0 5,alignx right");
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Poppins", Font.PLAIN, 11));
		panel.add(textField_7, "cell 1 5 16 1,growx");
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("N\u00BA e Complemento:");
		lblNewLabel_12.setForeground(Color.DARK_GRAY);
		lblNewLabel_12.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		panel.add(lblNewLabel_12, "cell 17 5,alignx trailing");
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Poppins", Font.PLAIN, 11));
		panel.add(textField_8, "cell 18 5 3 1,growx");
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Telefone 2:");
		lblNewLabel_13.setForeground(Color.DARK_GRAY);
		lblNewLabel_13.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		panel.add(lblNewLabel_13, "cell 0 6,alignx right");
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Poppins", Font.PLAIN, 11));
		panel.add(textField_9, "cell 1 6 16 1,growx");
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Bairro:");
		lblNewLabel_14.setForeground(Color.DARK_GRAY);
		lblNewLabel_14.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		panel.add(lblNewLabel_14, "cell 17 6,alignx trailing");
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Poppins", Font.PLAIN, 11));
		panel.add(textField_10, "cell 18 6 3 1,growx");
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Email:");
		lblNewLabel_15.setForeground(Color.DARK_GRAY);
		lblNewLabel_15.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		panel.add(lblNewLabel_15, "cell 0 7,alignx right");
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Poppins", Font.PLAIN, 11));
		textField_11.setText("");
		panel.add(textField_11, "cell 1 7 16 1,growx");
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Site/Instagram:");
		lblNewLabel_16.setForeground(Color.DARK_GRAY);
		lblNewLabel_16.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		panel.add(lblNewLabel_16, "cell 17 7,alignx trailing");
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Poppins", Font.PLAIN, 11));
		panel.add(textField_12, "cell 18 7 3 1,growx");
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Observa\u00E7\u00F5es:");
		lblNewLabel_17.setForeground(Color.DARK_GRAY);
		lblNewLabel_17.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		panel.add(lblNewLabel_17, "cell 0 8,alignx right,aligny top");
		
		textField_13 = new JTextField();
		textField_13.setToolTipText("Escolha uma op\u00E7\u00E3o");
		textField_13.setHorizontalAlignment(SwingConstants.LEFT);
		textField_13.setFont(new Font("Poppins", Font.PLAIN, 11));
		panel.add(textField_13, "cell 1 8 19 2,grow");
		textField_13.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("GRAVAR");
		btnNewButton_1.setBackground(Color .decode("#00994D"));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Poppins ExtraBold", Font.BOLD, 12));
		btnNewButton_1.setIcon(new ImageIcon(this.getClass().getResource("./img/content-save.png")));
		panel.add(btnNewButton_1, "cell 20 8,growx");
		
		JButton btnNewButton_2 = new JButton("SAIR");
		btnNewButton_2.setBackground(Color .decode("#00994D"));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Poppins ExtraBold", Font.BOLD, 12));
		btnNewButton_2.setIcon(new ImageIcon(this.getClass().getResource("./img/close.png")));
		panel.add(btnNewButton_2, "cell 20 9,growx");
	}

}
