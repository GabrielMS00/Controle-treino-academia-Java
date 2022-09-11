package testes;

import org.junit.jupiter.api.Test;

import controle.ControleDados;
import controle.ControleUsuario;
import view.TelaDetalhePessoa;

public class EndToEndTestes {
	

	@Test
	public void TestarFuncaoAdicionarCpf() {
		TelaDetalhePessoa detalhe = new TelaDetalhePessoa();
		
		detalhe.getTextFieldCpf();
	}
	
	@Test
	public void QuantidadePersonal() {
		ControleDados dadosD = new ControleDados();
		
		dadosD.getDados();
	}
	
	@Test
	
	public void status() {
		
		ControleDados usuario = new ControleDados();
		
		usuario.getDados();
	}


}
