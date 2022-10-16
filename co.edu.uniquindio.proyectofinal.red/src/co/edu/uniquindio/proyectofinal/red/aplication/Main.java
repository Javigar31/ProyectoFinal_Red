package co.edu.uniquindio.proyectofinal.red.aplication;

import javax.swing.JOptionPane;

import co.edu.uniquindio.proyectofinal.red.model.Red;
import co.edu.uniquindio.proyectofinal.red.model.Vendedor;

public class Main {

	static Red red = new Red("Red de vendedores");
	public static void main(String[] args) {
		Vendedor vendedor1 = new Vendedor("Juan", "Lopez", "Cl 13", "12355", null, null);
		Vendedor vendedor2 = new Vendedor("Juan", "Lopez", "Cl 13", "12355", null, null);


		String  mensaje =  red.crearVendedor(vendedor1);
		String  mensaje2 =  red.crearVendedor(vendedor2);

		JOptionPane.showMessageDialog(null, mensaje);
		JOptionPane.showMessageDialog(null, mensaje2);

	}

}
