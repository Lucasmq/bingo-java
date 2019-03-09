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
		Cesta cesta = new Cesta(qtePedras);
		Tabela tab = new Tabela(qtePedras);
		
		cesta.Iniciar();
		
		while(!cesta.cestaEstaVazia()) {
			
			for (int i = 0; i < 50; ++i) System.out.println();
			Pedra pedraRetirada = cesta.retirarPedra();
			System.out.println("Pedra Chamada: " + pedraRetirada.getPedra());
			tab.PreencherTabela(pedraRetirada);
			tab.impimeTela(cesta);
			//System.out.println("Pedras Restantes: " + cesta.PedrasRestantes + "\t\tQuantidades de Pedras Chamadas: " + cesta.qtePedrasChamadas());
			sc.nextLine();
			//System.out.println(pedraRetirada.getPedra());			
		}

		sc.close();
	}
	

}
