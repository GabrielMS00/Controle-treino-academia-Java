package controle;

import modelo.*;

public class ControlePersonal {

	private Personal[] p;
	private int qtdPersonais;
	
	public ControlePersonal(ControleDados d) {
		this.p = d.getPersonais();
		this.qtdPersonais = d.getQtdPersonais();
	}
	
	public String[] getNomePersonal() {
		String[] s = new String[qtdPersonais];
		for(int i = 0; i < qtdPersonais; i++) {
			s[i] = p[i].getNome();
		}

		return s;
	}
	
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
