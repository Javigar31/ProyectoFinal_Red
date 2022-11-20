package co.edu.uniquindio.proyectofinal.red.model;

import java.util.ArrayList;

import co.edu.uniquindio.proyectofinal.red.exceptions.AdministradorException;
import co.edu.uniquindio.proyectofinal.red.exceptions.ProductoException;
import co.edu.uniquindio.proyectofinal.red.exceptions.VendedorException;

/**
 * Clase que representa la red de vendedores
 * @author Javier Garcia - Juan Galvis
 *
 */

public class Red {
	
	/**
	 * Instancia de los atributos de la clase Red
	 */
	private String nombre;
	private ArrayList <Producto> listaProductos = new ArrayList<Producto>();
	private ArrayList <Vendedor> listaVendedores = new ArrayList<Vendedor>();
	private ArrayList <Administrador> listaAministradores = new ArrayList<Administrador>();
	
	/**
	 * Metodo contructor de la clase Red
	 * @param nombre
	 * @param listaProductos
	 * @param listaUsuarios
	 */
	public Red(String nombre, ArrayList<Producto> listaProductos, ArrayList<Vendedor> listaVendedores,
			ArrayList<Administrador> listaAministradores) {
		super();
		this.nombre = nombre;
		inicializarDatos();
	}

	/**
	 * Metodo para inicializar los datos de la red
	 */
	private void inicializarDatos() {
		
		////// Vendedores
		Vendedor vendedor = new Vendedor();
		vendedor.setNombre("Juan");
		vendedor.setApellido("Velez");
		vendedor.setCedula("12344");
		vendedor.setDireccion("cra19 #31N-91");
		listaVendedores.add(vendedor);

		Usuario usuario = new Usuario("juan", "1234");
		vendedor.setUsuario(usuario);

		vendedor = new Vendedor();
		vendedor.setNombre("Maria");
		vendedor.setApellido("Lopez");
		vendedor.setCedula("3456");
		usuario = new Usuario("maria", "1234");
		vendedor.setDireccion("cra19 #31N-91");
		vendedor.setUsuario(usuario);

		listaVendedores.add(vendedor);


		vendedor = new Vendedor();
		vendedor.setNombre("Luisa");
		vendedor.setApellido("Arenas");
		vendedor.setCedula("6654");
		usuario = new Usuario("luisa", "1234");
		vendedor.setDireccion("cra19 #31N-91");
		vendedor.setUsuario(usuario);

		listaVendedores.add(vendedor);
		
		/////// Administradores

		Administrador administrador = new Administrador();
		administrador.setNombre("Juan");
		administrador.setApellido("Velez");
		administrador.setCedula("12344");
		administrador.setDireccion("cra19 #31N-91");
		listaAministradores.add(administrador);

		Usuario usuario2 = new Usuario("juan", "1234");
		administrador.setUsuario(usuario2);

		administrador = new Administrador();
		administrador.setNombre("Maria");
		administrador.setApellido("Lopez");
		administrador.setCedula("3456");
		usuario2 = new Usuario("maria", "1234");
		administrador.setDireccion("cra19 #31N-91");
		administrador.setUsuario(usuario2);

		listaAministradores.add(administrador);
		
		
		/////// Productos
	
		Producto producto = new Producto();
		producto.setNombre("Martillo");
		producto.setCodigo("0000000");
		producto.setPrecio(12033.0);;
		producto.setCategoria("Herramientas");;
		listaProductos.add(producto);

		producto = new Producto();
		producto.setNombre("Tapete de Baño");
		producto.setCodigo("222222");
		producto.setPrecio(50400.0);;
		producto.setCategoria("Baño");;
		listaProductos.add(producto);

		producto = new Producto();
		producto.setNombre("Sofá");
		producto.setCodigo("333333");
		producto.setPrecio(503523.0);;
		producto.setCategoria("Muebles");;
		listaProductos.add(producto);

		producto = new Producto();
		producto.setNombre("Destornillador");
		producto.setCodigo("444444");
		producto.setPrecio(13243.0);;
		producto.setCategoria("Herramientas");;
		listaProductos.add(producto);

		producto = new Producto();
		producto.setNombre("Cuchillo");
		producto.setCodigo("5555555");
		producto.setPrecio(18973.0);;
		producto.setCategoria("Cocina");;
		listaProductos.add(producto);

		

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
	public ArrayList<Vendedor> getListaVendedores() {
		return listaVendedores;
	}

	/**
	 * Metodo setter de la la lista de usuarios
	 * @param listaUsuarios
	 */
	public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
		this.listaVendedores = listaVendedores;
	}

