package controller;


import java.util.Scanner;

public class exc03con {
	public exc03con() {
		super();
	}
	public static void bubble( ) {
		System.out.println("digite o tamanho do vetor: ");
		
		Scanner sc = new Scanner(System.in);
		int cont= sc.nextInt();
		int[] vetor = new int[cont];
		int i = 0;
		
		while (i<cont) {
			System.out.println("digite o numero da posição " + i+1 +" do vetor: ");
			vetor[i] = sc.nextInt();
			i = i + 1;
			
		}
		i = 0;
		System.out.println("vetor digitado: ");
		while (i<cont) {
			System.out.print(" - "+ vetor[i]);
			i = i + 1;
		}
		i = 0;
		int x=0;
		int aux=0;
		
		while (x < vetor.length) {
			while(i<vetor.length-1) {
				if(vetor[i]>vetor[i+1]) {
					aux = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] =aux;
				}
				i = i+ 1;
			}
			x= x +1;
			i = 0;
		}
		System.out.println("  ");
		System.out.println("vetor organizado: ");
		
		while (i<cont) {
			System.out.print(" - "+ vetor[i]);
			i = i + 1;
		}
		
	
	}
	
}
