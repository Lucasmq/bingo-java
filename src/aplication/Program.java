package aplication;

import java.util.Scanner;

import entities.Cesta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quatidade de pedras do Bingo: ");
		
		int qtePedras = sc.nextInt();
		
		Cesta cesta = new Cesta(qtePedras);
		
		cesta.Iniciar();
		
		while(!cesta.cestaEstaVazia()) {
			System.out.println(cesta.retirarPedra().getPedra());			
		}

		sc.close();
	}
	

}
