package cadCliente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextPane;
import javax.swing.JComboBox;

public class CadCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JLabel lblBairro;
	private JLabel lblCidade;
	private JLabel lblEstado;
	private JComboBox cbbEstado;
	private JLabel lblObs;
	private JLabel lblCep;
	private JButton btnNovo;
	private JButton btnAlterar;
	private JButton btnVoltar;
	private JButton btnRelatorio;
	private JButton btnExcluir;
	private JButton btnSalvar;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtCep;
	private JLabel lblTelefone;
	private JTextField txtTelefone;
	private JTextField txtObs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadCliente frame = new CadCliente();
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
	public CadCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 300);
		setTitle("Cadastro Cliente"); 
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#044D8C"));
		contentPane.setForeground(Color.decode("#044D8C"));		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[46px][86px,grow]", "[20px][][][][][grow][][grow]"));
		
		JLabel lblCodigo = new JLabel("Código ");
		panel.add(lblCodigo, "cell 0 0,alignx left,aligny center");
		
		txtCodigo = new JTextField();
		txtCodigo.setBackground(Color.WHITE);
		panel.add(txtCodigo, "cell 1 0,alignx left,aligny top");
		txtCodigo.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome ");
		panel.add(lblNome, "cell 0 1,alignx left");
		
		txtNome = new JTextField();
		panel.add(txtNome, "cell 1 1,growx");
		txtNome.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereço ");
		panel.add(lblEndereco, "cell 0 2,alignx left");
		
		txtEndereco = new JTextField();
		panel.add(txtEndereco, "cell 1 2,growx");
		txtEndereco.setColumns(10);
		
		lblBairro = new JLabel("Bairro ");
		panel.add(lblBairro, "cell 0 3,alignx left");
		
		txtBairro = new JTextField();
		panel.add(txtBairro, "flowx,cell 1 3,alignx left");
		txtBairro.setColumns(10);
		
		lblCidade = new JLabel("Cidade ");
		panel.add(lblCidade, "cell 1 3,alignx right");
		
		txtCidade = new JTextField();
		panel.add(txtCidade, "cell 1 3,alignx left");
		txtCidade.setColumns(10);
		
		lblEstado = new JLabel("Estado ");
		panel.add(lblEstado, "cell 1 3,alignx right");
		
		String [] estado = {"Selecione", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Roraima", "Rondônia", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"};
		cbbEstado = new JComboBox(estado);
		cbbEstado.setForeground(new Color(0, 0, 128));
		panel.add(cbbEstado, "cell 1 3,alignx left");
		
		lblCep = new JLabel("CEP ");
		panel.add(lblCep, "cell 0 4,alignx left");
		
		txtCep = new JTextField();
		panel.add(txtCep, "flowx,cell 1 4,growx");
		txtCep.setColumns(10);
		
		lblTelefone = new JLabel("Telefone ");
		panel.add(lblTelefone, "cell 1 4,alignx right");
		
		txtTelefone = new JTextField();
		panel.add(txtTelefone, "cell 1 4,growx");
		txtTelefone.setColumns(10);
		
		lblObs = new JLabel("Obs");
		panel.add(lblObs, "cell 0 5,alignx left");
		
		txtObs = new JTextField();
		panel.add(txtObs, "flowx,cell 1 5,grow");
		txtObs.setColumns(10);
		
		btnNovo = new JButton("Novo");
		btnNovo.setBackground(Color.WHITE);
		btnNovo.setForeground(new Color(0, 0, 128));
		panel.add(btnNovo, "flowx,cell 1 6,growx");
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.setBackground(Color.WHITE);
		btnAlterar.setForeground(new Color(0, 0, 139));
		panel.add(btnAlterar, "cell 1 6,growx");
		
		btnRelatorio = new JButton("Relat\u00F3rio");
		btnRelatorio.setBackground(Color.WHITE);
		btnRelatorio.setForeground(new Color(0, 0, 139));
		panel.add(btnRelatorio, "cell 1 6,growx");
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setBackground(Color.WHITE);
		btnExcluir.setForeground(new Color(0, 0, 139));
		panel.add(btnExcluir, "flowx,cell 1 7,growx");
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(0, 0, 128));
		btnSalvar.setForeground(Color.WHITE);
		panel.add(btnSalvar, "cell 1 7,growx");
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.setForeground(new Color(0, 0, 139));
		panel.add(btnVoltar, "cell 1 6,growx");
		
	}

}
