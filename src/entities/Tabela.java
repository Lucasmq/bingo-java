package entities;

import java.util.ArrayList;
import java.util.List;

public class Tabela {
	public List<Pedra> PedrasChamadas = new ArrayList<>();
	
	
	public Tabela(int qtePedras) {
		for(int i = 1; i <= qtePedras; i++) {
			PedrasChamadas.add(new Pedra(0)); // Não existe pedra 0 em bingo
		}
		//PedrasChamadas.remove(0);
	}
	
	public void PreencherTabela(Pedra pedra) {
		PedrasChamadas.add(pedra.getPedra()-1, pedra);
		PedrasChamadas.remove(pedra.getPedra());		
	}
	
	public void impimeTela(Cesta cesta) {
		//System.out.println("Pedra Chamada: " + pedraRetirada.getPedra());
		for(int i = 0; i < PedrasChamadas.size(); i++) {
			if(PedrasChamadas.get(i).getPedra() == 0) {
				System.out.print("\t- ");
			}else {				
				System.out.print("\t" + PedrasChamadas.get(i).getPedra() + " ");
			}
			
			if((i+1)%10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Pedras Restantes: " + cesta.PedrasRestantes + "\t\tQuantidades de Pedras Chamadas: " + cesta.qtePedrasChamadas());
	}
	
	// TODO matriz para preechar a tabela com os valores de tamanho pela quantidade de pedras
}
