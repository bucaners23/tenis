package Phatom;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz {

	private JFrame frmIniciarSecion;
	private JTextField txtUsuario;
	private JPasswordField txtContraseña;
	private JButton btnEntrar;

	public static void main(String[] args) {
		Interfaz x=new Interfaz();
		x.frmIniciarSecion.setVisible(true);
	}

	public Interfaz() {
		
		initialize();
	}

	private void initialize() {
		frmIniciarSecion = new JFrame();
		frmIniciarSecion.getContentPane().setBackground(Color.WHITE);
		frmIniciarSecion.setTitle("Iniciar secion");
		frmIniciarSecion.setBounds(100, 100, 777, 344);
		frmIniciarSecion.setLocationRelativeTo(null);
		frmIniciarSecion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIniciarSecion.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Interfaz.class.getResource("/Phatom/Captura de pantalla (12)-fotor-bg-remover-202311149454.png")));
		lblNewLabel_1.setBounds(10, 7, 287, 242);
		frmIniciarSecion.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(0, 0, 352, 305);
		frmIniciarSecion.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("INICIA SESIÓN :");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(489, 21, 196, 20);
		frmIniciarSecion.getContentPane().add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(445, 80, 240, 20);
		frmIniciarSecion.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(445, 149, 240, 20);
		frmIniciarSecion.getContentPane().add(txtContraseña);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Interfaz.class.getResource("/Phatom/usuario.png")));
		lblNewLabel_3.setBounds(389, 75, 46, 37);
		frmIniciarSecion.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(Interfaz.class.getResource("/Phatom/canaddo.png")));
		lblNewLabel_3_1.setBounds(384, 138, 51, 37);
		frmIniciarSecion.getContentPane().add(lblNewLabel_3_1);
		
		btnEntrar = new JButton("ENTRAR");
		btnEntrar.setIcon(new ImageIcon(Interfaz.class.getResource("/Phatom/dor.png")));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DataUsu x=new DataUsu();
					x.setNombre(txtUsuario.getText());
					x.setContraseña(txtContraseña.getText());
					if(x.login()) {
						ProgesBar b=new ProgesBar();
						frmIniciarSecion.setVisible(false);
						b.frmBarraDeProgreso.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null,"INCORRECTO\nContraseña y/o Usuario incorrecto(s)","E R R O R",JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Correo o contra incorrecta");

				}
			}
		});
		btnEntrar.setBounds(490, 205, 125, 57);
		frmIniciarSecion.getContentPane().add(btnEntrar);
	}
}
