package modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
	

	private float peso;
	private double altura;
	private int frequenciaSemana;
	private int idade;
	private String academia;
	private double imc;
	protected List<Treino> treinos = new ArrayList<>();
	protected List<Personal> personais = new ArrayList<>();
	

	public Usuario(String nome, String cep, String cpf, boolean sexo, float peso, double altura, int frequenciaSemana, int idade, String academia) {
		
		this.nome = nome;
		this.cep = cep;
		this.cpf = cpf;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.frequenciaSemana = frequenciaSemana;
		this.idade = idade;
		this.academia = academia;
		this.imc = this.calcularIMC();
	}
	
	public void addPersonal(Personal p1) {
		this.personais.add(p1);
	}
	
	public void addTreino(Treino t1) {
		this.treinos.add(t1);
	}

	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
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
	

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
		
	}
	
	public List<Treino> getTreinos() {
		return treinos;
	}

	public void setTreinos(List<Treino> treinos) {
		this.treinos = treinos;
	}

	public double calcularIMC() {
			
		this.imc = this.getPeso() / (this.getAltura() * this.getAltura());
		return imc;
	}
	
	
	
	public void status() {
		System.out.println("Nome de Usuario: " + this.getNome());
		System.out.println("CEP: " + this.getCep());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Sexo:" + this.getSexo()); 
		System.out.println("Peso: " + this.getPeso());
		System.out.println("Altura " + this.getAltura());
		System.out.println("Frequencia: " + this.getFrequenciaSemana() + " vezes na semana");
		System.out.println("Idade: " + this.getIdade());
		this.getAcademia();
		System.out.println("IMC: " + this.getImc());
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