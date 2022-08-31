package controle;

import modelo.Exercicio;
import modelo.Usuario;
import modelo.Treino;
import modelo.Personal;

public class Principal {

	public static void main(String[] args) {
		
		Exercicio[] e = new Exercicio[50];
		Treino[] t = new Treino[5];
		Usuario[] u = new Usuario[5];
		Personal[] p = new Personal[10];
		
		// Exercícios que o sistema possui / possibilita escolher para montar o treino
		e[0] = new Exercicio("Supino", true);
		e[1] = new Exercicio("Remada para baixo", true);
		e[2] = new Exercicio("Remada", true);
		e[3] = new Exercicio("Cadeira abdutora", false);
		e[4] = new Exercicio("Cadeira flexora", false);
		e[5] = new Exercicio("Leg press", false);
		
		// Usuários cadastrados
		u[0] = new Usuario("Gabriel", 00003, 00001, true, 55.0f, 1.63, 4, 19, "SmartFit");
		
		// Personais cadastrados
		p[0] = new Personal("Ronni", 00004, 00002, true, "Segundas e Sextas");
		
		// Treinos cadastrados
		t[0] = new Treino("Treino A", "Segunda e Quarta", 1.5f);
		t[0].addExercicio(e[0]);
		t[0].addExercicio(e[5]);
		
		// Adicionar um treino ao usuário
		u[0].addTreino(t[0]);
		
		// Adicionar um personal ao usuário
		u[0].addPersonal(p[0]);
		
		// Retorna todos os dados do usuário
		u[0].status();
	
		
	

		
		
		
	}

}
