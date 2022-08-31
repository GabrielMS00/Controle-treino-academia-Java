package modelo;

public class Exercicio {

		protected String nome;
		protected int carga;
		protected boolean areaAtuacao;
		protected int serie;
		protected int repeticao;
		protected double tempoDescanco;
		
		// Métodos específicos
		public void aumentarCarga() {
			this.carga ++;
		}
		
		public void diminuirCarga() {
			this.carga --;
		}
		
		public void aumentarSerie() {
			this.serie ++;
		}
		
		public void diminuirSerie() {
			this.serie --;
		}
		
		public void aumentarRepeticao() {
			this.repeticao ++;
		}
		
		public void diminuirRepeticao() {
			this.repeticao --;
		}
		
		public void editarTempoDescanco(float t) {
			this.tempoDescanco = t;
		}
		
		// Método que pega o valor lógico de AreaAtuacao e traduz em uma String
		public void areaAtuacao() {
			if(isAreaAtuacao()) {
				System.out.println("Membros superiores");
			} else {
				System.out.println("Membros inferiores");
			}
		}
		
		// Construtor + getters e setters
		public Exercicio(String nome, boolean areaAtuacao) {
			super();
			this.nome = nome;
			this.areaAtuacao = areaAtuacao;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getCarga() {
			return carga;
		}

		public void setCarga(int carga) {
			this.carga = carga;
		}

		public boolean isAreaAtuacao() {
			return areaAtuacao;
		}
		

		public void setAreaAtuacao(boolean areaAtuacao) {
			this.areaAtuacao = areaAtuacao;
		}

		public int getSerie() {
			return serie;
		}

		public void setSerie(int serie) {
			this.serie = serie;
		}

		public int getRepeticao() {
			return repeticao;
		}

		public void setRepeticao(int repeticao) {
			this.repeticao = repeticao;
		}

		public double getTempoDescanco() {
			return tempoDescanco;
		}

		public void setTempoDescanco(double tempoDescanco) {
			this.tempoDescanco = tempoDescanco;
		}
		
		public void status() {
			System.out.println("Nome: " + this.getNome());
			System.out.println("Carga: " + this.getCarga() + " Kg");
			areaAtuacao();
			System.out.println(this.getSerie() + " Series");
			System.out.println("Repeticao: " + this.getRepeticao() + " vezes");
			System.out.println("Tempo de descanco: " + this.getTempoDescanco() + " minutos");
			
		}

			
	
		
}
