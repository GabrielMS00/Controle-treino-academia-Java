package controle;

import modelo.*;

public class ControleUsuario {
	
	private Usuario[] u;
	private int qtdUsuarios;
	
	public ControleUsuario(ControleDados d) {
		u = d.getUsuarios();
		qtdUsuarios = d.getQtdUsuarios();
	}
	
	public String[] getNomeUsuario() {
		String[] s = new String[qtdUsuarios];
		for(int i = 0; i < qtdUsuarios; i++) {
			s[i] = u[i].getNome();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdUsuarios;
	}

	public void setQtd(int qtd) {
		this.qtdUsuarios = qtd;
	}
	
	public String getNome(int i) {		
		return u[i].getNome();
	}
	
	public String getCpf(int i) {
		String numCpf = String.valueOf(u[i].getCpf());
		return numCpf;
	}
	
	public String getCep(int i) {
		String numCep = String.valueOf(u[i].getCep());
		return numCep;
	}
	
	public Float getPeso(int i) {
		float numPeso = Float.valueOf(u[i].getPeso());
		return numPeso;
	}
	
	public Float getAltura(int i) {
		Float numAltura = Float.valueOf(u[i].getAltura());
		return numAltura;
	}
	
	public String getIdade(int i) {
		String numIdade = String.valueOf(u[i].getIdade());
		return numIdade;
	}
	
	
	
	public void setQtdUsuarios(int qtdUsuarios) {
		this.qtdUsuarios = qtdUsuarios;
	}

}