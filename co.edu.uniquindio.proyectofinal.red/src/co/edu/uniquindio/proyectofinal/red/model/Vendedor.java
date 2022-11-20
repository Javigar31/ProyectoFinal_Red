package co.edu.uniquindio.proyectofinal.red.model;

import java.util.ArrayList;

import co.edu.uniquindio.proyectofinal.red.exceptions.ComentarioException;
import co.edu.uniquindio.proyectofinal.red.exceptions.ContactoException;
import co.edu.uniquindio.proyectofinal.red.exceptions.MensajeException;
import co.edu.uniquindio.proyectofinal.red.exceptions.ProductoException;
import co.edu.uniquindio.proyectofinal.red.exceptions.VendedorException;

/**
 * Esta clase hereda de la clase
 * @author Usuario
 *
 */
public class Vendedor  {

	/**
	 * Instancia de atributos de la clase Vendedor 
	 */
	private String nombre;
	private String apellido;
	private String cedula;
	private String direccion;
	private Red red;
	
	private Usuario usuario;
	
	private ArrayList <Producto> listaProductos = new ArrayList <Producto> ();
	private ArrayList <Vendedor> listaContactos = new ArrayList <Vendedor> ();
	private ArrayList<Mensaje>	mensajes= new ArrayList <Mensaje>();
	private ArrayList<Comentario> comentarios= new ArrayList <Comentario>();
	private ArrayList<MeGusta> likes= new ArrayList <MeGusta>();
	
	/**
	 *  Metodo constructor de la clase Vendedor con atributos heredados de la clase Vendedor
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param direccion
	 * @param red
	 * @param usuario
	 * @param listaProductos
	 * @param listaContactos
	 */
	public Vendedor(String nombre, String apellido, String cedula, String direccion, Usuario usuario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.direccion = direccion;
		
		this.usuario = usuario;
		
		inicializarDatos();
		obtenerCantidadLikes();
		
	}

	private void inicializarDatos() {
	
		//////Contactos
		Vendedor contacto = new Vendedor();
		contacto.setNombre("Juana");
		contacto.setApellido("Velez");
		contacto.setCedula("12344");
		contacto.setDireccion("cra19 #31N-91");
		listaContactos.add(contacto);

		Usuario usuario = new Usuario("juan", "1234");
		contacto.setUsuario(usuario);

		contacto = new Vendedor();
		contacto.setNombre("Mariano");
		contacto.setApellido("Lopez");
		contacto.setCedula("3456");
		usuario = new Usuario("maria", "1234");
		contacto.setDireccion("cra19 #31N-91");
		contacto.setUsuario(usuario);

		listaContactos.add(contacto);
		
		/////// Mensajes
		Mensaje mensaje = new Mensaje();
		mensaje.setMensaje("Hola, ¿Cómo estás?");
		mensaje.setHora("01:40 p.m.");
		mensaje.setCodigo("1111");
		mensaje.setAutor("Juana");
		mensajes.add(mensaje);
		
		mensaje=new Mensaje();
		mensaje.setMensaje("Bien o no?");
		mensaje.setHora("11:40 p.m.");
		mensaje.setCodigo("2222");
		mensaje.setAutor("Mariano");
		mensajes.add(mensaje);
		
		/////// Comentarios
		
		Comentario comentario = new Comentario();
		comentario.setMensaje("Excelente calidad");
		comentario.setHora("01:40 p.m.");
		comentario.setCodigo("1111");
		comentario.setAutor("Juana");
		comentarios.add(comentario);
		
		comentario=new Comentario();
		comentario.setMensaje("No me gustó el material");
		comentario.setHora("11:40 p.m.");
		comentario.setCodigo("2222");
		comentario.setAutor("Mariano");
		comentarios.add(comentario);
		
		/////// Me Gustas
		MeGusta like= new MeGusta();
		like.setAutor("Juan");
		likes.add(like);
		
		like= new MeGusta();
		like.setAutor("Luisa");
		likes.add(like);	
	}

	/**
	 * MEtodo constructor vacio
	 */
	public Vendedor() {
		
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
	 * Metodo get de los mensajes
	 * return
	 */
	public ArrayList<Mensaje> getMensajes() {
		return mensajes;
	}

	/**
	 * Metodo set de los mensajes
	 * @param mensajes
	 */
	public void setMensajes(ArrayList<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}

	/**
	 * Metodo get de los comntarios
	 * @return
	 */
	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}

