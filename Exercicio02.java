package Exercicios;

import javax.swing.*;

import controller.MenorValor;

public class Exercicio02 {
	
	public static void main (String[] args) {
		
		MenorValor menor = new MenorValor();
		
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
		
		int vetor[] = new int [tamanho];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		}
		
		int menorValor = menor.Menor(vetor, tamanho, vetor[tamanho - 1]);

	    System.out.println("O menor valor do vetor é: " + menorValor);
	}

}
