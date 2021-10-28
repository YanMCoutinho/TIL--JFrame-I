package cadProduto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CadProdutoWB extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadProdutoWB frame = new CadProdutoWB();
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
	public CadProdutoWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Descri\u00E7\u00E3o: ");
		lblNewJgoodiesLabel.setFont(new Font("Poppins", Font.PLAIN, 16));
		panel.add(lblNewJgoodiesLabel, BorderLayout.CENTER);
		
		textField = new JTextField();
		panel.add(textField, BorderLayout.EAST);
		textField.setColumns(27);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Esp\u00E9cie: ");
		lblNewLabel.setFont(new Font("Poppins", Font.PLAIN, 14));
		panel_2.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(new BorderLayout(0, 0));
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Poppins", Font.PLAIN, 15));
		textField_2.setColumns(10);
		panel_2_1.add(textField_2);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.WHITE);
		panel_1.add(panel_2_2);
		panel_2_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblUnidadeDeEntrada = new JLabel("Unidade de Entrada: ");
		panel_2_2.add(lblUnidadeDeEntrada, BorderLayout.CENTER);
		lblUnidadeDeEntrada.setFont(new Font("Poppins", Font.PLAIN, 14));
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(Color.WHITE);
		panel_1.add(panel_2_3);
		panel_2_3.setLayout(new BorderLayout(0, 0));
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Poppins", Font.PLAIN, 15));
		textField_3.setColumns(10);
		panel_2_3.add(textField_3);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(Color.WHITE);
		panel_1.add(panel_2_1_1);
		panel_2_1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSubdivisvel = new JLabel("Subdivis\u00EDvel?: ");
		lblSubdivisvel.setFont(new Font("Poppins", Font.PLAIN, 14));
		panel_2_1_1.add(lblSubdivisvel, BorderLayout.CENTER);
		
		JPanel panel_2_4 = new JPanel();
		panel_1.add(panel_2_4);
		panel_2_4.setBackground(Color.WHITE);
		panel_2_4.setLayout(new BorderLayout(0, 0));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Poppins", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione...", "Sim", "N\u00E3o"}));
		panel_2_4.add(comboBox, BorderLayout.CENTER);
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setBackground(Color.WHITE);
		panel_1.add(panel_2_5);
		panel_2_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblUnidadeDeEntrada_1_1 = new JLabel("Unidade de Sa\u00EDda: ");
		lblUnidadeDeEntrada_1_1.setFont(new Font("Poppins", Font.PLAIN, 14));
		panel_2_5.add(lblUnidadeDeEntrada_1_1, BorderLayout.CENTER);
		
		JPanel panel_2_6 = new JPanel();
		panel_2_6.setBackground(Color.WHITE);
		panel_1.add(panel_2_6);
		panel_2_6.setLayout(new BorderLayout(0, 0));
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Poppins", Font.PLAIN, 15));
		textField_4.setColumns(10);
		panel_2_6.add(textField_4, BorderLayout.CENTER);
		
		JPanel panel_2_7 = new JPanel();
		panel_2_7.setBackground(Color.WHITE);
		panel_1.add(panel_2_7);
		panel_2_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblUnidadeDeEntrada_1_1_1 = new JLabel("Qtd. Subdivis\u00E3o: ");
		lblUnidadeDeEntrada_1_1_1.setFont(new Font("Poppins", Font.PLAIN, 14));
		panel_2_7.add(lblUnidadeDeEntrada_1_1_1, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Poppins", Font.PLAIN, 15));
		textField_5.setColumns(10);
		panel_4.add(textField_5, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		contentPane.add(panel_3, BorderLayout.SOUTH);
	}

}
