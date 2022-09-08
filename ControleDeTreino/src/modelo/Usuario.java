package modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
	

	protected float peso;
	protected String altura;
	protected int frequenciaSemana;
	protected int idade;
	protected String academia;
	protected List<Treino> treinos = new ArrayList<>();
	protected List<Personal> personais = new ArrayList<>();
	
	
	// Métodos específicos
	public void addPersonal(Personal p1) {
		this.personais.add(p1);
	}
	
	public void addTreino(Treino t1) {
		this.treinos.add(t1);
	}
	
	
	// Contrutor + getters e setters
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
	
	// Método que mostra o status de cada usuário
	public void status() {
		System.out.println("Nome de Usuario: " + this.getNome());
		System.out.println("CEP: " + this.getCep());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Peso: " + this.getPeso());
		System.out.println("Altura " + this.getAltura());
		System.out.println("Frequencia: " + this.getFrequenciaSemana() + " vezes na semana");
		System.out.println("Idade: " + this.getIdade());
		this.getAcademia();
		System.out.println("--- --- --- ---");
		for(Treino treino : treinos) {
			treino.status();
		}
		System.out.println("");
		System.out.println("Personal:");
		System.out.println("");
		for(Personal personal : personais) {
			personal.status();
		}
		
	}

	
	
}