package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe Usuario define os tipos de dados necessários para a instanciação de um usuário do sistema.
 * @author Gabriel Marques de Souza
 * @since Setembro 2022
 * @version 1.0
 */

public class Usuario extends Pessoa {
	
	protected float peso;
	protected String altura;
	protected int frequenciaSemana;
	protected int idade;
	protected String academia;
	protected List<Treino> treinos = new ArrayList<>();
	protected List<Personal> personais = new ArrayList<>();
	
	/**
	 * Método que associa um novo personal a um usuário.
	 */
	
	public void addPersonal(Personal p1) {
		this.personais.add(p1);
	}
	
	/**
	 * Método que associa um novo treino a um usuário.
	 */
	
	public void addTreino(Treino t1) {
		this.treinos.add(t1);
	}
	
	/**
	 * Construtor da classe Usuario.
	 * @param nome (Nome do usuário)
	 * @param cep (CEP do usuário)
	 * @param cpf (CPF do usuário)
	 * @param peso (Peso do usuário)
	 * @param altura (Altura do usuário)
	 * @param frequenciaSemana (Quantas vezes o usuário visita a academia por semana)
	 * @param idade (Idade do usuário)
	 * @param academia (Nome da academia visitada pelo usuário)
	 */
	
	public Usuario(String nome, int cep, String cpf, float peso, 
					String altura, int frequenciaSemana, int idade, String academia) {
		super();
		this.nome = nome;
		this.cep = cep;
		this.cpf = cpf;
		this.peso = peso;
		this.altura = altura;
		this.frequenciaSemana = frequenciaSemana;
		this.idade = idade;
		this.academia = academia;
	}
	
	// getters e setters
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String getAltura() {
		return altura;
	}
	
	public void setAltura(String altura) {
		this.altura = altura;
	}

	public int getFrequenciaSemana() {
		return frequenciaSemana;
	}

	public void setFrequenciaSemana(int frequenciaSemana) {
		this.frequenciaSemana = frequenciaSemana;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getAcademia() {
		return academia;
	}

	public void setAcademia(String academia) {
		this.academia = academia;
	}
	
	public List<Treino> getTreinos() {
		return treinos;
	}

	public void setTreinos(List<Treino> treinos) {
		this.treinos = treinos;
	}
	
}