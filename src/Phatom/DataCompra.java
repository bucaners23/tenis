package Phatom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataCompra {
	Connection cx;
	
	public DataCompra() {
		
	}
	
	public Connection conectar() {
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/celular", "root", "");
			System.out.println("CONEXION EXITOSA");
		} catch (SQLException e) {
			System.out.println("FALLO DE CONEXION");
			e.printStackTrace();
		}
		return cx;
	}
	
	public boolean insertar(Compra c) {
		PreparedStatement ps = null;
		try {
			ps = conectar().prepareStatement("INSERT INTO celulares VALUES (null,null,?,?,?)");
			ps.setString(1, c.getNombre());
			ps.setString(2, c.getCorreo());
			ps.setString(3, c.getTelefono());
			ps.setInt(4, c.getIdusu());
			ps.execute();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();

			return false;
		}
	}


}
