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

import org.json.simple.parser.ParseException;

import Modelo.ConexionMasivaURL;
import Modelo.Forecast;

import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	public JPanel contentPane;
	
	public JPanel panelmapa;
	
	public JLabel iconoalbacete;
	public JLabel iconociudadreal;
	public JLabel iconomadrid;
	public JLabel iconomurcia;
	public JLabel iconobadajoz;
	public JLabel iconobarcelona;
	public JLabel iconobilbao;
	public JLabel iconohuelva;
	public JLabel iconoourense;
	public JLabel iconopalencia;

	public JButton botonalbacete;
	public JButton botonciudadreal;
	public JButton botonmadrid;
	public JButton botonmurcia;
	public JButton botonbadajoz;
	public JButton botonbarcelona;
	public JButton botonbilbao;
	public JButton botonhuelva;
	public JButton botonourense;
	public JButton botonpalencia;

	public JPanel paneldia;

	public JLabel grados;
	public JLabel nombre;
	public JLabel iconotiempo;
	public JLabel gradosMm;
	public JLabel gradoF;

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
	 * 
	 * 
	 *
	 */
	public Interfaz()  {
		setTitle("EFAWEATHER");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		ConexionMasivaURL cmurl = new ConexionMasivaURL();
		String[] nombresC = cmurl.devolverNombresCiudades();
		ArrayList<Forecast> datosCiudades = null;
		try {
			datosCiudades = cmurl.fileToObject(nombresC);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Panel mapa
		JPanel panelmapa = new JPanel();
		panelmapa.setBounds(0, 0, 791, 571);
		contentPane.add(panelmapa);
		panelmapa.setLayout(null);

		// Botones mapa
		JButton botonalbacete = new JButton("Albacete");
		botonalbacete.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonalbacete.setBounds(444, 294, 83, 43);
		botonalbacete.setIconTextGap(0);
		botonalbacete.setBorderPainted(false);
		botonalbacete.setBorder(null);
		botonalbacete.setFocusPainted(false);
		botonalbacete.setContentAreaFilled(false);
		panelmapa.add(botonalbacete);

		JButton botonciudadreal = new JButton("C.Real");
		botonciudadreal.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonciudadreal.setBounds(350, 294, 83, 43);
		botonciudadreal.setIconTextGap(0);
		botonciudadreal.setBorderPainted(false);
		botonciudadreal.setBorder(null);
		botonciudadreal.setFocusPainted(false);
		botonciudadreal.setContentAreaFilled(false);
		panelmapa.add(botonciudadreal);

		JButton botonmadrid = new JButton("Madrid");
		botonmadrid.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonmadrid.setBounds(350, 203, 89, 43);
		botonmadrid.setIconTextGap(0);
		botonmadrid.setBorderPainted(false);
		botonmadrid.setBorder(null);
		botonmadrid.setFocusPainted(false);
		botonmadrid.setContentAreaFilled(false);
		panelmapa.add(botonmadrid);

		JButton botonmurcia = new JButton("Murcia");
		botonmurcia.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonmurcia.setBounds(466, 365, 83, 43);
		botonmurcia.setIconTextGap(0);
		botonmurcia.setBorderPainted(false);
		botonmurcia.setBorder(null);
		botonmurcia.setFocusPainted(false);
		botonmurcia.setContentAreaFilled(false);
		panelmapa.add(botonmurcia);

		JButton botonbadajoz = new JButton("Badajoz");
		botonbadajoz.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonbadajoz.setBounds(194, 304, 83, 43);
		botonbadajoz.setIconTextGap(0);
		botonbadajoz.setBorderPainted(false);
		botonbadajoz.setBorder(null);
		botonbadajoz.setFocusPainted(false);
		botonbadajoz.setContentAreaFilled(false);
		panelmapa.add(botonbadajoz);

		JButton botonbarcelona = new JButton("Barcelona");
		botonbarcelona.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonbarcelona.setBounds(643, 132, 83, 43);
		botonbarcelona.setIconTextGap(0);
		botonbarcelona.setBorderPainted(false);
		botonbarcelona.setBorder(null);
		botonbarcelona.setFocusPainted(false);
		botonbarcelona.setContentAreaFilled(false);
		panelmapa.add(botonbarcelona);

		JButton botonbilbao = new JButton("Bilbao");
		botonbilbao.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonbilbao.setBounds(381, 11, 83, 43);
		botonbilbao.setIconTextGap(0);
		botonbilbao.setBorderPainted(false);
		botonbilbao.setBorder(null);
		botonbilbao.setFocusPainted(false);
		botonbilbao.setContentAreaFilled(false);
		panelmapa.add(botonbilbao);

		JButton botonhuelva = new JButton("Huelva");
		botonhuelva.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonhuelva.setBounds(194, 403, 83, 43);
		botonhuelva.setIconTextGap(0);
		botonhuelva.setBorderPainted(false);
		botonhuelva.setBorder(null);
		botonhuelva.setFocusPainted(false);
		botonhuelva.setContentAreaFilled(false);
		panelmapa.add(botonhuelva);

		JButton botonourense = new JButton("Ourense");
		botonourense.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonourense.setBounds(149, 75, 83, 43);
		botonourense.setIconTextGap(0);
		botonourense.setBorderPainted(false);
		botonourense.setBorder(null);
		botonourense.setFocusPainted(false);
		botonourense.setContentAreaFilled(false);
		panelmapa.add(botonourense);

		JButton botonpalencia = new JButton("Palencia");
		botonpalencia.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonpalencia.setBounds(342, 92, 83, 43);
		botonpalencia.setIconTextGap(0);
		botonpalencia.setBorderPainted(false);
		botonpalencia.setBorder(null);
		botonpalencia.setFocusPainted(false);
		botonpalencia.setContentAreaFilled(false);
		panelmapa.add(botonpalencia);

		// Iconos mapa
		String ruta="C:\\EFA\\2DAM\\JAVA\\Desarrollo_Interfaces\\GITTRABAJAR\\imagenes\\lluviafoto.png";
		
		JLabel iconoalbacete = new JLabel("");
		ImageIcon row_albacete = new ImageIcon(ruta);
		Image get_albacete = row_albacete .getImage();
		Image scaled_albacete = get_albacete .getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
		ImageIcon finalalbacete = new ImageIcon(scaled_albacete);
		iconoalbacete.setIcon(finalalbacete);
		iconoalbacete.setBounds(425, 304, 25, 25);
		panelmapa.add(iconoalbacete);
		
		JLabel iconociudadreal = new JLabel("");
		ImageIcon row_ciudadreal = new ImageIcon(ruta);
		Image get_ciudadreal = row_ciudadreal.getImage();
		Image scaled_ciudadreal = get_ciudadreal.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
		ImageIcon finalciudadreal = new ImageIcon(scaled_ciudadreal);
		iconociudadreal.setIcon(finalciudadreal);
		iconociudadreal.setBounds(340, 304, 25, 25);
		panelmapa.add(iconociudadreal);
		
		JLabel iconomadrid = new JLabel("");
		ImageIcon row_madrid = new ImageIcon(ruta);
		Image get_madrid = row_madrid.getImage();
		Image scaled_madrid = get_madrid.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
		ImageIcon finalmadrid = new ImageIcon(scaled_madrid);
		iconomadrid.setIcon(finalmadrid);
		iconomadrid.setBounds(341, 211, 25, 25);
		panelmapa.add(iconomadrid);

		JLabel iconomurcia = new JLabel("");
		ImageIcon row_murcia = new ImageIcon(ruta);
		Image get_murcia = row_murcia.getImage();
		Image scaled_murcia = get_murcia.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
		ImageIcon finalmurcia = new ImageIcon(scaled_murcia);
		iconomurcia.setIcon(finalmurcia);
		iconomurcia.setBounds(456, 374, 25, 25);
		panelmapa.add(iconomurcia);
		
		JLabel iconobadajoz = new JLabel("");
		ImageIcon row_badajoz = new ImageIcon(ruta);
		Image get_badajoz = row_badajoz.getImage();
		Image scaled_badajoz = get_badajoz.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
		ImageIcon finalbadajoz = new ImageIcon(scaled_badajoz);
		iconobadajoz.setIcon(finalbadajoz);
		iconobadajoz.setBounds(178, 314, 25, 25);
		panelmapa.add(iconobadajoz);
		
		JLabel iconobarcelona = new JLabel("");
		ImageIcon row_barcelona = new ImageIcon(ruta);
		Image get_barcelona = row_barcelona.getImage();
		Image scaled_barcelona = get_barcelona.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
		ImageIcon finalbarcelona = new ImageIcon(scaled_barcelona);
		iconobarcelona.setIcon(finalbarcelona);
		iconobarcelona.setBounds(618, 142, 25, 25);
		panelmapa.add(iconobarcelona);
		
		JLabel iconobilbao = new JLabel("");
		ImageIcon row_bilbao = new ImageIcon(ruta);
		Image get_bilbao= row_bilbao.getImage();
		Image scaled_bilbao= get_bilbao.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
		ImageIcon finalbilbao = new ImageIcon(scaled_bilbao);
		iconobilbao.setIcon(finalbilbao);
		iconobilbao.setBounds(371, 21, 25, 25);
		panelmapa.add(iconobilbao);
		
		JLabel iconohuelva = new JLabel("");
		ImageIcon row_huelva= new ImageIcon(ruta);
		Image get_huelva= row_huelva.getImage();
		Image scaled_huelva= get_huelva.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
		ImageIcon finalhuelva = new ImageIcon(scaled_huelva);
		iconohuelva.setIcon(finalhuelva);
		iconohuelva.setBounds(180, 412, 25, 25);
		panelmapa.add(iconohuelva);
		
		JLabel iconoourense = new JLabel("");
		ImageIcon row_ourense= new ImageIcon(ruta);
		Image get_ourense= row_ourense.getImage();
		Image scaled_ourense= get_ourense.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
		ImageIcon finalourense = new ImageIcon(scaled_ourense);
		iconoourense.setIcon(finalourense);
		iconoourense.setBounds(131, 83, 25, 25);
		panelmapa.add(iconoourense);
		
		JLabel iconopalencia = new JLabel("");
		ImageIcon row_palencia= new ImageIcon(ruta);
		Image get_palencia= row_palencia.getImage();
		Image scaled_palencia= get_palencia.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
		ImageIcon finalpalencia = new ImageIcon(scaled_palencia);
		iconopalencia.setIcon(finalpalencia);
		iconopalencia.setBounds(324, 102, 25, 25);
		panelmapa.add(iconopalencia);

		JLabel fotomapa = new JLabel("");
		fotomapa.setIcon(new ImageIcon("C:\\Users\\rubel\\git\\repo_local_weather\\ProyectoWeather_GR\\imagenes\\mapa.jpg"));
		fotomapa.setBounds(0, 0, 791, 564);
		panelmapa.add(fotomapa);

		// Panel que muestra los datos del día
		JPanel paneldia = new JPanel();
		paneldia.setBackground(Color.WHITE);
		paneldia.setBounds(790, 0, 314, 322);
		contentPane.add(paneldia);
		paneldia.setLayout(null);

		JLabel lblMaxminC = new JLabel("Max/Min \u00BAC");
		lblMaxminC.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblMaxminC.setBounds(10, 241, 129, 40);
		paneldia.add(lblMaxminC);

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

		// Panel de las previsiones del tiempo
		JPanel panelprevisiones = new JPanel();
		panelprevisiones.setBackground(Color.WHITE);
		panelprevisiones.setBounds(790, 327, 306, 235);
		contentPane.add(panelprevisiones);
		panelprevisiones.setLayout(null);

		JLabel lblprevision = new JLabel("Prevision para 4 d\u00EDas");
		lblprevision.setBackground(new Color(30, 144, 255));
		lblprevision.setBounds(0, 11, 296, 46);
		panelprevisiones.add(lblprevision);
		lblprevision.setHorizontalAlignment(SwingConstants.CENTER);
		lblprevision.setFont(new Font("Bahnschrift", Font.PLAIN, 29));
		
		JLabel lbldia1 = new JLabel("Hoy");
		lbldia1.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lbldia1.setBounds(10, 62, 72, 40);
		panelprevisiones.add(lbldia1);
		
		JLabel lbldia2 = new JLabel("Ma\u00F1ana");
		lbldia2.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lbldia2.setBounds(10, 106, 86, 40);
		panelprevisiones.add(lbldia2);
		
		JLabel lbldia3 = new JLabel("Mie.");
		lbldia3.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lbldia3.setBounds(10, 149, 56, 40);
		panelprevisiones.add(lbldia3);
		
		JLabel lbldia4 = new JLabel("Jue.");
		lbldia4.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lbldia4.setBounds(10, 193, 72, 40);
		panelprevisiones.add(lbldia4);
		
		JLabel tiempodia1 = new JLabel("Lluvia");
		tiempodia1.setHorizontalAlignment(SwingConstants.TRAILING);
		tiempodia1.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		tiempodia1.setBounds(10, 62, 286, 40);
		panelprevisiones.add(tiempodia1);
		
		JLabel tiempodia2 = new JLabel("Soleado");
		tiempodia2.setHorizontalAlignment(SwingConstants.TRAILING);
		tiempodia2.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		tiempodia2.setBounds(20, 106, 276, 40);
		panelprevisiones.add(tiempodia2);
		
		JLabel tiempodia3 = new JLabel("Nuboso");
		tiempodia3.setHorizontalAlignment(SwingConstants.TRAILING);
		tiempodia3.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		tiempodia3.setBounds(10, 147, 286, 40);
		panelprevisiones.add(tiempodia3);
		
		JLabel tiempodia4 = new JLabel("Cubierto");
		tiempodia4.setHorizontalAlignment(SwingConstants.TRAILING);
		tiempodia4.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		tiempodia4.setBounds(10, 193, 286, 40);
		panelprevisiones.add(tiempodia4);
		
		JButton botondia1 = new JButton("");
		botondia1.setBounds(0, 61, 306, 36);
		panelprevisiones.add(botondia1);
		
		JButton botondia2 = new JButton("");
		botondia2.setBounds(0, 103, 306, 36);
		panelprevisiones.add(botondia2);
		
		JButton botondia3 = new JButton("");
		botondia3.setBounds(0, 145, 306, 36);
		panelprevisiones.add(botondia3);
		
		JButton botondia4 = new JButton("");
		botondia4.setBounds(0, 188, 306, 36);
		panelprevisiones.add(botondia4);

	}
}
