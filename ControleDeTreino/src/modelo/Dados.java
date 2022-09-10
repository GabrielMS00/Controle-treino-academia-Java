package modelo;

/**
 * A classe Dados gera Arrays das outras classes do pacote modelo, armazena dados importantes para o funcionameto
 * do sistema e métodos que orientam o comportamento do software.
 * @author Gabriel Marques de Souza
 * @since Setembro 2022
 * @version 1.0 
 */

public class Dados {
	private Exercicio[] exercicios = new Exercicio[50];
	private int qntExercicios = 0;
	private Treino[] treinos = new Treino[50];
	private int qntTreinos = 0;
	private Personal[] personais = new Personal[50];
	private int qntPersonais = 0;
	private Usuario[] usuarios = new Usuario[50];
	private int qntUsuarios = 0;
	
	/**
	 * Método que gera automaticamente instâncias da classe usuário e personal para o sistema já possuir dados cadastrados.
	 */
	
	public void fillWithSomeData() {
		for(int i = 0; i < 2; i++) {
			usuarios[i] = new Usuario("Usuario "+i, (i+1)*234567, "112233", 60.5f, "1.70", 
			(i+1)*2, (i+2)*15, "FGA-FIT");
			personais[i] = new Personal("Personal "+i, (i+1)*234567, "123123", "Segunda, Quarta e Sexta");
		}
	
	qntUsuarios = 2;
	qntPersonais = 2;
	}
	
	//getters e setters
	
	public Usuario[] getUsuarios() {
		return usuarios;
	}
	
	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}
	
	public void inserirEditarUsuario(Usuario u, int pos) {
		this.usuarios[pos] = u;
		if(pos == qntUsuarios) qntUsuarios ++;
	}

	public int getQntUsuarios() {
		return qntUsuarios;
	}

	public void setQntUsuarios(int qntUsuarios) {
		this.qntUsuarios = qntUsuarios;
	}

	public Personal[] getPersonais() {
		return personais;
	}

	public void setPersonais(Personal[] personais) {
		this.personais = personais;
	}
	
	public void inserirEditarPersonal(Personal p, int pos) {
		this.personais[pos] = p;
		if(pos == qntPersonais) {
			qntPersonais ++;
		}
	}

	public int getQntPersonais() {
		return qntPersonais;
	}

	public void setQntPersonais(int qntPersonais) {
		this.qntPersonais = qntPersonais;
	}

	public Exercicio[] getExercicios() {
		return exercicios;
	}

	public void setExercicios(Exercicio[] exercicios) {
		this.exercicios = exercicios;
	}

	public int getQntExercicios() {
		return qntExercicios;
	}

	public void setQntExercicios(int qntExercicios) {
		this.qntExercicios = qntExercicios;
	}

	public Treino[] getTreinos() {
		return treinos;
	}

	public void setTreinos(Treino[] treinos) {
		this.treinos = treinos;
	}

	public int getQntTreinos() {
		return qntTreinos;
	}

	public void setQntTreinos(int qntTreinos) {
		this.qntTreinos = qntTreinos;
	}
	
}

	