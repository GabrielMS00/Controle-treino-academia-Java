package controle;

import modelo.*;

/**
 * A classe ControleDados tem a função de fazer a ligação entre o pacote modelo e o pacote view.
 * @author Gabriel Marques de Souza
 * @since Setembro 2022
 * @version 1.0
 */

public class ControleDados {

	private Dados d = new Dados();
	
	/**
	 * Chama o método fillWithSomeData() da classe modelo.Dados para que o sistema instancie dados como já cadastrados no sistema
	 */
	
	public ControleDados() {
		d.fillWithSomeData();
	}
	
	//getters e setters
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}

	public Usuario[] getUsuarios() {
		return this.d.getUsuarios();
	}
	
	public int getQtdUsuarios() {
		return this.d.getQntUsuarios();
	}
	
	public Personal[] getPersonais() {
		return this.d.getPersonais();
	}
	
	public int getQtdPersonais() {
		return this.d.getQntPersonais();
	}
	
	/**
	 * Método que adiciona ou edita usuários no sistema.
	 * @param dadosUsuarios[1] (nome ; usuário)
	 * @param dadosUsuario[2] (cep ; usuário)
	 * @param dadosUsuario[3] (cpf ; usuário)
	 * @param dadosUsuario[4] (peso ; usuário)
	 * @param dadosUsuario[5] (altura ; usuário)
	 * @param dadosUsuario[6] (frequenciaSemana ; usuário) 
	 * @return boolean
	 */
	
	public boolean inserirEditarUsuario(String[] dadosUsuarios) {
		
		Usuario u = new Usuario(dadosUsuarios[1], Integer.parseInt(dadosUsuarios[3]), dadosUsuarios[2], Float.parseFloat(dadosUsuarios[4]), dadosUsuarios[5],
								Integer.parseInt(dadosUsuarios[6]), Integer.parseInt(dadosUsuarios[7]), dadosUsuarios[8]);
		d.inserirEditarUsuario(u, Integer.parseInt(dadosUsuarios[0]));
		return true;
		
	}
	
	/**
	 * Método que adiciona ou edita personal no sistema
	 * @param dadosPersonal[1] (nome ; Personal)
	 * @param dadosPersonal[2] (cep ; Personal)
	 * @param dadosPersonal[3] (cpf ; Personal)
	 * @param dadosPersonal[4] (disponibilidade ; Personal)
	 * @return boolean
	 */
	
	public boolean inserirEditarPersonal(String[] dadosPersonais) {
		
		Personal p = new Personal(dadosPersonais[1], Integer.parseInt(dadosPersonais[3]), 
								dadosPersonais[2], dadosPersonais[4]);
		d.inserirEditarPersonal(p, Integer.parseInt(dadosPersonais[0]));
		return true;
		
	}
	
	/**
	 * Método que exclui um usuário do sistema.
	 * @param i (getUsuarios()[i] ; modelo.Dados)
	 * @return boolean
	 */
	
	public boolean removerUsuario(int i) {
		
		String usuarioRemovido = d.getUsuarios()[i].getNome();
		
		if(i == (d.getQntUsuarios() - 1)) { // O usuário a ser removido está no final do array
			d.setQntUsuarios(d.getQntUsuarios() - 1);
			d.getUsuarios()[d.getQntUsuarios()] = null;
			return true;
		} else { // o usuário a ser removido está no meio do array
			int cont = 0;
			while(d.getUsuarios()[cont].getNome().compareTo(usuarioRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < d.getQntUsuarios() - 1; j++) {
				d.getUsuarios()[j] = null;
				d.getUsuarios()[j] = d.getUsuarios()[j+1];
			}
			d.getUsuarios()[d.getQntUsuarios()] = null;
			d.setQntUsuarios(d.getQntUsuarios() - 1);
			return true;
		}
	}
		
	/**
	 * Método que exclui um personal do sistema.
	 * @param i (getPersonal()[i] ; modelo.Dados)
	 * @return boolean
	 */
	
		public boolean removerPersonal(int i) {
			
			String personalRemovido = d.getPersonais()[i].getNome();

			if(i == (d.getQntPersonais() - 1)) { // O personal a ser removido está no final do array
				d.setQntPersonais(d.getQntPersonais() - 1);
				d.getPersonais()[d.getQntPersonais()] = null;
				return true;
			} else { // o personal a ser removido está no meio do array
				int cont = 0;
				while(d.getPersonais()[cont].getNome().compareTo(personalRemovido) != 0)
					cont++;
				//Rotina swap
				for(int j = cont; j < d.getQntPersonais() - 1; j++) {
					d.getPersonais()[j] = null;
					d.getPersonais()[j] = d.getPersonais()[j+1];
				}
				d.getPersonais()[d.getQntPersonais()] = null;
				d.setQntPersonais(d.getQntPersonais() - 1);
				return true;
			}
		
	}
	
	
}