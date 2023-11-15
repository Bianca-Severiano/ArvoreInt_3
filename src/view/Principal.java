package view;

import br.edu.fateczl.arvore.ArvoreInt.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		ArvoreInt arv = new ArvoreInt();
		int[] vetor = { 30, 15, 60, 10, 20, 40, 80 };

		for (int i : vetor) {
			arv.insert(i);
		}
		
		try {
			arv.prefixSearch();
			arv.infixSearch();
			arv.postfixSearch();
			System.out.println("Atravessamento infixo apresenta arvore em ordem crescente, removendo o 60 temos:");
			arv.remove(60);
			arv.infixSearch();
		} catch (Exception e) {
			e.getStackTrace();
		}
		

	}

}
