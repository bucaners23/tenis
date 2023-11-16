package Phatom;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ProgesBar {

	public JFrame frmBarraDeProgreso;
	public JProgressBar BarradeProgreso;
	protected Object frmIniciarSecion;

	public static void main(String[] args) {
		ProgesBar x = new ProgesBar();
		x.frmBarraDeProgreso.setVisible(true);

	}

	public void start() {
		Thread hilo = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 100; i++) {
					BarradeProgreso.setValue(i);
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						e.printStackTrace();
					}
					if (i == 100) {
						Pantalla_inicio pa = new Pantalla_inicio();
						pa.frmPantallainicio.setVisible(true);
						frmBarraDeProgreso.setVisible(false);
					}
				}

			}

		});
		hilo.start();
	}

	public ProgesBar() {
		initialize();
		start();
	}

	private void initialize() {
		frmBarraDeProgreso = new JFrame();
		frmBarraDeProgreso.setUndecorated(true);
		frmBarraDeProgreso.setTitle("Barra de progreso");
		frmBarraDeProgreso.setBounds(100, 100, 450, 196);
		frmBarraDeProgreso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBarraDeProgreso.setLocationRelativeTo(null);
		frmBarraDeProgreso.getContentPane().setLayout(null);

		BarradeProgreso = new JProgressBar();
		BarradeProgreso.setForeground(Color.BLACK);
		BarradeProgreso.setFont(new Font("Tahoma", Font.BOLD, 20));
		BarradeProgreso.setStringPainted(true);
		BarradeProgreso.setBounds(20, 34, 409, 68);
		frmBarraDeProgreso.getContentPane().add(BarradeProgreso);
		
		JLabel lblNewLabel = new JLabel("LOADGIN...");
		lblNewLabel.setFont(new Font("Goudy Stout", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(94, 117, 273, 39);
		frmBarraDeProgreso.getContentPane().add(lblNewLabel);
	}
}
