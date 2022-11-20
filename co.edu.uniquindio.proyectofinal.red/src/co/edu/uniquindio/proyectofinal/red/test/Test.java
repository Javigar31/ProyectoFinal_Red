package co.edu.uniquindio.proyectofinal.red.test;


import co.edu.uniquindio.proyectofinal.red.exceptions.AdministradorException;
import co.edu.uniquindio.proyectofinal.red.exceptions.ProductoException;
import co.edu.uniquindio.proyectofinal.red.exceptions.VendedorException;
import co.edu.uniquindio.proyectofinal.red.model.Administrador;
import co.edu.uniquindio.proyectofinal.red.model.Estado;
import co.edu.uniquindio.proyectofinal.red.model.Producto;
import co.edu.uniquindio.proyectofinal.red.model.Red;
import co.edu.uniquindio.proyectofinal.red.model.Vendedor;
import junit.framework.TestCase;

public class Test extends TestCase{
	
	/**
	 * Declaraciones de nuevos vendedores, administradores y productos apra hacer las pruebas
	 */
	private Red red = new Red("Red de vendedores");
	
	Vendedor vendedor1 = new Vendedor("Julio", "Lara", "12345", "Cl 14" , null, null, null, null, null);
	Vendedor vendedor2 = new Vendedor("Julio", "Lara", "12345", "Cl 14", null, null, null, null, null);
	Vendedor vendedor3 = new Vendedor("Juan", "Galvis", "Cl 19", "12345", null, null, null, null, null);
	Administrador administrador = new Administrador("Julian", "Rivera", "1104544247", "Calle 09", null);
	Producto producto = new Producto ("Xiaomi POCO", "1213","Telefono", 1200000, Estado.PUBLICADO, null, null );
	String  mensaje =  red.crearVendedor(vendedor1);
	String  mensaje2 =  red.crearVendedor(vendedor2);
	String mensaje3 = red.crearAdministrador(administrador);
	String mensajeCrear = red.crearProducto(producto);
	
	//test para crear un vendedor
	public void testCrearVendedor() {
		assertTrue(mensaje == "El vendedor fue creado");
		assertEquals("El vendedor ya existe", mensaje2);
	}
	
	//test para actualizar vendedor
	public void testActualizarVendedor() throws VendedorException {
		String mensajeActualizar = red.actualizarVendedor("Juan", "Galvis", "12345", "CL9");
		assertEquals("El vendedor fue actualizado", mensajeActualizar);
	}
	//Test para saber si elimino un vendedor
	public void testEliminarVendedor() throws VendedorException{
		assertTrue(red.eliminarVendedor("12345") == ("El vendedor fue eliminado"));
	}
	
	//test de crear administrador
	public void testCrearAdministrador() {
		assertEquals("El administrador fue creado", mensaje3);
	}
	//Test de actualizar un administrador
	public void testActualizarAdministrador() throws AdministradorException {
		String mensajeActualizar = red.actualizarAdministrador("Cesar", "Rey", "1104544247", "Cl 09");
		assertEquals("El administrador fue actualizado", mensajeActualizar);
	}
	//test para eliminar un administrador
	public void testEliminarAdministrador() throws AdministradorException{
		assertTrue(red.eliminarAdministrador("1104544247") == ("El administrador fue eliminado"));
	}
	//test para crear un producto
	public void testCrearProducto(){
		assertTrue(mensajeCrear == "El producto fue creado");
	}
	//test para actualizar un producto
	public void testActualizarProducto() throws ProductoException {
		String mensajeActualizar = red.actualizarProducto("Xiaomi POCO", "1213", "Telefono", Estado.PUBLICADO);
		assertEquals("El producto fue actualizado", mensajeActualizar);
	}
	//test para eliminar un producto
	public void testEliminarProducto() throws ProductoException {
		assertTrue(red.eliminarProducto("1213") == ("El producto fue eliminado"));
	}
}
