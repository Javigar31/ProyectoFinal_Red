package co.edu.uniquindio.proyectofinal.red.model;

import java.util.ArrayList;

import co.edu.uniquindio.proyectofinal.red.exceptions.AdministradorException;
import co.edu.uniquindio.proyectofinal.red.exceptions.ProductoException;
import co.edu.uniquindio.proyectofinal.red.exceptions.VendedorException;



public class Red {
	
	/**
	 * Intancia de los atrubitos de la clase Red
	 */
	private String nombre;
	
	private ArrayList <Producto> listaProductos = new ArrayList<Producto>();
	private ArrayList <Usuario> listaUsuarios = new ArrayList<Usuario>();
	
	/**
	 * Metodo contructor de la clase Red
	 * @param nombre
	 * @param listaProductos
	 * @param listaUsuarios
	 */
	public Red(String nombre) {
		super();
		this.nombre = nombre;
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
	 * Metodo getter de la la lista de productos
	 * @return
	 */
	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	/**
	 * Metodo setter de la la lista de productos
	 * @param listaProductos
	 */
	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	/**
	 * Metodo getter de la la lista de usuarios
	 * @return
	 */
	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	/**
	 * Metodo setter de la la lista de usuarios
	 * @param listaUsuarios
	 */
	public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	/**
	 * Metodo toString de la clase Red
	 */
	@Override
	public String toString() {
		return "Red [nombre=" + nombre + ", listaProductos=" + listaProductos + ", listaUsuarios=" + listaUsuarios
				+ "]";
	}
	
////////////////CRUD para vendedor
	
	/**
	 * Metodo para crear un vendedor
	 * @param nuevoVendedor
	 * @return
	 */
	public String crearVendedor(Vendedor nuevoVendedor) {
		String mensaje = "";
		try {
			verificarVendedor(nuevoVendedor.getCedula());
			listaUsuarios.add(nuevoVendedor);
			mensaje = "el vendedor fue creado";
		} catch (VendedorException e) {
			mensaje  = e.getMessage();
		}
		return mensaje;
	}

	/**
	 * Metodo para verificar si el vendedor ya fue creado
	 * @param cedula
	 * @return
	 * @throws VendedorException
	 */
	private Vendedor verificarVendedor(String cedula) throws VendedorException {
		Vendedor vendedorVerificado = null;

		for (Usuario vendedor : listaUsuarios) {
			if(vendedor instanceof Vendedor){
				if(vendedor.getCedula().equals(cedula)){
					vendedorVerificado =  (Vendedor) vendedor;
					throw new VendedorException ("El vendedor ya existe");
				}
			}
		}
		return vendedorVerificado;
	}

	/**
	 * Metodo para buscar un vendedor
	 * @param cedula
	 * @return
	 * @throws VendedorException
	 */
	public Vendedor buscarVendedor(String cedula) throws VendedorException {
		Vendedor vendedorEncontrado = null;

		for (Usuario vendedor : listaUsuarios) {
			if(vendedor instanceof Vendedor){	
				if(vendedor.getCedula().equals(cedula)){
					vendedorEncontrado =  (Vendedor) vendedor;
					break;
				}
			}
		}
		if(vendedorEncontrado == null){
			throw new VendedorException ("Vendedor no encontrado");
		}
		return vendedorEncontrado;
	}

	/**
	 * Metodo para actualizar un vendedor
	 * @param cedula
	 * @param listaUsuarios
	 * @return
	 * @throws VendedorException
	 */
	public String actualizarVendedor(String nombre, String apellido, String cedula, String direccion) throws VendedorException{
		String mensaje = "El vendedor fue actualizado";
		Vendedor vendedorObtenido = buscarVendedor(cedula);

		for (int i = 0; i< listaUsuarios.size(); i++) {
			if(vendedorObtenido.equals(listaUsuarios.get(i))) {
				(listaUsuarios.get(i)).setNombre(nombre);
				(listaUsuarios.get(i)).setApellido(apellido);
				(listaUsuarios.get(i)).setCedula(cedula);
				(listaUsuarios.get(i)).setDireccion(direccion);
			}
		}
		if(vendedorObtenido == null) {
			throw new VendedorException("El vendedor no a sido creado");
		}


		return mensaje;
	}

	/**
	 * Metodo para eliminar un vendedor
	 * @param cedula
	 * @return
	 * @throws VendedorException
	 */
	public String eliminarVendedor(String cedula) throws VendedorException{
		String mensaje = "El vendedor fue eliminado";
		Vendedor vendedorObtenido = buscarVendedor(cedula);

		for (int i = 0; i < listaUsuarios.size(); i++) {
			if(vendedorObtenido.equals(listaUsuarios.get(i))) {
				listaUsuarios.add(i, null);
			}
		}
		if(vendedorObtenido == null) {
			throw new VendedorException("El vendedor no a sido creado");
		}
		return mensaje;
	}

//////////////CRUD para el administrador	
	
	/**
	 * Metodo para crear un administrador
	 * @param nuevoAdministrador
	 * @return
	 */
	public String crearAdministrador(Administrador nuevoAdministrador) {
		String mensaje = "";
		try {
			verificarAdiministrador(nuevoAdministrador.getCedula());
			listaUsuarios.add(nuevoAdministrador);
			mensaje = "el administrador fue creado";
		} catch (AdministradorException e) {
			mensaje  = e.getMessage();
		}
		return mensaje;
	}

	/**
	 * Metodo para verficar un administrador
	 * @param cedula
	 * @return
	 * @throws AdministradorException
	 */
	private Administrador verificarAdiministrador(String cedula) throws AdministradorException {
		Administrador administradorVerificado = null;

		for (Usuario administrador : listaUsuarios) {
			if(administrador instanceof Administrador){	
				if(administrador.getCedula().equals(cedula)){
					administradorVerificado =  (Administrador) administrador;
					throw new AdministradorException ("El administrador ya existe");
				}
			}
		}
		return administradorVerificado;
	}

	/**
	 * Metodo para buscar un administrador
	 * @param cedula
	 * @return
	 * @throws AdministradorException
	 */
	public Administrador buscarAdministrador(String cedula) throws AdministradorException {
		Administrador administradorEncontrado = null;

		for (Usuario administrador : listaUsuarios) {
			if(administrador instanceof Administrador){	
				if(administrador.getCedula().equals(cedula)){
					administradorEncontrado =  (Administrador) administrador;
					break;
				}
			}
		}
		if(administradorEncontrado == null){
			throw new AdministradorException ("Administrador no encontrado");
		}
		return administradorEncontrado;
	}

	/**
	 * Metodo para actualizar un administrador
	 * @param cedula
	 * @param listaUsuarios
	 * @return
	 * @throws AdministradorException
	 */
	public String actualizarAdministrador(String nombre, String apellido, String cedula, String direccion) throws AdministradorException{
		String mensaje = "El administradorObtenido fue actualizado";
		Administrador administradorObtenido = buscarAdministrador(cedula);

		for (int i = 0; i< listaUsuarios.size(); i++) {
			if(administradorObtenido.equals(listaUsuarios.get(i))) {
				(listaUsuarios.get(i)).setNombre(nombre);
				(listaUsuarios.get(i)).setApellido(apellido);
				(listaUsuarios.get(i)).setCedula(cedula);
				(listaUsuarios.get(i)).setDireccion(direccion);
			}
		}
		if(administradorObtenido == null) {
			throw new AdministradorException("El administrador no a sido creado");
		}


		return mensaje;
	}

	/**
	 * Metodo para eliminar un administrador
	 * @param cedula
	 * @return
	 * @throws AdministradorException
	 */
	public String eliminarAdministrador(String cedula) throws AdministradorException{
		String mensaje = "El administrador fue eliminado";
		Administrador administradorObtenido = buscarAdministrador(cedula);

		for (int i = 0; i < listaUsuarios.size(); i++) {
			if(administradorObtenido.equals(listaUsuarios.get(i))) {
				listaUsuarios.add(i, null);
			}
		}
		if(administradorObtenido == null) {
			throw new AdministradorException("El administrador no a sido creado");
		}
		return mensaje;
	}
	
////////////// CURD para el producto

	/**
	 * Metodo para crear un producto
	 * @param nuevoProducto
	 * @return
	 */
	public String crearProducto(Producto nuevoProducto) {
		String mensaje = "";
		try {
			verificarProducto(nuevoProducto.getCodigo());
			listaProductos.add(nuevoProducto);
			mensaje = "El producto fue creado";
		} catch (ProductoException e) {
			mensaje  = e.getMessage();
		}
		return mensaje;
	}

	/**
	 * Metodo para verificar un producto
	 * @param codigo
	 * @return
	 * @throws ProductoException
	 */
	private Producto verificarProducto(String codigo) throws ProductoException {
		Producto productoVerificado = null;

		for (Producto producto : listaProductos) {
			if(producto.getCodigo().equals(codigo)){
				productoVerificado =  (Producto) producto;
				throw new ProductoException ("El producto ya existe");
			}
		}
		return productoVerificado;
	}

	/**
	 * Metodo para buscar un producto
	 * @param codigo
	 * @return
	 * @throws ProductoException
	 */
	public Producto buscarProducto(String codigo) throws ProductoException {
		Producto productoEncontrado = null;

		for (Producto producto : listaProductos) {
			if(producto.getCodigo().equals(codigo)){
				productoEncontrado =  (Producto) producto;
				break;
			}
		}
		if(productoEncontrado == null){
			throw new ProductoException ("Producto no encontrado");
		}
		return productoEncontrado;
	}

	/**
	 * Metodo para actualizar un producto
	 * @param codigo
	 * @param listaProductos
	 * @return
	 * @throws ProductoException
	 */
	public String actualizarProducto(String nombre, String codigo, String categoria, Estado estado) throws ProductoException{
		String mensaje = "El producto fue actualizado";
		Producto productoObtenido = buscarProducto(codigo);

		for (int i = 0; i< listaProductos.size(); i++) {
			if(productoObtenido.equals(listaProductos.get(i))) {
				(listaProductos.get(i)).setNombre(nombre);
				(listaProductos.get(i)).setCodigo(codigo);
				(listaProductos.get(i)).setCategoria(categoria);
				(listaProductos.get(i)).setEstado(estado);
			}
		}
		if(productoObtenido == null) {
			throw new ProductoException("El producto no a sido creado");
		}


		return mensaje;
	}

	/**
	 * Metodo para eliminar un producto
	 * @param codigo
	 * @return
	 * @throws ProductoException
	 */
	public String eliminarProducto(String codigo) throws ProductoException{
		String mensaje = "El producto fue eliminado";
		Producto productoObtenido = buscarProducto(codigo);

		for (int i = 0; i < listaProductos.size(); i++) {
			if(productoObtenido.equals(listaProductos.get(i))) {
				listaProductos.add(i, null);
			}
		}
		if(productoObtenido == null) {
			throw new ProductoException("El vendedor no a sido creado");
		}
		return mensaje;
	}

}
