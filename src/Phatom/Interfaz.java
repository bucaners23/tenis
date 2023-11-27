package Phatom;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;

public class Interfaz {

	private JFrame frmIniciarSecion;
	private JTextField txtUsuario;
	private JButton btnEntrar;
	private JPasswordField txtContraseña;

	public static void main(String[] args) {
		Interfaz x=new Interfaz();
		x.frmIniciarSecion.setVisible(true);
	}

	public Interfaz() {
		
		initialize();
	}
	

	private void initialize() {
		frmIniciarSecion = new JFrame();
		frmIniciarSecion.setUndecorated(true);
		frmIniciarSecion.getContentPane().setBackground(Color.WHITE);
		frmIniciarSecion.setTitle("Iniciar secion");
		frmIniciarSecion.setBounds(100, 100, 871, 406);
		frmIniciarSecion.setLocationRelativeTo(null);
		frmIniciarSecion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIniciarSecion.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Interfaz.class.getResource("/Phatom/Captura de pantalla (12)-fotor-bg-remover-202311149454.png")));
		lblNewLabel_1.setBounds(0, 132, 359, 242);
		frmIniciarSecion.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("BIENVENIDO   ");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Lithos Pro Regular", Font.BOLD, 30));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(0, 58, 369, 64);
		frmIniciarSecion.getContentPane().add(lblNewLabel_2_1);

		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(0, 0, 359, 406);
		frmIniciarSecion.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("INICIAR SESIÓN :");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Leelawadee", Font.BOLD, 23));
		lblNewLabel_2.setBounds(532, 29, 196, 20);
		frmIniciarSecion.getContentPane().add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtUsuario.setBounds(529, 130, 240, 20);
		frmIniciarSecion.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		btnEntrar = new JButton("");
		btnEntrar.setBackground(Color.WHITE);
		btnEntrar.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		btnEntrar.setIcon(new ImageIcon(Interfaz.class.getResource("/Phatom/entrar (1).png")));
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
		btnEntrar.setBounds(542, 277, 111, 76);
		frmIniciarSecion.getContentPane().add(btnEntrar);
		
		txtContraseña = new JPasswordField();
		txtContraseña.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtContraseña.setBounds(529, 206, 240, 20);
		frmIniciarSecion.getContentPane().add(txtContraseña);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Interfaz.class.getResource("/Phatom/va (1).jpg")));
		lblNewLabel_3.setBounds(463, 116, 56, 45);
		frmIniciarSecion.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setIcon(new ImageIcon(Interfaz.class.getResource("/Phatom/png-clipart-computer-icons-font-awesome-password-user-font-others-typeface-computer-icons (3).jpg")));
		lblNewLabel_3_1.setBounds(463, 187, 56, 45);
		frmIniciarSecion.getContentPane().add(lblNewLabel_3_1);
		}
}
