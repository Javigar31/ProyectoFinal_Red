package co.edu.uniquindio.proyectofinal.red.model;

/**
 * Esta clase hereda de la clase
 * @author Usuario
 *
 */
public class Administrador {

	
	
	
	private String nombre;
	private String apellido;
	private String cedula;
	private String direccion;
	private Red red;
	
	private Usuario usuario;
	
	/**
	 *  Metodo constructor de la clase Administrador con atributos heredados de la clase Administrador
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param direccion
	 * @param usuario
	 */
	public Administrador(String nombre, String apellido, String cedula, String direccion, Usuario usuario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.direccion = direccion;

		this.usuario = usuario;
	}

	public Administrador() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Red getRed() {
		return red;
	}

	public void setRed(Red red) {
		this.red = red;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Administrador [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", direccion="
				+ direccion + ", red=" + red + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Administrador other = (Administrador) obj;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		return true;
	}

	public void actualizarUsuario(String nombreUsuario, String contrasenia) {
		
		if(getUsuario() != null){
			getUsuario().setNombreUsuario(nombreUsuario);
			getUsuario().setContrasenia(contrasenia);

		}
	}

	public boolean verificarUsuario(String usuario2, String contrasenia) {

		if(usuario.getNombreUsuario().equals(usuario2) && usuario.getContrasenia().equals(contrasenia)){
			return true;
		}
		return false;

	}
	
	

}
