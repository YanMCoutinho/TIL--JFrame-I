package cadProduto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class CadProduto extends JFrame {
	JLabel lblDesc = new JLabel("Descrição: ");
	JTextField txtDesc = new JTextField(40);
	
	JLabel lblEspecie = new JLabel("Espécie: ");
	JTextField txtEspecie = new JTextField(20);
	
	JTextField txtExtra1 = new JTextField(20);
	JTextField txtExtra2 = new JTextField(20);
	JTextField txtExtra3 = new JTextField(20);
	JLabel lblUnidadeEntrada = new JLabel("Unidade de Entrada: ");
	JTextField txtUnidadeEntrada = new JTextField(20);
	JLabel lblSubdiv = new JLabel("Subdivisivel?: ");
	String [] subdivisivel = {"Sim", "Não"};
	JComboBox<String> cboSubdiv = new JComboBox<String>(subdivisivel);
	JLabel lblUnidadeSaida = new JLabel("Subdivisivel?: ");
	JTextField txtUnidadeSaida = new JTextField(20);
	JLabel lblQtdSubdiv = new JLabel("Qt. Subdivisão: ");
	JTextField txtQtdSubdiv = new JTextField(20);
	JPanel panelExtra1 = new JPanel();
	JPanel panelExtra2 = new JPanel();
	JPanel panelExtra3 = new JPanel();
	JPanel panelExtra4 = new JPanel();
	JPanel panelExtra5 = new JPanel();
	JPanel panelDesc = new JPanel(new FlowLayout());
	JButton btSend = new JButton("OK");
	

	public JPanel createInputJPanel(JLabel label, JTextField txt) {
		JPanel panel = new JPanel(new BorderLayout());		
		panel.add(label, BorderLayout.WEST);
		panel.add(txt, BorderLayout.EAST);
 		return panel;
	}
	
	public JPanel createInputJPanel(JLabel label, JComboBox cbo) {
		JPanel panel = new JPanel(new BorderLayout());		
		panel.add(label, BorderLayout.WEST);
		panel.add(cbo,BorderLayout.EAST);
 		return panel;
	}
	
	public JPanel createGridWithJPanels(JPanel[] items, int rows, int columns) {
		GridLayout layout = new GridLayout(rows, columns);
		layout.setVgap(10);
		JPanel panel = new JPanel(layout);
		for (JPanel item : items) {
			panel.add(item);
		}
 		return panel;
	}
	
	public CadProduto() {
		super("Tela de Cadastro de Produto");
		this.setLayout(new BorderLayout(10,10));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 800, 600);
		//setLocationRelativeTo(null);
		
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		
		panelDesc.add(lblDesc);
		panelDesc.add(txtDesc);
		
		panelExtra3.add(txtExtra3);
		panelExtra2.add(txtExtra2);
		panelExtra4.add(txtExtra1);
		JPanel[] paneis = {this.createInputJPanel(lblEspecie, txtEspecie), panelExtra2,
						   this.createInputJPanel(lblUnidadeEntrada, txtUnidadeEntrada), panelExtra3,
						   this.createInputJPanel(lblSubdiv, cboSubdiv), panelExtra1,
						   this.createInputJPanel(lblUnidadeSaida, txtUnidadeSaida), panelExtra4,
						   this.createInputJPanel(lblQtdSubdiv, txtQtdSubdiv), panelExtra5};
		
		c.add(panelDesc, BorderLayout.NORTH);	
		c.add(this.createGridWithJPanels(paneis, 0, 2), BorderLayout.CENTER);
		c.add(btSend, BorderLayout.SOUTH);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setVisible(true);
		pack();		
	}
}

