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

public class Pantalla_inicio {

	public JFrame frmPantallainicio;
	private JComboBox cmbMarca;
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
	private JButton btnAtras;
	private JButton btnAdelante;
	int contador = 1;
	private JLabel lblIma4;

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
		frmPantallainicio.setIconImage(Toolkit.getDefaultToolkit().getImage(Pantalla_inicio.class
				.getResource("/Phatom/Captura de pantalla (12)-fotor-bg-remover-202311149454 (1).png")));
		frmPantallainicio.setTitle("Pantalla Inicio");
		frmPantallainicio.setBounds(100, 100, 1005, 674);
		frmPantallainicio.setLocationRelativeTo(null);
		frmPantallainicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPantallainicio.getContentPane().setLayout(null);
			lblTeni3 = new JLabel("ADIDAS FORUM MID \"OFF-WHITE\"");
		lblTeni3.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblTeni3.setBounds(656, 274, 259, 58);
		frmPantallainicio.getContentPane().add(lblTeni3);

		lblTeni1 = new JLabel("JORDAN 1 \"RED TOE\"");
		lblTeni1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblTeni1.setBounds(67, 287, 259, 52);
		frmPantallainicio.getContentPane().add(lblTeni1);

		lblTeni2 = new JLabel("JORDAN 4 \"BLACK CANVAS\"");
		lblTeni2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblTeni2.setBounds(336, 287, 259, 45);
		frmPantallainicio.getContentPane().add(lblTeni2);

		cmbMarca = new JComboBox();
		cmbMarca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int op = cmbMarca.getSelectedIndex();

				if (op == 1) {

				}

				if (op == 2) {

				}
			}
		});
		cmbMarca.setModel(new DefaultComboBoxModel(new String[] { "Nike", "Adidas", "Jordan", "New Balance" }));
		cmbMarca.setBounds(10, 70, 157, 22);
		frmPantallainicio.getContentPane().add(cmbMarca);

		lblNewLabel_4 = new JLabel("S N E A K E R S   P H A T O M");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Swis721 BdOul BT", Font.BOLD, 30));
		lblNewLabel_4.setBounds(228, 0, 471, 52);
		frmPantallainicio.getContentPane().add(lblNewLabel_4);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Pantalla_inicio.class
				.getResource("/Phatom/Captura de pantalla (12)-fotor-bg-remover-202311149454 (1).png")));
		lblNewLabel_1.setBounds(21, 0, 87, 58);
		frmPantallainicio.getContentPane().add(lblNewLabel_1);

		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(0, 0, 989, 58);
		frmPantallainicio.getContentPane().add(lblNewLabel);

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(Color.BLACK);
		lblNewLabel_3.setBounds(0, 0, 908, 58);
		frmPantallainicio.getContentPane().add(lblNewLabel_3);

		lblIma1 = new JLabel("");
		lblIma1.setIcon(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/Jordan1.jpg")));
		lblIma1.setBounds(57, 110, 259, 166);
		frmPantallainicio.getContentPane().add(lblIma1);

		lblIma2 = new JLabel("");
		lblIma2.setIcon(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/Jordan4.jpg")));
		lblIma2.setBounds(326, 95, 301, 171);
		frmPantallainicio.getContentPane().add(lblIma2);

		lblIma3 = new JLabel("");
		lblIma3.setIcon(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/Adidasf (1).jpg")));
		lblIma3.setBounds(656, 84, 280, 179);
		frmPantallainicio.getContentPane().add(lblIma3);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "menu" }));
		comboBox.setBounds(21, 22, 68, 22);
		frmPantallainicio.getContentPane().add(comboBox);

		btnAtras = new JButton("<");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnAtras) {
					if (contador > 3) {
						contador = 1;
					} else {
						contador++;
						
					}
				}
			}
		});
		btnAtras.setBounds(10, 175, 51, 23);
		frmPantallainicio.getContentPane().add(btnAtras);

		btnAdelante = new JButton(">");
		btnAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdelante.setBounds(928, 175, 51, 23);
		frmPantallainicio.getContentPane().add(btnAdelante);
		
		lblIma4 = new JLabel("");
		lblIma4.setIcon(cambiar(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/5.jpg")),360,290));
		lblIma4.setBounds(57, 353, 259, 166);
		frmPantallainicio.getContentPane().add(lblIma4);

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
