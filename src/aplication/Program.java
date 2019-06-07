package aplication;

import java.util.Scanner;

import entities.Cesta;
import entities.Pedra;
import entities.Tabela;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quatidade de pedras do Bingo: ");
		
		int qtePedras = sc.nextInt();
		sc.nextLine();
		Cesta cesta = new Cesta(qtePedras); // cria uma nova cesta com a quantidade de pedras declaradas
		Tabela tab = new Tabela(qtePedras);	// cria uma tabela com a quantidade de pedras declaradas
		
		cesta.Iniciar(); // inicia a cesta com as pedras
		
		while(!cesta.cestaEstaVazia()) {
			
			for (int i = 0; i < 50; ++i) System.out.println(); 					      // para limpar o console
			Pedra pedraRetirada = cesta.retirarPedra();							      // pedra retirada para ser marcada
			System.out.println("Pedra Chamada: " + pedraRetirada.getPedra());
			tab.PreencherTabela(pedraRetirada);  									 // adiciona a pedra retirada a tabela
			tab.impimeTela(cesta);													 // imprime na tela as pedras já chamadas
			
			sc.nextLine();
				
		}

		sc.close();
	}
	

}
