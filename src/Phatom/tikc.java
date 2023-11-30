package Phatom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class tikc {

	public JFrame frmTick;
	private JTextField txtNom;
	private JTextField txtCor;
	private JTextField txtTel;
	private JButton btnFin;
	private JButton btnRechazar;
	private JLabel lblNewLabel_1;
	private JLabel txtIdusu;


	public tikc() {
		initialize();
	}

	
	private void initialize() {
		frmTick = new JFrame();
		frmTick.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmTick.setIconImage(Toolkit.getDefaultToolkit().getImage(tikc.class.getResource("/Phatom/peso.png")));
		frmTick.setTitle("Tick");
		frmTick.setBounds(100, 100, 567, 487);
		frmTick.setLocationRelativeTo(null);
		frmTick.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre :");
		lblNewLabel.setFont(new Font("Lucida Console", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 97, 101, 24);
		frmTick.getContentPane().add(lblNewLabel);
		
		JLabel lblCorreo = new JLabel("Correo :");
		lblCorreo.setFont(new Font("Lucida Console", Font.BOLD, 15));
		lblCorreo.setBounds(10, 132, 101, 24);
		frmTick.getContentPane().add(lblCorreo);
		
		JLabel lblTelefono = new JLabel("Telefono :");
		lblTelefono.setFont(new Font("Lucida Console", Font.BOLD, 15));
		lblTelefono.setBounds(10, 167, 101, 24);
		frmTick.getContentPane().add(lblTelefono);
		
		txtNom = new JTextField();
		txtNom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtNom.getText().length()>=100) {
					e.consume();
				}
			}
		});
		txtNom.setBounds(137, 99, 154, 20);
		frmTick.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(137, 134, 154, 20);
		frmTick.getContentPane().add(txtCor);
		
		txtTel = new JTextField();
		txtTel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtTel.getText().length()>=10) {
					e.consume();
				}
			}
		});
		txtTel.setColumns(10);
		txtTel.setBounds(137, 169, 154, 20);
		frmTick.getContentPane().add(txtTel);
		
		btnFin = new JButton("Finalizar Compra");
		btnFin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Comprar_data x=new Comprar_data();
					x.setNombre(txtNom.getText());
					x.setCorreo(txtCor.getText());
					x.setTelefono(txtTel.getText());
					if(x.insertar()) {
						JOptionPane.showMessageDialog(null,"Se inserto correctamente");
					}else {
						JOptionPane.showMessageDialog(null, "ERROR 404 ;(");
					}
				}catch(Exception e2){
					JOptionPane.showMessageDialog(null,"ERROR 404" );
				}
			}
		});
		btnFin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnFin.setBounds(46, 377, 210, 34);
		frmTick.getContentPane().add(btnFin);
		
		btnRechazar = new JButton("Rechazar Compra");
		btnRechazar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRechazar.setBounds(277, 377, 210, 34);
		frmTick.getContentPane().add(btnRechazar);
		
		JLabel lblIma1 = new JLabel("");
		lblIma1.setIcon(new ImageIcon(tikc.class.getResource("/Phatom/Jordan1.jpg")));
		lblIma1.setBounds(302, 25, 239, 166);
		frmTick.getContentPane().add(lblIma1);
		
		lblNewLabel_1 = new JLabel("Nombre :");
		lblNewLabel_1.setFont(new Font("Lucida Console", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 63, 101, 24);
		frmTick.getContentPane().add(lblNewLabel_1);
		
		txtIdusu = new JLabel("I D");
		txtIdusu.setHorizontalAlignment(SwingConstants.CENTER);
		txtIdusu.setFont(new Font("Lucida Console", Font.BOLD, 15));
		txtIdusu.setBounds(136, 63, 101, 24);
		frmTick.getContentPane().add(txtIdusu);
	}
}
