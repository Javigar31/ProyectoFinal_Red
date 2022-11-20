package co.edu.uniquindio.proyectofinal.red.model;

public class MeGusta {
	
	/**
	 * Atributos de la clase MeGusta
	 */
	private String autor;
	private int cantidad;
	private Vendedor vendedor;

	/**
	 * MEtodo constructor con el parametro :
	 * @param autor
	 */
	public MeGusta( String autor) {
		super();

		this.autor = autor;
	}

	/**
	 * Metodo constructor vacio
	 */
	public MeGusta() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo get el autor
	 * @return
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Metodo set del autor
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Metodo get del vendedor
	 * @return
	 */
	public Vendedor getVendedor() {
		return vendedor;
	}

	/**
	 * MEtodo set del vendedor
	 * @param vendedor
	 */
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Metodo toString de la calse MeGusta
	 */
	@Override
	public String toString() {
		return "MeGusta [ autor=" + autor + "]";
	}

	
}
