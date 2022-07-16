package aplicacao;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa(1, "Andre", "andre@email.com");
		Pessoa p2 = new Pessoa(2, "Priscila", "priscila@email.com");
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
