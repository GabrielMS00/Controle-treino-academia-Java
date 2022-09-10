package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

/**
* Janela com todas as opções que o usuário possui no Menu.
* @author Gabriel Marques de Souza
* @since Setembro 2022
* @version 1.0
*/

public class TelaMenu implements ActionListener{
	
	private static JFrame janela = new JFrame("Controle de Treinos");
	private static JLabel titulo = new JLabel("# Menu Inicial #");
	private static JButton usuario = new JButton("Usuarios");
	private static JButton treino = new JButton("Treinos");
	private static JButton personal = new JButton("Personal");
	public static ControleDados dados = new ControleDados();
	
	/**
	 * Construtor do Menu
	 */
	
	public TelaMenu() {
		
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		treino.setBounds(140, 100, 100, 30);
		personal.setBounds(140, 150, 100, 30);
		usuario.setBounds(140, 50, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(usuario);
		janela.add(treino);
		janela.add(personal);
		
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		usuario.addActionListener(menu);
		personal.addActionListener(menu);
		treino.addActionListener(menu);
	}
	
	/**
	 * Configurações para as ações ao serem selecionados os botões Usuário, Personal ou Treino
	 */
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == usuario)
			new TelaPessoa().mostrarDados(dados, 1);
		
		if(src == personal)
			new TelaPessoa().mostrarDados(dados, 2);
		
		if(src == treino)
			JOptionPane.showMessageDialog(null, 
					"Esta opção ainda está em desenvolvimento\n"
					+ "logo será implementada ao software", null, 
					JOptionPane.INFORMATION_MESSAGE);
	}
	
}