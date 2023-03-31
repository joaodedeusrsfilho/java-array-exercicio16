package aula19_Arrays;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule
		 * e escreva:
		 * 
		 * a) a soma de elementos armazenados neste vetor que são inferiores a 15;
		 * 
		 * b) a quantidade de elementos armazenados no vetor que são iguais a 15;
		 * 
		 * c) a média dos elementos armazenados no vetor que são superiores a 15.
		 */

		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[4];
		int tamanhoDoVetorA = vetorA.length;
		int somaMenorQue15 = 0;
		int somaIgualA15 = 0;
		int elementosMaiorQue15 = 0;
		int contarElementosMaiorQue15 = 0;

		for (int i = 0; i < tamanhoDoVetorA; i++) {
			System.out.println("Entre com o valor da posicao: " + i);
			vetorA[i] = ler.nextInt();
			if (vetorA[i] < 15) {
				somaMenorQue15 += vetorA[i];
			}
			if (vetorA[i] == 15) {
				somaIgualA15++;
			}
			if (vetorA[i] > 15) {
				elementosMaiorQue15 += vetorA[i];
				contarElementosMaiorQue15++;
			}
		}
		float media = elementosMaiorQue15 / contarElementosMaiorQue15;
		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + ", ");
		}

		System.out.println();
		System.out.println(
				"a) a soma de elementos armazenados " + "neste vetor que são inferiores a 15 = " + somaMenorQue15);
		System.out.println();
		System.out.println("a quantidade de elementos armazenados no vetor que" + "são iguais a 15 = " + somaIgualA15);
		System.out.println();
		System.out.println("a média dos elementos armazenados" + "no vetor que são superiores a 15 = " + media);
	}
}
