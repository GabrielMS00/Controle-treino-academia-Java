package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe Treino define os tipos de dados necessários para a instanciação de um novo treino ao sistema.
 * @author Gabriel Marques de Souza
 * @since Setembro 2022
 * @version 1.0
 */

public class Treino {
	
	protected String nome;
	protected String dia;
	protected float duracao;
	protected List<Exercicio> exercicios = new ArrayList<>();
	
	
	/**
	 * Método que acrescenta um novo exercício a um treino.
	 */
	
	public void addExercicio(Exercicio e1) {
		this.exercicios.add(e1);
	}
	
	/**
	 * Construtor da classe Treino.
	 * @param nome (Nome do treino)
	 * @param dia (Nome dos dias da semana que se aplicará o treino)
	 * @param duracao (Duração de tempo que o treino irá levar até ser concluído)
	 */
	
	public Treino(String nome, String dia, float duracao) {
		this.nome = nome;
		this.dia = dia;
		this.duracao = duracao;
	}

	// getters e setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}

	public List<Exercicio> getExercicios() {
		return exercicios;
	}

	public void setExercicios(List<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}
	
}
