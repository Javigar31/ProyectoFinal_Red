package co.edu.uniquindio.proyectofinal.red.model;

public class Mensaje {

	/**
	 * Atributos de la clase Mensaje
	 */
	private String hora;
	private String codigo;
	private String mensaje;
	private String autor;
	
	private Vendedor vendedor;

	/**
	 * Metodo construcror con los parametros:
	 * @param hora
	 * @param codigo
	 * @param mensaje
	 * @param autor
	 */
	public Mensaje(String hora, String codigo, String mensaje, String autor) {
		super();
		this.hora = hora;
		this.codigo = codigo;
		this.mensaje = mensaje;
		this.autor = autor;
	}

	/**
	 * MEtodo constructor vacio
	 */
	public Mensaje() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo get de la hora
	 * @return
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * Metodo set de la hora
	 * @param hora
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * Metodo get del codigo
	 * @return
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Metodo set del codigo
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Metodo get del mensaje
	 * @return
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * Metdo set del mensaje
	 * @param mensaje
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * Metodo get del autor
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
	 * Metodo set del vendedor
	 * @param vendedor
	 */
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	/**
	 * Metodo toString de la clase Mensaje
	 */
	@Override
	public String toString() {
		return "Mensaje [hora=" + hora + ", codigo=" + codigo + ", mensaje=" + mensaje + ", autor=" + autor
				+ ", vendedor=" + vendedor + "]";
	}


	/**
	 * Metodo equals con el atributo codigo
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mensaje other = (Mensaje) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}



	
	
}
