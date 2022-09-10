package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
* Janela que mostra os dados dos usuários ou dos personais cadastrados no sistema.
* @author Gabriel Marques de Souza
* @since Setembro 2022
* @version 1.0
*/

public class TelaPessoa implements ActionListener, ListSelectionListener {

	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroUsuario;
	private JButton refreshUsuario;
	private JButton cadastroPersonal;
	private JButton refreshPersonal;
	private static ControleDados dados;
	private JList<String> listaUsuariosCadastrados;
	private JList<String> listaPersonaisCadastrados;
	private String[] listaNomes = new String[50];
	
	public void mostrarDados(ControleDados d, int op){
		dados = d;
		
		switch (op) {
		case 1: // Mostra os dados dos usuarios cadastrados
			listaNomes = new ControleUsuario(dados).getNomeUsuario();
			listaUsuariosCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Usuarios");
			titulo = new JLabel("Usuarios Cadastrados");
			cadastroUsuario = new JButton("Cadastrar");
			refreshUsuario = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaUsuariosCadastrados.setBounds(20, 50, 350, 120);
			listaUsuariosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaUsuariosCadastrados.setVisibleRowCount(10);

			cadastroUsuario.setBounds(70, 177, 100, 30);
			refreshUsuario.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaUsuariosCadastrados);
			janela.add(cadastroUsuario);
			janela.add(refreshUsuario);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroUsuario.addActionListener(this);
			refreshUsuario.addActionListener(this);
			listaUsuariosCadastrados.addListSelectionListener(this);

			break;
			
		case 2:// Mostrar os dados dos personais cadastrados
			listaNomes = new ControlePersonal(dados).getNomePersonal();
			listaPersonaisCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Personais");
			titulo = new JLabel("Personais Cadastrados");
			cadastroPersonal = new JButton("Cadastrar");
			refreshPersonal = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaPersonaisCadastrados.setBounds(20, 50, 350, 120);
			listaPersonaisCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaPersonaisCadastrados.setVisibleRowCount(10);


			cadastroPersonal.setBounds(70, 177, 100, 30);
			refreshPersonal.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaPersonaisCadastrados);
			janela.add(cadastroPersonal);
			janela.add(refreshPersonal);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroPersonal.addActionListener(this);
			refreshPersonal.addActionListener(this);
			listaPersonaisCadastrados.addListSelectionListener(this);
			break;

		default:
			JOptionPane.showMessageDialog(null,"Nao encontrado!!!", null, 
					JOptionPane.ERROR_MESSAGE);
		}
			
	}	
	
	/**
	 * Método que, a depender da opção esolhida, pode realizar diferentes ações: abrir TelaDetalhePessoa ou atualizar a lista de informações
	 */
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo usuario
		if(src == cadastroUsuario)
			new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);

		//Cadastro de novo personal
		if(src == cadastroPersonal)
			new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);

		// Atualiza a lista de nomes de usuarios mostrada no JList
		if(src == refreshUsuario) {
			listaUsuariosCadastrados.setListData(new ControleUsuario(dados).getNomeUsuario());			
			listaUsuariosCadastrados.updateUI();
		}

		// Atualiza a lista de nomes de personais mostrada no JList
		if(src == refreshPersonal) {
			listaPersonaisCadastrados.setListData(new ControlePersonal(dados).getNomePersonal());
			listaPersonaisCadastrados.updateUI();
		}

	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaUsuariosCadastrados) {
			new TelaDetalhePessoa().inserirEditar(3, dados, this, 
					listaUsuariosCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaPersonaisCadastrados) {
			new TelaDetalhePessoa().inserirEditar(4, dados, this, 
					listaPersonaisCadastrados.getSelectedIndex());
		}
	}
	
}
