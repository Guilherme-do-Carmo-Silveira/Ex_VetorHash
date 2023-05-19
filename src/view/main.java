package view;

import javax.swing.JOptionPane;

import controller.VetorController;

public class main {

	public static void main(String[] args) {
		VetorController c = new VetorController();
		c.GeraTab();

		int valor;
		do {
			valor = Integer.parseInt(JOptionPane.showInputDialog("1 - Valores pares \n2 - valores ímpares \n3 - finaliza"));
			c.mostra(valor);
		} while (valor != 3);
	}

}
