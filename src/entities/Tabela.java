package entities;

import java.util.ArrayList;
import java.util.List;

public class Tabela {
	
	public List<Pedra> PedrasChamadas = new ArrayList<>();
		
	public Tabela(int qtePedras) {
		for(int i = 1; i <= qtePedras; i++) {
			PedrasChamadas.add(new Pedra(0)); // Não existe pedra 0 em bingo, preenche com pedras 0
		}
	}
	
	public void PreencherTabela(Pedra pedra) {
		PedrasChamadas.add(pedra.getPedra()-1, pedra);  // adiciona a pedra no index correspondente da lista
		PedrasChamadas.remove(pedra.getPedra());		// deleta a pedra com o valor 0 correspondente ao index anterior
	}
	
	public void impimeTela(Cesta cesta) {
		// TODO colocar a ultima pedra chamada aqui e retirar do main
		for(int i = 0; i < PedrasChamadas.size(); i++) {	// for por todas as pedras para imprimir na tela
			if(PedrasChamadas.get(i).getPedra() == 0) {		// caso o valor da pedra seja 0, imprime "- "
				System.out.print("\t- ");
			}else {				
				System.out.print("\t" + PedrasChamadas.get(i).getPedra() + " "); // se não, imprime o valor já chamado ( "\t" da um tab no texto)
			}
			
			if((i+1)%10 == 0) {		// a escolha do for com o index i, foi para da um "\n" a cada 10 valores impressos da tela
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Pedras Restantes: " 
							+ cesta.PedrasRestantes 
							+ "\t\tQuantidades de Pedras Chamadas: "
							+ cesta.qtePedrasChamadas());
	}
	
	
}
