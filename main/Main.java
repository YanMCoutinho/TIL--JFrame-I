package main;

import javax.swing.JFrame;

import cadCliente.CadCliente;
import cadFornecedor.CadFornecedor;
import cadProduto.CadProduto;
import cadProduto.CadProdutoWB;
import loginTela1.Login;
import loginTela1.loginWB;

public class Main {

	public static void main(String[] args) {
		loginWB login = new loginWB();
		CadProduto cadProduto = new CadProduto();
		CadCliente cadCliente = new CadCliente();
		CadFornecedor cadFornecedor = new CadFornecedor();
		cadFornecedor.setVisible(true);
		cadProduto.setVisible(true);
		cadCliente.setVisible(true);
		login.setVisible(true);
		
	}
}
