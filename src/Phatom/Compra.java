package Phatom;

public class Compra {
	int idusu;
	int idcompra;
	String nombre;
	String correo;
	String telefono;
	String fecha;
	DataCompra dc=new DataCompra();
	public Compra() {
	}
	public boolean insertar() {
		if (dc.insertar(this)) {
			return true;
		} else {
			return false;
		}
	}
	
	public Compra(int idusu, int idcompra, String nombre, String correo, String telefono, String fecha) {
		super();
		this.idusu = idusu;
		this.idcompra = idcompra;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.fecha = fecha;
	}

	public int getIdusu() {
		return idusu;
	}
	public void setIdusu(int idusu) {
		this.idusu = idusu;
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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	

}