	public ArrayList <Administrador> getListaAministradores() {
		return listaAministradores;
	}

	public void setListaAministradores(ArrayList <Administrador> listaAministradores) {
		this.listaAministradores = listaAministradores;
	}

	/**
	 * Metodo toString de la clase Red
	 */
	@Override
	public String toString() {
		return "Red [nombre=" + nombre + ", listaProductos=" + listaProductos + ", listaVendedores=" + listaVendedores
				+ "]";
	}
	
////////////////CRUD para vendedor
	
	/**
	 * Metodo para crear un vendedor
	 * @param nuevoVendedor
	 * @return
	 * @throws VendedorException 
	 */
	public Vendedor crearVendedor(String nombre, String apellido, String cedula, String direccion, Usuario usuario) throws VendedorException {
		Vendedor vendedor = new Vendedor();
		vendedor.setNombre(nombre);;
		vendedor.setApellido(apellido);
		vendedor.setCedula(cedula);
		vendedor.setUsuario(usuario);
		vendedor.setDireccion(direccion);

		if(verificarVendedor(cedula) == true){
			throw new VendedorException("Estudiante ya existe");
		}
		listaVendedores.add(vendedor);
		return vendedor;
	}

	/**
	 * Metodo para verificar si el vendedor ya fue creado
	 * @param cedula
	 * @return
	 * @throws VendedorException
	 */
	private boolean verificarVendedor(String cedula) throws VendedorException {
		for (Vendedor vendedor : listaVendedores) {
			if(vendedor.getCedula().equals(cedula)){
				return true;
			}
		}
		return false;	}

