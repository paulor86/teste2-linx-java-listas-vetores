package application;

import java.util.Scanner;

public class TesteAplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[11];
		double x = 0;
		double y = 0;
		boolean impares = true;
		boolean pares = false;
		String respotaImpares = "impares" + impares;
		String respotaPares = "pares" + pares;
		double contadorImpar = 0;
		double contadorPar = 0;

		System.out.print("Digite um número inteiro entre 100 e 1000: ");
		int n = sc.nextInt();
		try {
			for (int i = 1; i < vetor.length; i++) {
				vetor[i] = i;
				if (vetor[i] % 3 == 0) {
					y = vetor[i] * (0.3 * (n));
					System.out.println("Resultado: " + y);
					contadorImpar = contadorImpar + y;
				} else if (vetor[i] % 1 == 0) {
					x = vetor[i] * (0.1 * (n));
					System.out.println("Resultado: " + x);
					contadorPar = contadorPar + x;
				}
			}
			System.out.print("Desejar fazer a somatória dos números impares ou pares? ");
			respotaImpares = sc.nextLine();
			respotaPares = sc.nextLine();
			if (respotaImpares.equals(respotaImpares)) {
				System.out.println("Resultado da soma dos números impares: " + contadorImpar);
			} else if (respotaPares.equals(respotaPares)) {
				System.out.println("Resultado da soma dos números impares: " + contadorPar);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
