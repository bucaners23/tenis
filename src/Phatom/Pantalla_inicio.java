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

public class Pantalla_inicio {

	public JFrame frmPantallainicio;
	private JLabel lblNike;
	private JComboBox cmbMara;
	private JLabel lblAdidas;
	private JComboBox cmbColor;
	private JLabel lblAdidas_1;
	private JComboBox<?> cmbModelo;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblIma1;
	private JLabel lblNewLabel_7_1_1_2;
	private JLabel lblIma2;
	private JLabel lblIma3;



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
		frmPantallainicio.setIconImage(Toolkit.getDefaultToolkit().getImage(Pantalla_inicio.class.getResource("/Phatom/Captura de pantalla (12)-fotor-bg-remover-202311149454 (1).png")));
		frmPantallainicio.setTitle("Pantalla Inicio");
		frmPantallainicio.setBounds(100, 100, 924, 561);
		frmPantallainicio.setLocationRelativeTo(null);
		frmPantallainicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPantallainicio.getContentPane().setLayout(null);

		JLabel lblNewLabel_7_1_1 = new JLabel("ADIDAS FORUM MID \"OFF-WHITE\"");
		lblNewLabel_7_1_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_7_1_1.setBounds(611, 335, 259, 116);
		frmPantallainicio.getContentPane().add(lblNewLabel_7_1_1);

		JLabel lblNewLabel_7_1_1_1 = new JLabel("JORDAN 1 \"RED TOE\"");
		lblNewLabel_7_1_1_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_7_1_1_1.setBounds(21, 335, 259, 116);
		frmPantallainicio.getContentPane().add(lblNewLabel_7_1_1_1);

		lblNewLabel_7_1_1_2 = new JLabel("JORDAN 4 \"BLACK CANVAS\"");
		lblNewLabel_7_1_1_2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_7_1_1_2.setBounds(300, 335, 259, 116);
		frmPantallainicio.getContentPane().add(lblNewLabel_7_1_1_2);

		lblNike = new JLabel("xx");
		lblNike.setBounds(831, 110, 110, 52);
		frmPantallainicio.getContentPane().add(lblNike);

		cmbMara = new JComboBox();
		cmbMara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int op = cmbMara.getSelectedIndex();

				if (op == 0) {
					cmbModelo.setModel(new DefaultComboBoxModel(new String[] { "Air force", "Air max 90", "Air mag",
							"Legacy", "Nike cortez", "Nike Bleazer", "Air msx 95" }));
					
					

				}
				if (op == 1) {
					cmbModelo.setModel(new DefaultComboBoxModel(new String[] { "Forum", "Concha", "Adi2000", "Yeazzy",

							"Superstar", "Adidas NMD", "Adidas Falco", "ZX 2K BOOST" }));

				}
				if (op == 2) {
					cmbModelo.setModel(new DefaultComboBoxModel(new String[] { "Jordan 1", "Jordan 3", "Jordan 10",
							"Jordan 11", "Jordan 12", "Jordan 1 Travis Scott" }));

				}
			}
		});
		cmbMara.setModel(new DefaultComboBoxModel(new String[] { "Nike", "Adidas", "Jordan", "New Balance" }));
		cmbMara.setBounds(75, 154, 157, 22);
		frmPantallainicio.getContentPane().add(cmbMara);

		lblAdidas = new JLabel("");
		lblAdidas.setIcon(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/adidas.png")));
		lblAdidas.setBounds(427, 85, 110, 52);
		frmPantallainicio.getContentPane().add(lblAdidas);

		cmbColor = new JComboBox();
		cmbColor.setBounds(641, 162, 157, 22);
		frmPantallainicio.getContentPane().add(cmbColor);

		lblAdidas_1 = new JLabel("");
		lblAdidas_1.setIcon(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/jumpand.png")));
		lblAdidas_1.setBounds(238, 69, 110, 70);
		frmPantallainicio.getContentPane().add(lblAdidas_1);

		cmbModelo = new JComboBox();
		cmbModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int z = cmbModelo.getSelectedIndex();
				if (z == 0) {
					lblIma1.setIcon(cambiar(new ImageIcon(getClass().getResource("/Phatom/AA1.jpg")), 290, 350));
					lblIma2.setIcon(cambiar(new ImageIcon(getClass().getResource("/Phatom/AIR1.jpg")), 290, 320));
					lblIma3.setIcon(cambiar(new ImageIcon(getClass().getResource("/Phatom/AI.jpg")), 290, 310));
				}
				if (z == 1) {
					lblIma1.setIcon(cambiar(new ImageIcon(getClass().getResource("/Phatom/A90.jpg")), 290, 210));
					lblIma2.setIcon(cambiar(new ImageIcon(getClass().getResource("/Phatom/a901.jpg")), 290, 210));
					lblIma3.setIcon(cambiar(new ImageIcon(getClass().getResource("/Phatom/90.jpg")), 300, 320));
				}
				if (z == 2) {
					lblIma1.setIcon(cambiar(new ImageIcon(getClass().getResource("/Phatom/A90.jpg")), 290, 350));
					lblIma2.setIcon(cambiar(new ImageIcon(getClass().getResource("/Phatom/a901.jpg")), 290, 320));
					lblIma3.setIcon(cambiar(new ImageIcon(getClass().getResource("/Phatom/90.jpg")), 290, 310));
			}
			}
		});
		cmbModelo.setBounds(368, 154, 151, 22);
		frmPantallainicio.getContentPane().add(cmbModelo);

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

		lblIma1 = new JLabel("");
		lblIma1.setIcon(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/Jordan1.jpg")));
		lblIma1.setBounds(21, 208, 259, 166);
		frmPantallainicio.getContentPane().add(lblIma1);

		lblIma2 = new JLabel("");
		lblIma2.setIcon(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/Jordan4.jpg")));
		lblIma2.setBounds(290, 208, 301, 171);
		frmPantallainicio.getContentPane().add(lblIma2);

		lblIma3 = new JLabel("");
		lblIma3.setIcon(new ImageIcon(Pantalla_inicio.class.getResource("/Phatom/Adidasf (1).jpg")));
		lblIma3.setBounds(590, 195, 280, 179);
		frmPantallainicio.getContentPane().add(lblIma3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"menu"}));
		comboBox.setBounds(21, 22, 68, 22);
		frmPantallainicio.getContentPane().add(comboBox);

	}
}
