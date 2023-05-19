package controller;

import docarmo.listaEncadeadaInt.Lista;

public class VetorController {

	Lista[] Tabela;

	public VetorController() {
		Tabela = new Lista[2];
		for (int i = 0; i < 2; i++) {
			Tabela[i] = new Lista();
		}
	}

	private int HashCode(int valor) {
		int pos = valor % 2;
		return pos;
	}

	public void GeraTab() {
		int tam= (int) (Math.random() * 10) + 1;
		System.out.println("Quantidade de valores: " + tam + "\n");
		for (int i = 0; i < tam; i++) {
			int valor = (int) (Math.random() * 10) + 1;
			int pos = HashCode(valor);
			if (Tabela[pos].isEmpty()) {
				Tabela[pos].addFirst(valor);
			} else {
				try {
					Tabela[pos].addLast(valor);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void mostra(int valor) {
		if(valor == 1) {
			int tam = Tabela[0].size();
			for(int i = 0; i < tam; i++) {
				try {
					System.out.print(Tabela[0].get(i) + " ");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("\n");
		}else if(valor == 2) {
			int tam = Tabela[1].size();
			for(int i = 0; i < tam; i++) {
				try {
					System.out.print(Tabela[1].get(i) + " ");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
