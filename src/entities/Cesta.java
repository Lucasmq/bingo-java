package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cesta {
	
	public List<Pedra> Pedras = new ArrayList<>();
	public int QtePedras;
	public int PedrasRestantes;
	private Random gerador = new Random();
	
	public Cesta(int qtePedras) {
		QtePedras = qtePedras;
		PedrasRestantes = qtePedras;
	}
	
	public void Iniciar() { // inicia a cesta com as quatidades de pedras escolhidas
		for(int i = 1; i <= QtePedras ; i++) {
			Pedras.add(new Pedra(i));
		}
	}
	
	public Boolean cestaEstaVazia() { // retorna se a cesta esta vazia ou não (fim das pedras)
		return Pedras.isEmpty();		
	}
	
	public int pedraAleatoria() {	// gera um valor aleatorio de acordo com a quatidade de pedras restantes
		return gerador.nextInt(pedrasRestantes());
	}
	
	public void pedraRetirada() {	// sinaliza a retirada de uma pedra da cesta, para guardar a quantidade restantes
		PedrasRestantes = PedrasRestantes - 1;
	}
	
	public int pedrasRestantes() { // retorna a quantidade restante de pedras na cesta
		return PedrasRestantes;
	}
	
	public int qtePedrasChamadas() { // retorna a quatidade de pedras chamadas
		return QtePedras - pedrasRestantes();
	}
	
	public Pedra retirarPedra() {		// retira uma pedra aleatoria da cesta 
		Pedra pedraRetirada =  Pedras.get(pedraAleatoria());
		Pedras.remove(pedraRetirada);
		pedraRetirada();	
		return pedraRetirada;		// retorna a pedra retirada da cesta
	}
	
}
