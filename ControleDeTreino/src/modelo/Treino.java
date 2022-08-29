package modelo;

public class Treino {
	
	protected String nome;
	protected String dia;
	protected float duracao;
	protected Exercicio exercicios;
	
	
	public Treino(String nome, String dia, float duracao) {
		super();
		this.nome = nome;
		this.dia = dia;
		this.duracao = duracao;
	}
	
	public void addExercicio(Exercicio e1) {
		this.exercicios = e1;
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

	public Exercicio getExercicios() {
		return exercicios;
	}

	public void setExercicios(Exercicio exercicios) {
		this.exercicios = exercicios;
	}

	
	public void status() {
		System.out.println("Nome do treino: " + this.getNome());
		System.out.println("Dia: " + this.getDia());
		System.out.println("Duracao: " + this.getDuracao());
		System.out.println("Exercicios: " + exercicios.getNome());
	}
	
	
}
