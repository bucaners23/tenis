package Phatom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class ticks {

	public JFrame frmTicks;
	public JLabel lblToo;
	public  JLabel lblImagenT;
	private JTextField txtNom;
	private JTextField txtCor;
	private JTextField txtTel;
	private JButton btnComprar;
	private JButton btnCancelar;
	private JLabel lblIdUsuario;
	private JLabel txtIdU;
	public ticks() {
		initialize();
	}

	private void initialize() {
		frmTicks = new JFrame();
		frmTicks.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmTicks.setBounds(100, 100, 544, 431);
		frmTicks.getContentPane().setLayout(null);
		
		lblImagenT = new JLabel("");
		lblImagenT.setIcon(new ImageIcon(ticks.class.getResource("/Phatom/Captura de pantalla (12)-fotor-bg-remover-202311149454.png")));
		lblImagenT.setBounds(114, 157, 280, 230);
		frmTicks.getContentPane().add(lblImagenT);
		
		JLabel lblNewLabel = new JLabel("Nombre :");
		lblNewLabel.setFont(new Font("Lucida Console", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 53, 108, 16);
		frmTicks.getContentPane().add(lblNewLabel);
		
		JLabel lblCorreo = new JLabel("Correo :");
		lblCorreo.setFont(new Font("Lucida Console", Font.BOLD, 15));
		lblCorreo.setBounds(10, 91, 108, 16);
		frmTicks.getContentPane().add(lblCorreo);
		
		JLabel lblTelefono = new JLabel("Telefono :");
		lblTelefono.setFont(new Font("Lucida Console", Font.BOLD, 15));
		lblTelefono.setBounds(10, 130, 108, 16);
		frmTicks.getContentPane().add(lblTelefono);
		
		txtNom = new JTextField();
		txtNom.setBounds(128, 51, 178, 20);
		frmTicks.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(128, 89, 178, 20);
		frmTicks.getContentPane().add(txtCor);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(128, 128, 182, 20);
		frmTicks.getContentPane().add(txtTel);
		
		btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Compra c= new Compra();
					c.setIdusu(Integer.parseInt(txtIdU.getText()));
					c.setNombre(txtNom.getText());
					c.setCorreo(txtCor.getText());
					c.setTelefono(txtTel.getText());
					if (c.insertar()) {
						JOptionPane.showMessageDialog(null, "Ok");
					} else {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		btnComprar.setBounds(336, 44, 108, 34);
		frmTicks.getContentPane().add(btnComprar);
		
		btnCancelar = new JButton("Cancelar ");
		btnCancelar.setBounds(336, 121, 108, 34);
		frmTicks.getContentPane().add(btnCancelar);
		
		lblIdUsuario = new JLabel("Id usuario :");
		lblIdUsuario.setFont(new Font("Lucida Console", Font.BOLD, 15));
		lblIdUsuario.setBounds(10, 11, 126, 16);
		frmTicks.getContentPane().add(lblIdUsuario);
		
		txtIdU = new JLabel("id");
		txtIdU.setHorizontalAlignment(SwingConstants.CENTER);
		txtIdU.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtIdU.setFont(new Font("Lucida Console", Font.BOLD, 15));
		txtIdU.setBounds(146, 11, 70, 29);
		frmTicks.getContentPane().add(txtIdU);
	}
}
