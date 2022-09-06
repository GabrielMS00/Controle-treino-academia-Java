package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.ControleDados;

public class TelaDetalhePessoa implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelFrequenciaSemana = new JLabel("Frequencia na semana: ");
	private JTextField valorFrequenciaSemana;	
	private JLabel labelAltura = new JLabel("Altura: ");
	private JTextField valorAltura;	
	private JLabel labelPeso = new JLabel("Peso: ");
	private JTextField valorPeso;	
	private JLabel labelCpf = new JLabel("CPF: ");
	private JTextField valorCpf;
	private JLabel labelAcademia = new JLabel("Academia: ");
	private JTextField valorAcademia;	
	private JLabel labelCep = new JLabel("CEP: ");
	private JTextField valorCep;	
	private JLabel labelIdade = new JLabel("Idade: ");
	private JTextField valorIdade;
	private JLabel labelDisponibilidade = new JLabel("Disponibilidade: ");
	private JTextField valorDisponibilidade;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;
	
	public void inserirEditar(int op, ControleDados d, 
			TelaPessoa p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Usuario";
		if (op == 2) s = "Cadastro de Personal";
		if (op == 3) s = "Detalhe de Usuario";
		if (op == 4) s = "Detalhe de Personal";

		janela = new JFrame(s);

		//Preenche dados com dados do usuário clicado
		if (op == 3) {
			valorNome = new JTextField(dados.getUsuarios()[pos].getNome(), 200);
			valorCep = new JTextField(String.valueOf(dados.getUsuarios()[pos].getCep()), 200);
			valorCpf = new JTextField(String.valueOf(dados.getUsuarios()[pos].getCpf()), 200);
			valorPeso = new JTextField(String.valueOf(dados.getUsuarios()[pos].getPeso()), 200);
			valorAltura = new JTextField(dados.getUsuarios()[pos].getAltura(), 200);
			valorFrequenciaSemana = new JTextField(String.valueOf(dados.getUsuarios()[pos].getFrequenciaSemana()), 200);
			valorIdade = new JTextField(String.valueOf(dados.getUsuarios()[pos].getIdade()), 200);
			valorAcademia = new JTextField(String.valueOf(dados.getUsuarios()[pos].getAcademia()), 200);
			valorDisponibilidade = new JTextField(200);
			


		} else if (op == 4) { //Preenche dados com dados do professor clicado 
			valorNome = new JTextField(dados.getPersonais()[pos].getNome(), 200);
			valorCep = new JTextField(String.valueOf(dados.getPersonais()[pos].getCep()), 200);
			valorCpf = new JTextField(String.valueOf(dados.getPersonais()[pos].getCpf()), 200);
			valorPeso = new JTextField(200);
			valorAltura = new JTextField(200);
			valorFrequenciaSemana = new JTextField(200);
			valorIdade = new JTextField(200);
			valorAcademia = new JTextField(200);
			valorDisponibilidade = new JTextField(String.valueOf(dados.getPersonais()[pos].getDisponibilidade()), 200);
			

		} else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorCep = new JTextField(200);
			valorCpf = new JTextField(200);
			valorPeso = new JTextField(200);
			valorAltura = new JTextField(200);
			valorFrequenciaSemana = new JTextField(200);
			valorIdade = new JTextField(200);
			valorAcademia = new JTextField(200);
			valorDisponibilidade = new JTextField(200);

			botaoSalvar.setBounds(245, 275, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		
		labelCpf.setBounds(30, 50, 150, 25);
		valorCpf.setBounds(180, 50, 180, 25);
		
		labelCep.setBounds(30, 80, 150, 25);
		valorCep.setBounds(180, 80, 180, 25);
		
		labelPeso.setBounds(30, 110, 150, 25);
		valorPeso.setBounds(180, 110, 180, 25);
		
		labelAltura.setBounds(30, 140, 150, 25);
		valorAltura.setBounds(180, 140, 180, 25);
		
		labelFrequenciaSemana.setBounds(30, 170, 150, 25);
		valorFrequenciaSemana.setBounds(180, 170, 180, 25);
		
		labelIdade.setBounds(30, 200, 150, 25);
		valorIdade.setBounds(180, 200, 180, 25);
		
		labelAcademia.setBounds(30, 230, 150, 25);
		valorAcademia.setBounds(180, 230, 180, 25);
		
		labelDisponibilidade.setBounds(30, 250, 150, 25);
		valorDisponibilidade.setBounds(180, 250, 180, 25);
		

		//Coloca os campos relacionados exclusivamente aos usuários se selecionado opções de usuário
		if (op == 1 || op == 3 ) {
			this.janela.add(labelAltura);
			this.janela.add(valorAltura);
			this.janela.add(labelPeso);
			this.janela.add(valorPeso);
			this.janela.add(labelIdade);
			this.janela.add(valorIdade);
			this.janela.add(labelFrequenciaSemana);
			this.janela.add(valorFrequenciaSemana);
			this.janela.add(labelAcademia);
			this.janela.add(valorAcademia);	

		}

		//Coloca os campos relacionados exclusivamente aos personais se selecionado opções de personal
		if (op == 2 || op == 4) {

			this.janela.add(labelDisponibilidade);
			this.janela.add(valorDisponibilidade);
		}

		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 175, 115, 30);
			botaoExcluir.setBounds(245, 175, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelCpf);
		this.janela.add(valorCpf);
		this.janela.add(labelCep);
		this.janela.add(valorCep);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 250);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res;
				if(opcao == 1) //cadastro de novo usuário
					novoDado[0] = Integer.toString(dados.getQtdUsuarios());
				else if (opcao == 2) // cadastro de novo personal
					novoDado[0] = Integer.toString(dados.getQtdPersonais());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorCep.getText();
				novoDado[3] =  valorCpf.getText();


				if (opcao == 1 || opcao == 3) {
					novoDado[4] =  valorPeso.getText();
					novoDado[5] =  valorAltura.getText();
					novoDado[6] =  valorFrequenciaSemana.getText();
					novoDado[7] =  valorIdade.getText();
					novoDado[8] =  valorAcademia.getText();
					res = dados.inserirEditarUsuario(novoDado);
				} else {
					novoDado[4] =  valorDisponibilidade.getText();
					res = dados.inserirEditarPersonal(novoDado);
				}

				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {//exclui aluno
				res = dados.removerUsuario(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoUsuario(); 
			}
				
			if (opcao == 4){ //exclui professor
				res = dados.removerPersonal(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoPersonal(); 
			}


			
		}
	}
	
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. CPF, CEP, idade ou frequencia nao contem apenas numeros", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoUsuario() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n ", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusaoPersonal() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n ", null, 
				JOptionPane.ERROR_MESSAGE);
	}

}