package Phatom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;

public class Pantalla_inicio {

	public JFrame frmPantallainicio;
	private JLabel lblNike;
	private JComboBox cmbNike;
	private JLabel lblAdidas;
	private JComboBox cmbAdidas;
	private JLabel lblAdidas_1;
	private JComboBox cmbAdidas_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;

	
	public static void main(String[] args) {
		Pantalla_inicio x=new Pantalla_inicio();
		x.frmPantallainicio.setVisible(true);
	}

	
	public Pantalla_inicio() {
		initialize();
	}
	
	private void initialize() {
		frmPantallainicio = new JFrame();
		frmPantallainicio.setTitle("Pantalla Inicio");
		frmPantallainicio.setBounds(100, 100, 924, 483);
		frmPantallainicio.setLocationRelativeTo(null);
		frmPantallainicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPantallainicio.getContentPane().setLayout(null);
	
		
		lblNike = new JLabel("");
		lblNike.setIcon(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/pngwing.com (3).png")));
		lblNike.setBounds(10, 87, 110, 52);
		frmPantallainicio.getContentPane().add(lblNike);
		
		cmbNike = new JComboBox();
		cmbNike.setModel(new DefaultComboBoxModel(new String[] {"Air max", "Air force", "Air mag", "Nike dunke"}));
		cmbNike.setBounds(10, 150, 110, 22);
		frmPantallainicio.getContentPane().add(cmbNike);
		
		lblAdidas = new JLabel("");
		lblAdidas.setIcon(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/adidas.png")));
		lblAdidas.setBounds(10, 183, 110, 52);
		frmPantallainicio.getContentPane().add(lblAdidas);
		
		cmbAdidas = new JComboBox();
		cmbAdidas.setModel(new DefaultComboBoxModel(new String[] {"Forum", "Adi2000", "Superstar", "Tensaur"}));
		cmbAdidas.setBounds(10, 246, 110, 22);
		frmPantallainicio.getContentPane().add(cmbAdidas);
		
		lblAdidas_1 = new JLabel("");
		lblAdidas_1.setIcon(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/jumpand.png")));
		lblAdidas_1.setBounds(10, 279, 110, 70);
		frmPantallainicio.getContentPane().add(lblAdidas_1);
		
		cmbAdidas_1 = new JComboBox();
		cmbAdidas_1.setModel(new DefaultComboBoxModel(new String[] {"Jordan 1", "Jordan 4", "Jordan 1 Travis", "Jordan 11"}));
		cmbAdidas_1.setBounds(10, 360, 110, 22);
		
		frmPantallainicio.getContentPane().add(cmbAdidas_1);
		
		lblNewLabel_4 = new JLabel("S N E A K E R S   P H A T O M");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Swis721 BdOul BT", Font.BOLD, 30));
		lblNewLabel_4.setBounds(228, 0, 471, 52);
		frmPantallainicio.getContentPane().add(lblNewLabel_4);
		
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/Captura de pantalla (12)-fotor-bg-remover-202311149454 (1).png")));
		lblNewLabel_1.setBounds(21, 0, 87, 58);
		frmPantallainicio.getContentPane().add(lblNewLabel_1);
		

		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(0, 0, 908, 58);
		frmPantallainicio.getContentPane().add(lblNewLabel);
		

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(Color.BLACK);
		lblNewLabel_3.setBounds(0, 0, 908, 58);
		frmPantallainicio.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("P r e c i o :");
		lblNewLabel_5.setBounds(178, 85, 87, 22);
		frmPantallainicio.getContentPane().add(lblNewLabel_5);

		
		
	}
}
