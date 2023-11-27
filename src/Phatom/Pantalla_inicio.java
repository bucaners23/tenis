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
import java.awt.Image;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButton;

public class Pantalla_inicio {

	public JFrame frmPantallainicio;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblIma1;
	private JLabel lblTeni2;
	private JLabel lblIma2;
	private JLabel lblIma3;
	private JLabel lblTeni1;
	private JLabel lblTeni3;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JLabel lblIma4;
	private JLabel lblIma5;
	private JLabel lblIma6;
	private JLabel lblNikeLegacy;
	private JLabel lblImaggeb;
	private JLabel lblTeni1_3;
	private JLabel lblImagen12;
	private JLabel lblImagen;
	private JLabel lblNikeAirForce;
	private JLabel lblNikeCortezBalck;
	private JLabel lblImab;
	private JLabel lblMucholblxd;
	private JLabel lblNikeAirMax;
	private JLabel lblNikeJordanLegacy;
	private JButton BtnComprar;
	private JButton btnCarrito;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;

	public static void main(String[] args) {
		Pantalla_inicio x = new Pantalla_inicio();
		x.frmPantallainicio.setVisible(true);
	}

	public Pantalla_inicio() {
		initialize();
	}

	public ImageIcon cambiar(ImageIcon img, int ancho, int alto) {
		Image imgEscalada = img.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imgEscalada);
		return image;
	}

	private void initialize() {
		frmPantallainicio = new JFrame();
		frmPantallainicio.getContentPane().setBackground(new Color(255, 255, 255));
		frmPantallainicio.setIconImage(Toolkit.getDefaultToolkit().getImage(Pantalla_inicio.class
				.getResource("/Phatom/Captura de pantalla (12)-fotor-bg-remover-202311149454 (1).png")));
		frmPantallainicio.setTitle("Pantalla Inicio");
		frmPantallainicio.setBounds(100, 100, 1519, 692);
		frmPantallainicio.setLocationRelativeTo(null);
		frmPantallainicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPantallainicio.getContentPane().setLayout(null);

		lblTeni3 = new JLabel("ADIDAS FORUM MID \"OFF-WHITE\"");
		lblTeni3.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblTeni3.setBounds(616, 257, 259, 45);
		frmPantallainicio.getContentPane().add(lblTeni3);

		lblImagen = new JLabel("");
		lblImagen.setIcon(cambiar(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/AI.jpg")), 300, 300));
		lblImagen.setBounds(907, 69, 271, 179);
		frmPantallainicio.getContentPane().add(lblImagen);

		lblImagen12 = new JLabel("");
		lblImagen12.setIcon(cambiar(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/cort.jpg")), 300, 350));
		lblImagen12.setBounds(907, 353, 271, 179);
		frmPantallainicio.getContentPane().add(lblImagen12);

		lblNikeAirForce = new JLabel("NIKE AIR FORCE MID WHITE");
		lblNikeAirForce.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNikeAirForce.setBounds(907, 260, 259, 38);
		frmPantallainicio.getContentPane().add(lblNikeAirForce);

		lblNikeCortezBalck = new JLabel("NIKE CORTEZ BALCK AND WHITE 90}");
		lblNikeCortezBalck.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNikeCortezBalck.setBounds(885, 532, 259, 58);
		frmPantallainicio.getContentPane().add(lblNikeCortezBalck);

		lblImab = new JLabel("");
		lblImab.setIcon(cambiar(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/9.jpg")), 300, 300));
		lblImab.setBounds(1159, 69, 271, 179);
		frmPantallainicio.getContentPane().add(lblImab);

		lblMucholblxd = new JLabel("");
		lblMucholblxd.setIcon(cambiar(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/lega.jpg")), 270, 270));
		lblMucholblxd.setBounds(1201, 365, 271, 179);
		frmPantallainicio.getContentPane().add(lblMucholblxd);

		lblNikeAirMax = new JLabel("NIKE AIR MAX 95 BLACK RAPTOR");
		lblNikeAirMax.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNikeAirMax.setBounds(1188, 260, 259, 38);
		frmPantallainicio.getContentPane().add(lblNikeAirMax);

		lblNikeJordanLegacy = new JLabel("NIKE JORDAN LEGACY 312 CHICAGO");
		lblNikeJordanLegacy.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNikeJordanLegacy.setBounds(1192, 529, 259, 58);
		frmPantallainicio.getContentPane().add(lblNikeJordanLegacy);

		lblTeni1 = new JLabel("JORDAN 1 \"RED TOE\"");
		lblTeni1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblTeni1.setBounds(67, 253, 259, 52);
		frmPantallainicio.getContentPane().add(lblTeni1);

		lblTeni2 = new JLabel("JORDAN 4 \"BLACK CANVAS\"");
		lblTeni2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblTeni2.setBounds(336, 257, 259, 45);
		frmPantallainicio.getContentPane().add(lblTeni2);

		lblNewLabel_4 = new JLabel("S N E A K E R S   P H A T O M");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Swis721 BdOul BT", Font.BOLD, 30));
		lblNewLabel_4.setBounds(531, 0, 471, 52);
		frmPantallainicio.getContentPane().add(lblNewLabel_4);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Pantalla_inicio.class
				.getResource("/Phatom/Captura de pantalla (12)-fotor-bg-remover-202311149454 (1).png")));
		lblNewLabel_1.setBounds(21, 0, 87, 58);
		frmPantallainicio.getContentPane().add(lblNewLabel_1);

		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(0, 0, 1503, 58);
		frmPantallainicio.getContentPane().add(lblNewLabel);


		lblIma1 = new JLabel("");
		lblIma1.setIcon(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/Jordan1.jpg")));
		lblIma1.setBounds(46, 74, 259, 166);
		frmPantallainicio.getContentPane().add(lblIma1);

		lblIma2 = new JLabel("");
		lblIma2.setIcon(cambiar(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/Jordan4.jpg")), 250, 190));
		lblIma2.setBounds(315, 69, 280, 171);
		frmPantallainicio.getContentPane().add(lblIma2);

		lblIma3 = new JLabel("");
		lblIma3.setIcon(cambiar(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/blea.jpg")), 310, 320));
		lblIma3.setBounds(605, 69, 271, 179);
		frmPantallainicio.getContentPane().add(lblIma3);

		lblIma4 = new JLabel("");
		lblIma4.setIcon(cambiar(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/leg.jpg")), 270, 270));
		lblIma4.setBounds(42, 353, 259, 166);
		frmPantallainicio.getContentPane().add(lblIma4);

		lblIma5 = new JLabel("");
		lblIma5.setIcon(cambiar(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/90.jpg")), 300, 320));
		lblIma5.setBounds(326, 353, 259, 166);
		frmPantallainicio.getContentPane().add(lblIma5);

		lblIma6 = new JLabel("");
		lblIma6.setIcon(cambiar(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/for.jpg")), 250, 230));
		lblIma6.setBounds(606, 353, 259, 166);
		frmPantallainicio.getContentPane().add(lblIma6);

		lblNikeLegacy = new JLabel("NIKE LEGACY 312 LOW");
		lblNikeLegacy.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNikeLegacy.setBounds(57, 535, 259, 52);
		frmPantallainicio.getContentPane().add(lblNikeLegacy);

		lblImaggeb = new JLabel("NIKE AIR MAX 90");
		lblImaggeb.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblImaggeb.setBounds(336, 530, 259, 52);
		frmPantallainicio.getContentPane().add(lblImaggeb);

		lblTeni1_3 = new JLabel("ADIDAS FORUM BLUE 88");
		lblTeni1_3.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblTeni1_3.setBounds(616, 535, 259, 52);
		frmPantallainicio.getContentPane().add(lblTeni1_3);
		
		BtnComprar = new JButton("Comprar");
		BtnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BtnComprar.setBounds(43, 313, 99, 23);
		frmPantallainicio.getContentPane().add(BtnComprar);
		
		btnCarrito = new JButton("Carrito");
		btnCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCarrito.setBounds(152, 316, 99, 23);
		frmPantallainicio.getContentPane().add(btnCarrito);
		
		btnNewButton_2 = new JButton("Comprar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(346, 313, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Comprar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(616, 313, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Comprar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(907, 309, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Comprar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(1188, 309, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("Carrito");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(452, 313, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("Carrito");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setBounds(725, 313, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("Carrito");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setBounds(1014, 309, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("Carrito");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setBounds(1297, 309, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("Comprar");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setBounds(46, 585, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("Comprar");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_11.setBounds(331, 585, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("Comprar");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12.setBounds(616, 585, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("Comprar");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_13.setBounds(895, 585, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("Comprar");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_14.setBounds(1202, 585, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("Carrito");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_15.setBounds(1314, 585, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("Carrito");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_16.setBounds(1004, 585, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_16);
		
		btnNewButton_17 = new JButton("Carrito");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_17.setBounds(725, 585, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_17);
		
		btnNewButton_18 = new JButton("Carrito");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_18.setBounds(440, 585, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_18);
		
		btnNewButton_19 = new JButton("Carrito");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_19.setBounds(152, 585, 99, 23);
		frmPantallainicio.getContentPane().add(btnNewButton_19);
		

		menuBar = new JMenuBar();
		frmPantallainicio.setJMenuBar(menuBar);

		mnNewMenu = new JMenu("Sistema");
		menuBar.add(mnNewMenu);

		mnNewMenu_1 = new JMenu("Compras");
		menuBar.add(mnNewMenu_1);

		mnNewMenu_2 = new JMenu("Registro");
		menuBar.add(mnNewMenu_2);

		mnNewMenu_3 = new JMenu("Usuario");
		menuBar.add(mnNewMenu_3);

	}
}