	/**
	 * Metodo para buscar un vendedor
	 * @param cedula
	 * @return
	 * @throws VendedorException
	 */
	public Vendedor buscarVendedor(String cedula) throws VendedorException {
		Vendedor vendedorEncontrado = null;

		for (Vendedor vendedor : listaVendedores){	
				if(vendedor != null && vendedor.getCedula().equals(cedula)){
					vendedorEncontrado =  (Vendedor) vendedor;
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
	public String actualizarVendedor(String nombre, String apellido, String cedula, String direccion, String nombreUsuario, String contrasenia) throws VendedorException{
		String mensaje = "El vendedor fue actualizado";
		Vendedor vendedorObtenido = buscarVendedor(cedula);

		for (Vendedor vendedor:listaVendedores){
				if(vendedorObtenido.getCedula().equals(cedula)) {
					vendedor.setNombre(nombre);;
					vendedor.setApellido(apellido);
					vendedor.setCedula(cedula);
					vendedor.setDireccion(direccion);
					
					vendedor.actualizarUsuario(nombreUsuario, contrasenia);
				}
		
		}
		if(vendedorObtenido == null) {
			throw new VendedorException("El vendedor no ha sido creado");
		}
		return mensaje;
	}

	/**
	 * Metodo para eliminar un vendedor
	 * @param cedula
	 * @return
	 * @throws VendedorException
	 */
	public boolean eliminarVendedor(String cedula) throws VendedorException{
		Vendedor vendedorObtenido = buscarVendedor(cedula);

		for (Vendedor vendedor : listaVendedores) {
			
				if(vendedor.getCedula().equals(cedula)){
					listaVendedores.remove(vendedor);
					return true; 
				}
			
		}
		
		if(vendedorObtenido == null) {
			throw new VendedorException("El vendedor no a sido creado");
		}
		return false;
	}

//////////////CRUD para el administrador	
	
	/**
	 * Metodo para crear un administrador
	 * @param nuevoAdministrador
	 * @return
	 * @throws AdministradorException 
	 */
	public Administrador crearAdministrador(String nombre, String apellido, String cedula, String direccion, Usuario usuario) throws AdministradorException {
		Administrador administrador = new Administrador();
		administrador.setNombre(nombre);
		administrador.setApellido(apellido);
		administrador.setCedula(cedula);
		administrador.setUsuario(usuario);
		administrador.setDireccion(direccion);;

		if(verificarAdiministrador(cedula) == true){
			throw new AdministradorException("Administrador ya existe");
		}
		listaAministradores.add(administrador);
		return administrador;

	}

	/**
	 * Metodo para verficar un administrador
	 * @param cedula
	 * @return
	 * @throws AdministradorException
	 */
	private boolean verificarAdiministrador(String cedula) throws AdministradorException {
		
		
		for (Administrador administrador : listaAministradores) {
			if(administrador.getCedula().equals(cedula)){
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo para buscar un administrador
	 * @param cedula
	 * @return
	 * @throws AdministradorException
	 */
	public Administrador buscarAdministrador(String cedula) throws AdministradorException {
		Administrador administradorEncontrado = null;

		for (Administrador administrador : listaAministradores) {
			
				if(administrador.getCedula().equals(cedula)){
					administradorEncontrado =  (Administrador) administrador;
					break;
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
	public String actualizarAdministrador(String nombre, String apellido, String cedula, String direccion, String nombreUsuario, String contrasenia) throws AdministradorException{
		String mensaje = "El administrador fue actualizado";
		Administrador administradorObtenido = buscarAdministrador(cedula);

		for (Administrador administrador : listaAministradores) {
			if(administrador.getCedula().equals(cedula)){
				administrador.setApellido(apellido);
				administrador.setNombre(nombre);
				administrador.setCedula(cedula);
		
						administrador.actualizarUsuario(nombreUsuario,contrasenia);
				if(administradorObtenido == null) {
					throw new AdministradorException("El administrador no a sido creado");
				}
		
			}
		}
		return mensaje;
	}

	/**
	 * Metodo para eliminar un administrador
	 * @param cedula
	 * @return
	 * @throws AdministradorException
	 */
	public boolean eliminarAdministrador(String cedula) throws AdministradorException{
		Administrador administradorObtenido = buscarAdministrador(cedula);

		for (Administrador administrador : listaAministradores) {
			
				if(administrador.getCedula().equals(cedula)){
					listaVendedores.remove(administrador);
					return true; 
				}
			
		}
		
		if(administradorObtenido == null) {
			throw new AdministradorException("El administrador no a sido creado");
		}
		return false;
	}
	
////////////// CRUD para el producto

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
				productoEncontrado = producto;
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
			if(productoObtenido != null){
				if(productoObtenido.equals(listaProductos.get(i))) {
					(listaProductos.get(i)).setNombre(nombre);
					(listaProductos.get(i)).setCodigo(codigo);
					(listaProductos.get(i)).setCategoria(categoria);
					(listaProductos.get(i)).setEstado(estado);
				}
			}
		}
		if(productoObtenido == null) {
			throw new ProductoException("El producto no ha sido creado");
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
				listaProductos.remove(productoObtenido);
			}
		}
		if(productoObtenido == null) {
			throw new ProductoException("El vendedor no a sido creado");
		}
		return mensaje;
	}
	
	
	/**
	 * Metodo para verificar el usuario del vendedor
	 * @param usuario
	 * @param contrasenia
	 * @return
	 */
	public boolean verificarUsuarioVendedor(String usuario, String contrasenia) {

		for (Vendedor vendedor : listaVendedores) {
			if(vendedor.verificarUsuario(usuario,contrasenia)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Metodo para verificar el usuario del administrador
	 * @param usuario
	 * @param contrasenia
	 * @return
	 */
	public boolean verificarUsuarioAdministrador(String usuario, String contrasenia) {

		for (Administrador administrador : listaAministradores) {
			if(administrador.verificarUsuario(usuario,contrasenia)){
				return true;
			}
		}
		return false;
	}

}
