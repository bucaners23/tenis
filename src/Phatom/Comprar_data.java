package Phatom;

public class Comprar_data {
	int idsu;
	int idcompra;
	String nombre;
	String correo;
	String telefono;
	String precio;
	String fecha;
	Comprar dc=new Comprar();
	public Comprar_data() {
	}
	public Comprar_data(int idsu, int idcompra, String nombre, String correo, String telefono, String precio,
			String fecha) {
		super();
		this.idsu = idsu;
		this.idcompra = idcompra;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.precio = precio;
		this.fecha = fecha;
	}
	
	public boolean insertar() {
		if (dc.insertar(this)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getIdsu() {
		return idsu;
	}
	public void setIdsu(int idsu) {
		this.idsu = idsu;
	}
	public int getIdcompra() {
		return idcompra;
	}
	public void setIdcompra(int idcompra) {
		this.idcompra = idcompra;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	

}
