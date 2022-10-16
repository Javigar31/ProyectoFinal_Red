package co.edu.uniquindio.proyectofinal.red.model;

public abstract class Usuario {

	/**
	 * Instancia de atrubutos de la clase Usuario
	 */
	private String nombre;
	private String apellido;
	private String cedula;
	private String direccion;
	
	private Red red;
	
	/**
	 * Metodo constructor de la clase Usuario
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param direccion
	 * @param red
	 */
	public Usuario(String nombre, String apellido, String cedula, String direccion, Red red) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.direccion = direccion;
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
	 * Metodo getter del apellido
	 * @return
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Metodo setter del apellido	
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Metodo getter de la cedula
	 * @return
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * Metodo setter de la cedula
	 * @param cedula
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * Metodo getter de la direccion
	 * @return
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Metodo setter de la direccion
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
	 * Metodo toString de la clase Usuario
	 */
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", direccion="
				+ direccion + ", red=" + red + "]";
	}

	/**
	 * Metodo equals de la clase Usuario con el parametro cedula
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		return true;
	}
	
	
	
	
}
