package Trabalho;

public class Usuário extends Pessoa {
	

	private float peso;
	private double altura;
	private int frequenciaSemana;
	private int idade;
	private String academia;
	private double imc;
	
	public Usuário(float peso, double altura) {
		
		this.peso = peso;
		this.altura = altura;
		
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
	
	public void calcularIMC() {
		
		
		this.imc = this.getPeso() / (this.getAltura() * this.getAltura());	
		
	}
	
	public void status() {
		
		System.out.println(+ this.getImc());
	}

}
