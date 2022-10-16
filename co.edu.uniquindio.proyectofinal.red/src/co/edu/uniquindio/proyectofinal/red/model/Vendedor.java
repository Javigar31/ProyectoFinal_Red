package co.edu.uniquindio.proyectofinal.red.model;

import java.util.ArrayList;

/**
 * Esta clase hereda de la clase
 * @author Usuario
 *
 */
public class Vendedor extends Usuario {

	/**
	 * Instancia de atributos de la clase Vendedor 
	 */
	private Vendedor contacto;
	private Muro muro;
	private ArrayList <Producto> listaProductos = new ArrayList <Producto> () ;
	private ArrayList <Vendedor> listaContactos = new ArrayList <Vendedor> ();
	
	/**
	 * Metodo constructor de la clase Vendedor con atributos heredados de la clase Usuario
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param direccion
	 * @param red
	 * @param listaProductos
	 */
	public Vendedor(String nombre, String apellido, String cedula, String direccion, Red red, Vendedor contacto,
			Muro muro, ArrayList<Producto> listaProductos, ArrayList<Vendedor> listaContactos) {
		super(nombre, apellido, cedula, direccion, red);
		this.contacto = contacto;
		this.muro = muro;
		this.listaProductos = listaProductos;
		this.listaContactos = listaContactos;
	}

	/**
	 * Metodo getter de la lista de productos
	 * @return
	 */
	public ArrayList <Producto> getListaProductos() {
		return listaProductos;
	}

	

	/**
	 * Metodo setter de la lista de productos
	 * @param listaProductos
	 */
	public void setListaProductos(ArrayList <Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	/**
	 * Metodo getter del contacto
	 * @return
	 */
	public Vendedor getContacto() {
		return contacto;
	}

	/**
	 * Metodo setter del contacto
	 * @param contacto
	 */
	public void setContacto(Vendedor contacto) {
		this.contacto = contacto;
	}
	
	/**
	 * Metodo getter del muro
	 * @return
	 */
	public Muro getMuro() {
		return muro;
	}

	/**
	 * Mwtodo setter del muro
	 * @param muro
	 */
	public void setMuro(Muro muro) {
		this.muro = muro;
	}

	/**
	 * Metodo getter de la lista de contactos
	 * @return
	 */
	public ArrayList<Vendedor> getListaContactos() {
		return listaContactos;
	}

	/**
	 * Metodo setter de la lista de contactos
	 * @param listaContactos
	 */
	public void setListaContactos(ArrayList<Vendedor> listaContactos) {
		this.listaContactos = listaContactos;
	}

	/**
	 * Metodo toString de la clase Vendedor
	 */
	@Override
	public String toString() {
		return "Vendedor [contacto=" + contacto + ", muro=" + muro + ", listaProductos=" + listaProductos
				+ ", listaContactos=" + listaContactos + "]";
	}
}
