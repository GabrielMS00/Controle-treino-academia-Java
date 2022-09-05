package modelo;

import java.util.ArrayList;
import java.util.List;

public class Treino {
	
	protected String nome;
	protected String dia;
	protected float duracao;
	protected List<Exercicio> exercicios = new ArrayList<>();
	
	
	// Métodos específicos
	public void addExercicio(Exercicio e1) {
		this.exercicios.add(e1);
	}
	
	// Construtor + getters e setters
	public Treino(String nome, String dia, float duracao) {
		this.nome = nome;
		this.dia = dia;
		this.duracao = duracao;
	}

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

	
	// Função que mostra o status de cada treino
	public void status() {
		System.out.println("Nome do treino: " + this.getNome());
		System.out.println("Dia: " + this.getDia());
		System.out.println("Duracao: " + this.getDuracao() + " hora(s)");
		System.out.println("");
		System.out.println("Exercicios:");
		System.out.println("");
		for (Exercicio exercicio : exercicios) {
			System.out.println(exercicio.getNome());
			System.out.println("Carga: " + exercicio.getCarga() + " Kg");
			System.out.println("Serie: " + exercicio.getSerie());
			System.out.println("Repeticoes por serie: " + exercicio.getRepeticao() + " vezes");
			System.out.println("Tempo de descanco: " + exercicio.getTempoDescanco() + " minutos");
			System.out.println("--- --- ---");
		}
	}
	
	
}