	/**
	 * Metodo set de los comentarios
	 * @param comentarios
	 */
	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	/**
	 * MEtodo get  de los Me Gustas
	 * @return
	 */
	public ArrayList<MeGusta> getLikes() {
		return likes;
	}

	/**
	 * Metodo set de los Me Gustas
	 * @param likes
	 */
	public void setLikes(ArrayList<MeGusta> likes) {
		this.likes = likes;
	}

	/**
	 * Metodo get del nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set del nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get del apellido
	 * @return
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Metodo set del apellido
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Metodo get de la cedula
	 * @return
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * Metodo set de la cedula
	 * @param cedula
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * Metodo get de la direccion
	 * @return
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Metodo set de la dreccion
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Metodo get de la red
	 * @return
	 */
	public Red getRed() {
		return red;
	}

	/**
	 * MEtodo set de la red
	 * @param red
	 */
	public void setRed(Red red) {
		this.red = red;
	}

	/**
	 * Metodo get del usuario
	 * @return
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * etodo set del usuario
	 * @param usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Metodo toString de la clase Vendedor
	 */
	@Override
	public String toString() {
		return "Vendedor [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", direccion="
				+ direccion + ", red=" + red + ", listaProductos=" + listaProductos + ", listaContactos="
				+ listaContactos + "]";
	}

	/**
	 * Metodo equals con el atributo cedula
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendedor other = (Vendedor) obj;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		return true;
	}

	////////////////CRUD para vendedor
		
	/**
	* Metodo para crear un vendedor
	* @param nuevoVendedor
	* @return
	* @throws ContactoException 
	*/
	public Vendedor crearContacto(String nombre, String apellido, String cedula, String direccion, Usuario usuario) throws ContactoException {
		Vendedor contacto = new Vendedor();
		contacto.setNombre(nombre);;
		contacto.setApellido(apellido);
		contacto.setCedula(cedula);
		contacto.setUsuario(usuario);
		contacto.setDireccion(direccion);
	
		if(verificarContacto(cedula) == true){
			throw new ContactoException("Contacto ya existe");
		}
		listaContactos.add(contacto);
		return contacto;
	}
	
	/**
	* Metodo para verificar si el vendedor ya fue creado
	* @param cedula
	* @return
	* @throws VendedorException
	*/
	private boolean verificarContacto(String cedula) throws ContactoException {
		for (Vendedor contacto : listaContactos) {
			if(contacto.getCedula().equals(cedula)){
				return true;
			}
		}
		return false;	
	}
	
	/**
	* Metodo para buscar un vendedor
	* @param cedula
	* @return
	* @throws VendedorException
	*/
	public Vendedor buscarContacto(String cedula) throws ContactoException {
		Vendedor contactoEncontrado = null;
	
		for (Vendedor contacto : listaContactos){	
			if(contacto != null && contacto.getCedula().equals(cedula)){
				contactoEncontrado =  (Vendedor) contacto;
			}
	
		}
		if(contactoEncontrado == null){
			throw new ContactoException ("Contacto no encontrado");
	
		}
		return contactoEncontrado;
	}
	
