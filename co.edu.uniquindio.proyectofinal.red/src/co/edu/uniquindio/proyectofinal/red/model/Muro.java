package co.edu.uniquindio.proyectofinal.red.model;

public class Muro {

	/**
	 * Instancia de atributos de la clase Muro
	 */
	private String mensaje;
	private String comentario;
	private int meGusta;
	
	private Vendedor vendedor;

	/**
	 * Metodo constructor de la clase Muro
	 * @param mensaje
	 * @param comentario
	 * @param meGusta
	 * @param vendedor
	 */
	public Muro(String mensaje, String comentario, int meGusta, Vendedor vendedor) {
		super();
		this.mensaje = mensaje;
		this.comentario = comentario;
		this.meGusta = meGusta;
		this.vendedor = vendedor;
	}

	/**
	 * Metodo getter del mensaje
	 * @return
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * Metodo setter del mensaje
	 * @param mensaje
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * Metodo getter del comentario
	 * @return
	 */
	public String getComentario() {
		return comentario;
	}

	/**
	 * Metodo setter del comentario
	 * @param comentario
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	/**
	 * Metodo getter de los me gusta
	 * @return
	 */
	public int getMeGusta() {
		return meGusta;
	}

	/**
	 * Metodo setter de los me gusta
	 * @param meGusta
	 */
	public void setMeGusta(int meGusta) {
		this.meGusta = meGusta;
	}
	
	/**
	 * Metodo getter del vendedor
	 * @return
	 */
	public Vendedor getVendedor() {
		return vendedor;
	}

	/**
	 * Metodo setter del vendedor
	 * @return
	 */
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	/**
	 * Metodo toString de la clase Muro
	 */
	@Override
	public String toString() {
		return "Muro [mensaje=" + mensaje + ", comentario=" + comentario + ", meGusta=" + meGusta + ", vendedor="
				+ vendedor + "]";
	}

	/**
	 * Metodo equals de la clase Muro con el atributo vendedor
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Muro other = (Muro) obj;
		if (vendedor == null) {
			if (other.vendedor != null)
				return false;
		} else if (!vendedor.equals(other.vendedor))
			return false;
		return true;
	}
	
	
	
	
}
