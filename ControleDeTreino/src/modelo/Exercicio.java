package modelo;

/**
 * A classe Exercício define os tipos de dados necessários para a instanciação de um novo exercício no sistema.
 * @author Gabriel Marques de Souza
 * @since Setembro 2022
 * @version 1.0
 */

public class Exercicio {

		protected String nome;
		protected int carga;
		protected String areaAtuacao;
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
		
		/**
		 * Construtor da classe Exercicio.
		 * @param nome (Nome que o exercicio possui)
		 * @param areaAtuacao Recebe (True) caso o exercício seja para membros superiores e (false) caso seja para membros inferiores  
		 */
		
		public Exercicio(String nome, String areaAtuacao) {
			super();
			this.nome = nome;
			this.areaAtuacao = areaAtuacao;
		}

		//getters e setters
		
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
		
		public String getAreaAtuacao() {
			return areaAtuacao;
		}

		public void setAreaAtuacao(String areaAtuacao) {
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
			
}
