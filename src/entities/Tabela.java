package entities;

import java.util.ArrayList;
import java.util.List;

public class Tabela {
	public List<Pedra> PedrasChamadas = new ArrayList<>();
	
	public void PreencherTabela(Pedra pedra) {
		PedrasChamadas.add(pedra);
	}
	
	// TODO matriz para preechar a tabela com os valores de tamanho pela quantidade de pedras

}
