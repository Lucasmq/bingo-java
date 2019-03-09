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
	
	public void Iniciar() {
		for(int i = 1; i <= QtePedras ; i++) {
			Pedras.add(new Pedra(i));
		}
	}
	
	public Boolean cestaEstaVazia() {
		return Pedras.isEmpty();		
	}
	
	public int pedraAleatoria() {
		return gerador.nextInt(pedrasRestantes());
	}
	
	public void pedraRetirada() {
		PedrasRestantes = PedrasRestantes - 1;
	}
	
	public int pedrasRestantes() {
		return PedrasRestantes;
	}
	
	public int qtePedrasChamadas() {
		return QtePedras - pedrasRestantes();
	}
	
	public Pedra retirarPedra() {		
		Pedra pedraRetirada =  Pedras.get(pedraAleatoria());
		Pedras.remove(pedraRetirada);
		pedraRetirada();
		return pedraRetirada;		
	}
	
	
	
	

}
