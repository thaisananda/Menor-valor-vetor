package controller;

public class MenorValor {
	
	public MenorValor () {
		super();
	}

	public int Menor(int [] vetor, int tamanho, int menor) {
		/*
		 * Condição de parada: se restar apenas um elemento no vetor, 
		 * retorna o menor valor encontrado.
		 */
		if (tamanho == 0) {
			return menor;
		}

		// Atualiza o menor valor se o elemento atual for menor
		if (vetor[tamanho - 1] < menor) {
			menor = vetor[tamanho - 1];
		}

		// Chama recursivamente com tamanho reduzido
		return Menor(vetor, tamanho - 1, menor);
	}
}
