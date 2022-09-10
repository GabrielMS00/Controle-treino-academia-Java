package controle;

import modelo.*;

/**
 * A classe ControlePersonal tem a função de fazer a ligação entre modelo.Personal e o pacote view.
 * @author Gabriel MArques de Souza
 * @since Setembro 2022
 * @version 1.0
 */

public class ControlePersonal {

	private Personal[] p;
	private int qtdPersonais;
	
	public ControlePersonal(ControleDados d) {
		this.p = d.getPersonais();
		this.qtdPersonais = d.getQtdPersonais();
	}
	
	/**
	 * Os atributos nome do personal, durante a listagem, são atribuidos a uma nova String[].
	 * @return String []
	 */
	
	public String[] getNomePersonal() {
		String[] s = new String[qtdPersonais];
		for(int i = 0; i < qtdPersonais; i++) {
			s[i] = p[i].getNome();
		}

		return s;
	}
	
	//getters e setters
	
	public int getQtd() {
		return qtdPersonais;
	}
	
	public void setQtd(int qtd) {
		this.qtdPersonais = qtd;
	}
	
	public String getNome(int i) {		
		return p[i].getNome();
	}
	
	public String getCpf(int i) {
		String numCpf = String.valueOf(p[i].getCpf());
		return numCpf;
	}
	
	public String getCep(int i) {
		String numCep = String.valueOf(p[i].getCep());
		return numCep;
	}
	
	public String getDisponibilidade(int i) {
		String disp = String.valueOf(p[i].getDisponibilidade());
		return disp;
	}
	
}