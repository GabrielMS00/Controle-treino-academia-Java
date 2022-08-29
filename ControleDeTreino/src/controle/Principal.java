package controle;

import modelo.Exercicio;
import modelo.Treino;

public class Principal {

	public static void main(String[] args) {
		
		Exercicio[] e = new Exercicio[50];
		Treino[] t = new Treino[5];
		
		// Exercícios que o sistema possui / possibilita escolher para montar o treino
		e[0] = new Exercicio("Supino", true);
		e[1] = new Exercicio("Remada para baixo", true);
		e[2] = new Exercicio("Remada", true);
		e[3] = new Exercicio("Cadeira abdutora", false);
		e[4] = new Exercicio("Cadeira flexora", false);
		e[5] = new Exercicio("Leg press", false);
		
		t[0] = new Treino("Treino de Pernas", "Segunda", 1.5f);
		t[0].addExercicio(e[1]);
		t[0].addExercicio(e[0]);
		
		t[0].status();
		
		
			

	}

}
