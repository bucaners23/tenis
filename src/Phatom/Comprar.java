package Phatom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Comprar {
	Connection cx;
	public Comprar() {
		
	}
	public Connection conectar() {
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyect", "root", "");
			System.out.println("CONEXION EXITOSA");
		} catch (SQLException e) {
			System.out.println("FALLO DE CONEXION");
			e.printStackTrace();
		}
		return cx;
	}
	public boolean insertar(Comprar_data u) {
		PreparedStatement ps;
		try {
			ps=conectar().prepareStatement("INSERT INTO compra VALUES(null,?,?,?,?,?)");
			ps.setInt(1, u.getIdsu());
			ps.setString(2,u.getNombre());
			ps.setString(3,u.getCorreo());
			ps.setString(4,u.getTelefono());
			ps.setString(5,u.getFecha());
			ps.execute();
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		
		return false;
		}
		
	}

}