	/**
	* Metodo para actualizar un vendedor
	* @param cedula
	* @param listaUsuarios
	* @return
	* @throws ContactoException
	*/
	public String actualizarContacto(String nombre, String apellido, String cedula, String direccion, String nombreUsuario, String contrasenia) throws ContactoException{
		String mensaje = "El contacto fue actualizado";
		Vendedor contactoObtenido = buscarContacto(cedula);
	
		for (Vendedor vendedor:listaContactos){
			if(contactoObtenido.getCedula().equals(cedula)) {
				vendedor.setNombre(nombre);;
				vendedor.setApellido(apellido);
				vendedor.setCedula(cedula);
				vendedor.setDireccion(direccion);
			
				vendedor.actualizarUsuario(nombreUsuario, contrasenia);
			}
	
		}
		if(contactoObtenido == null) {
			throw new ContactoException("El contacto no ha sido creado");
		}
		return mensaje;
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
	
	/**
	* Metodo para eliminar un vendedor
	* @param cedula
	* @return
	* @throws ContactoException
	*/
	public boolean eliminarContacto(String cedula) throws ContactoException{
		Vendedor contactoObtenido = buscarContacto(cedula);
	
		for (Vendedor contacto : listaContactos) {
	
			if(contacto.getCedula().equals(cedula)){
				listaContactos.remove(contacto);
				return true; 
			}
	
		}
	
		if(contactoObtenido == null) {
			throw new ContactoException("El contacto no a sido creado");
		}
		return false;
	}

	////// CRUD para crear los productos de los vendedores

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

	////////CRUD Mensaje

	public Mensaje crearMensaje(String mensaje, String codigo, String hora, String autor) throws MensajeException {
		Mensaje mensaje1 = new Mensaje();
		mensaje1.setAutor(autor);
		mensaje1.setCodigo(codigo);
		mensaje1.setHora(hora);
		mensaje1.setMensaje(mensaje);

		if(existeMensaje(codigo) == true){
			throw new MensajeException("El mensaje ya existe");
		}
		mensajes.add(mensaje1);
		return mensaje1;
	}

	private boolean existeMensaje(String codigo) {

		for (Mensaje mensaje : mensajes) {
			if(mensaje.getCodigo().equals(codigo)){
				return true;
			}
		}
		return false;
	}


	public void actualizarMensaje(String hora, String codigo, String mensaje, String autor) {

		for (Mensaje mensajeAux : mensajes) {
			if(mensajeAux.getCodigo().equals(codigo)){
				mensajeAux.setAutor(autor);
				mensajeAux.setCodigo(codigo);
				mensajeAux.setHora(hora);
				mensajeAux.setMensaje(mensaje);
			}
		}
 
	}

	public boolean eliminarMensaje(String codigo) {

		if(existeMensaje(codigo)){
			for (Mensaje mensaje : mensajes) {
				if(mensaje.getCodigo().equals(codigo)){
					mensajes.remove(mensaje);
					return true;
				}
			}
		}else{
			return false;
		}
		return false;

	}

	/////////CRUD Cometario
	public Comentario crearComentario(String mensaje, String codigo, String hora, String autor) throws ComentarioException {
		Comentario comentario = new Comentario();
		comentario.setAutor(autor);
		comentario.setCodigo(codigo);
		comentario.setHora(hora);
		comentario.setMensaje(mensaje);

		if(existeComentario(codigo) == true){
			throw new ComentarioException("El comentario ya existe");
		}
		comentarios.add(comentario);
		return comentario;
	}

	private boolean existeComentario(String codigo) {

		for (Comentario comentario : comentarios) {
			if(comentario.getCodigo().equals(codigo)){
				return true;
			}
		}
		return false;
	}


	public void actualizarComentario(String hora, String codigo, String mensaje, String autor) {

		for (Comentario comentario : comentarios) {
			if(comentario.getCodigo().equals(codigo)){
				comentario.setAutor(autor);
				comentario.setCodigo(codigo);
				comentario.setHora(hora);
				comentario.setMensaje(mensaje);
			}
		}
 
	}

	public boolean eliminarComentario(String codigo) {

		if(existeComentario(codigo)){
			for (Comentario comentario : comentarios) {
				if(comentario.getCodigo().equals(codigo)){
					mensajes.remove(comentario);
					return true;
				}
			}
		}else{
			return false;
		}
		return false;

	}
	
	public MeGusta crearLike(String autor) throws ComentarioException {
		
		MeGusta meGusta = new MeGusta();
		
		meGusta.setAutor(autor);

		if(existeLike(autor) == true){
			throw new ComentarioException("El comentario ya existe");
		}
		likes.add(meGusta);
		return meGusta;
	}

	private boolean existeLike(String autor) {

		for (MeGusta meGusta : likes) {
			if(meGusta.getAutor().equals(autor)){
				return true;
			}
		}
		return false;
	}




	public boolean eliminarLike(String autor) {

		if(existeComentario(autor)){
			for (MeGusta meGusta : likes) {
				if(meGusta.getAutor().equals(autor)){
					mensajes.remove(meGusta);
					return true;
				}
			}
		}else{
			return false;
		}
		return false;
	}

	private int obtenerCantidadLikes(){
		int cont= likes.size();
		System.out.println(cont +" likes");
		
		return cont;
	}




}
