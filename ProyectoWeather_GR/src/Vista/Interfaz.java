package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setTitle("EFAWEATHER");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		JPanel panelmapa = new JPanel();
		panelmapa.setBounds(0, 0, 791, 571);
		contentPane.add(panelmapa);
		panelmapa.setLayout(null);
		
		JButton botonmadrid = new JButton("Madrid");
		botonmadrid.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonmadrid.setBounds(350, 196, 89, 43);
		botonmadrid.setIconTextGap (0);
		botonmadrid.setBorderPainted (false); 
		botonmadrid.setBorder (null);
		botonmadrid.setFocusPainted (false);
		botonmadrid.setContentAreaFilled (false);
		panelmapa.add(botonmadrid);
		
		JLabel fotomapa = new JLabel("");
		fotomapa.setBounds(0, 0, 791, 564);
		fotomapa.setIcon(new ImageIcon("C:\\EFA\\2DAM\\JAVA\\Desarrollo_Interfaces\\GITTRABAJAR\\imagenes\\mapab.jpg"));
		panelmapa.add(fotomapa);
		
		JPanel panelprevisiones = new JPanel();
		panelprevisiones.setBackground(Color.WHITE);
		panelprevisiones.setBounds(790, 327, 306, 235);
		contentPane.add(panelprevisiones);
		panelprevisiones.setLayout(null);
		
		JLabel lblprevision = new JLabel("Prevision para 4 d\u00EDas");
		lblprevision.setBackground(new Color(30, 144, 255));
		lblprevision.setBounds(0, 0, 306, 46);
		panelprevisiones.add(lblprevision);
		lblprevision.setHorizontalAlignment(SwingConstants.CENTER);
		lblprevision.setFont(new Font("Bahnschrift", Font.PLAIN, 29));
		
		JPanel paneldia = new JPanel();
		paneldia.setBackground(Color.WHITE);
		paneldia.setBounds(790, 0, 314, 322);
		contentPane.add(paneldia);
		paneldia.setLayout(null);
		
		JLabel maxmin = new JLabel("Max/Min \u00BAC");
		maxmin.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		maxmin.setBounds(10, 241, 129, 40);
		paneldia.add(maxmin);
		
		JLabel grados = new JLabel("10\u00BAC");
		grados.setFont(new Font("Bahnschrift", Font.PLAIN, 45));
		grados.setHorizontalAlignment(SwingConstants.CENTER);
		grados.setBounds(0, 175, 304, 55);
		paneldia.add(grados);
		
		
		JLabel nombre = new JLabel("Manzanares");
		nombre.setFont(new Font("Bahnschrift", Font.PLAIN, 35));
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setBounds(0, 11, 304, 40);
		paneldia.add(nombre);
		
		JLabel iconotiempo = new JLabel();
		iconotiempo.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon img = new ImageIcon("C:\\EFA\\2DAM\\JAVA\\Desarrollo_Interfaces\\GITTRABAJAR\\imagenes\\lluviafoto.png");
		Image image = img.getImage();
		Image newimg = image.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon a = new ImageIcon(newimg);
		iconotiempo.setIcon(a);
		iconotiempo.setBounds(0, 62, 304, 102);
		paneldia.add(iconotiempo);
		
		JLabel lblMaxminF = new JLabel("Max/Min \u00BAF");
		lblMaxminF.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblMaxminF.setBounds(10, 279, 129, 40);
		paneldia.add(lblMaxminF);
		
		JLabel gradosMm = new JLabel("20/14 \u00BAC");
		gradosMm.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		gradosMm.setHorizontalAlignment(SwingConstants.CENTER);
		gradosMm.setBounds(185, 241, 119, 40);
		paneldia.add(gradosMm);
		
		JLabel gradosF = new JLabel("52/46 \u00BAF");
		gradosF.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		gradosF.setHorizontalAlignment(SwingConstants.CENTER);
		gradosF.setBounds(185, 279, 119, 40);
		paneldia.add(gradosF);
	}

}


