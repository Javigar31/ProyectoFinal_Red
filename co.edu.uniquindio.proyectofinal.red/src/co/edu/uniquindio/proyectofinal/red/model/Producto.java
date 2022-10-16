package co.edu.uniquindio.proyectofinal.red.model;

public class Producto {
 
	/**
	 * Instancia de atributos de la clase Producto
	 */
	private String nombre;
	private String codigo;
	private String categoria;
	private double precio;
	private Estado estado;
	
	private Vendedor vendedor;
	private Red red;

	/**
	 * Metodo costructor de la clase Producto
	 * @param nombre
	 * @param codigo
	 * @param categoria
	 * @param precio
	 * @param estado
	 * @param red
	 */
	public Producto(String nombre, String codigo, String categoria, double precio, Estado estado, Vendedor vendedor, Red red) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.categoria = categoria;
		this.precio = precio;
		this.estado = estado;
		this.vendedor = vendedor;
		this.red = red;
	}

	/**
	 * Metodo getter del nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo setter del nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo getter del codigo
	 * @return
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Metodo setter del codigo
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Metodo getter de la categoria
	 * @return
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * Metodo setter de la categoria
	 * @param categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * Metodo getter del precio
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Metodo setter del precio
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Metodo getter del estado
	 * @return
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * Metodo setter del estado
	 * @param estado
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
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
	 * Metodo getter de la red
	 * @return
	 */
	public Red getRed() {
		return red;
	}

	/**
	 * Metodo setter de la red
	 * @param red
	 */
	public void setRed(Red red) {
		this.red = red;
	}

	/**
	 * Metodo toString de la clase Producto
	 */
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", categoria=" + categoria + ", precio=" + precio
				+ ", estado=" + estado + ", vendedor=" + vendedor + ", red=" + red + "]";
	}
	
	/**
	 * Metodo equals de la clase Producto con el atributo codigo
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	
	
	
}
