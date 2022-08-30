package modelo;

public class Personal extends Pessoa {


		private String disponibilidade;
		
		/*public Personal(String nome, long cep, long cpf) {
			super(nome, cep, cpf);
			
		}*/

		public String getDisponibilidade() {
			return disponibilidade;
		}

		public void setDisponibilidade(String disponibilidade) {
			this.disponibilidade = disponibilidade;
		}
		
}
