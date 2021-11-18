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

import Controlador.Controlador;
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
	
	public ImageIcon row_albacete;

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
	public JLabel gradosF;
	
	
	public JPanel panelprevisiones;
	
	public JLabel lbldia3;
	public JLabel lbldia4;
	
	public JLabel tiempodia1;
	public JLabel tiempodia2;
	public JLabel tiempodia3;
	public JLabel tiempodia4;
	
	public JButton botondia1;
	public JButton botondia2;
	public JButton botondia3;
	public JButton botondia4;
	
	
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
        Interfaz frame = new Interfaz();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        @SuppressWarnings("unused")
        Controlador controlador=new Controlador(frame);
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
		
		//Panel mapa
		panelmapa = new JPanel();
		panelmapa.setBounds(0, 0, 791, 571);
		contentPane.add(panelmapa);
		panelmapa.setLayout(null);

		// Botones mapa
		botonalbacete = new JButton("Albacete");
		botonalbacete.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonalbacete.setBounds(444, 294, 83, 43);
		botonalbacete.setIconTextGap(0);
		botonalbacete.setBorderPainted(false);
		botonalbacete.setBorder(null);
		botonalbacete.setFocusPainted(false);
		botonalbacete.setContentAreaFilled(false);
		panelmapa.add(botonalbacete);

		botonciudadreal = new JButton("C.Real");
		botonciudadreal.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonciudadreal.setBounds(350, 294, 83, 43);
		botonciudadreal.setIconTextGap(0);
		botonciudadreal.setBorderPainted(false);
		botonciudadreal.setBorder(null);
		botonciudadreal.setFocusPainted(false);
		botonciudadreal.setContentAreaFilled(false);
		panelmapa.add(botonciudadreal);

		botonmadrid = new JButton("Madrid");
		botonmadrid.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonmadrid.setBounds(350, 203, 89, 43);
		botonmadrid.setIconTextGap(0);
		botonmadrid.setBorderPainted(false);
		botonmadrid.setBorder(null);
		botonmadrid.setFocusPainted(false);
		botonmadrid.setContentAreaFilled(false);
		panelmapa.add(botonmadrid);

		botonmurcia = new JButton("Murcia");
		botonmurcia.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonmurcia.setBounds(466, 365, 83, 43);
		botonmurcia.setIconTextGap(0);
		botonmurcia.setBorderPainted(false);
		botonmurcia.setBorder(null);
		botonmurcia.setFocusPainted(false);
		botonmurcia.setContentAreaFilled(false);
		panelmapa.add(botonmurcia);

		botonbadajoz = new JButton("Badajoz");
		botonbadajoz.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonbadajoz.setBounds(194, 302, 83, 43);
		botonbadajoz.setIconTextGap(0);
		botonbadajoz.setBorderPainted(false);
		botonbadajoz.setBorder(null);
		botonbadajoz.setFocusPainted(false);
		botonbadajoz.setContentAreaFilled(false);
		panelmapa.add(botonbadajoz);

		botonbarcelona = new JButton("Barcelona");
		botonbarcelona.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonbarcelona.setBounds(643, 132, 83, 43);
		botonbarcelona.setIconTextGap(0);
		botonbarcelona.setBorderPainted(false);
		botonbarcelona.setBorder(null);
		botonbarcelona.setFocusPainted(false);
		botonbarcelona.setContentAreaFilled(false);
		panelmapa.add(botonbarcelona);

		botonbilbao = new JButton("Bilbao");
		botonbilbao.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonbilbao.setBounds(381, 10, 83, 43);
		botonbilbao.setIconTextGap(0);
		botonbilbao.setBorderPainted(false);
		botonbilbao.setBorder(null);
		botonbilbao.setFocusPainted(false);
		botonbilbao.setContentAreaFilled(false);
		panelmapa.add(botonbilbao);

		botonhuelva = new JButton("Huelva");
		botonhuelva.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonhuelva.setBounds(194, 403, 83, 43);
		botonhuelva.setIconTextGap(0);
		botonhuelva.setBorderPainted(false);
		botonhuelva.setBorder(null);
		botonhuelva.setFocusPainted(false);
		botonhuelva.setContentAreaFilled(false);
		panelmapa.add(botonhuelva);

		botonourense = new JButton("Ourense");
		botonourense.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		botonourense.setBounds(149, 75, 83, 43);
		botonourense.setIconTextGap(0);
		botonourense.setBorderPainted(false);
		botonourense.setBorder(null);
		botonourense.setFocusPainted(false);
		botonourense.setContentAreaFilled(false);
		panelmapa.add(botonourense);

		botonpalencia = new JButton("Palencia");
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
		
		iconoalbacete = new JLabel("");
		ImageIcon finalalbacete = new ImageIcon(ruta);
		iconoalbacete.setIcon(finalalbacete);
		iconoalbacete.setBounds(425, 304, 25, 25);
		panelmapa.add(iconoalbacete);
		
		iconociudadreal = new JLabel("");
		ImageIcon finalciudadreal = new ImageIcon(ruta);
		iconociudadreal.setIcon(finalciudadreal);
		iconociudadreal.setBounds(340, 304, 25, 25);
		panelmapa.add(iconociudadreal);
		
		iconomadrid = new JLabel("");
		ImageIcon finalmadrid = new ImageIcon(ruta);
		iconomadrid.setIcon(finalmadrid);
		iconomadrid.setBounds(341, 211, 25, 25);
		panelmapa.add(iconomadrid);

		iconomurcia = new JLabel("");
		ImageIcon finalmurcia = new ImageIcon(ruta);
		iconomurcia.setIcon(finalmurcia);
		iconomurcia.setBounds(456, 374, 25, 25);
		panelmapa.add(iconomurcia);
		
		iconobadajoz = new JLabel("");
		ImageIcon finalbadajoz = new ImageIcon(ruta);
		iconobadajoz.setIcon(finalbadajoz);
		iconobadajoz.setBounds(178, 312, 25, 25);
		panelmapa.add(iconobadajoz);
		
		iconobarcelona = new JLabel("");
		ImageIcon finalbarcelona = new ImageIcon(ruta);
		iconobarcelona.setIcon(finalbarcelona);
		iconobarcelona.setBounds(618, 142, 25, 25);
		panelmapa.add(iconobarcelona);
		
		iconobilbao = new JLabel("");
		ImageIcon finalbilbao = new ImageIcon(ruta);
		iconobilbao.setIcon(finalbilbao);
		iconobilbao.setBounds(371, 20, 25, 25);
		panelmapa.add(iconobilbao);
		
		iconohuelva = new JLabel("");
		ImageIcon finalhuelva = new ImageIcon(ruta);
		iconohuelva.setIcon(finalhuelva);
		iconohuelva.setBounds(180, 412, 25, 25);
		panelmapa.add(iconohuelva);
		
		iconoourense = new JLabel("");
		ImageIcon finalourense = new ImageIcon(ruta);
		iconoourense.setIcon(finalourense);
		iconoourense.setBounds(131, 83, 25, 25);
		panelmapa.add(iconoourense);
		
		iconopalencia = new JLabel("");
		ImageIcon finalpalencia = new ImageIcon(ruta);
		iconopalencia.setIcon(finalpalencia);
		iconopalencia.setBounds(324, 102, 25, 25);
		panelmapa.add(iconopalencia);

		JLabel fotomapa = new JLabel("");
		fotomapa.setIcon(new ImageIcon("C:\\Users\\rubel\\git\\repo_local_weather\\ProyectoWeather_GR\\imagenes\\mapa.jpg"));
		fotomapa.setBounds(0, 0, 787, 564);
		panelmapa.add(fotomapa);

		// Panel que muestra los datos del día
		paneldia = new JPanel();
		paneldia.setBackground(Color.WHITE);
		paneldia.setBounds(790, 0, 314, 322);
		contentPane.add(paneldia);
		paneldia.setLayout(null);

		JLabel lblMaxminC = new JLabel("Max/Min \u00BAC");
		lblMaxminC.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblMaxminC.setBounds(10, 241, 129, 40);
		paneldia.add(lblMaxminC);

		grados = new JLabel("10\u00BAC");
		grados.setFont(new Font("Bahnschrift", Font.PLAIN, 45));
		grados.setHorizontalAlignment(SwingConstants.CENTER);
		grados.setBounds(0, 175, 304, 55);
		paneldia.add(grados);

		nombre = new JLabel("Manzanares");
		nombre.setFont(new Font("Bahnschrift", Font.PLAIN, 35));
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setBounds(0, 11, 304, 40);
		paneldia.add(nombre);

		iconotiempo = new JLabel();
		iconotiempo.setHorizontalAlignment(SwingConstants.CENTER);

		ImageIcon a = new ImageIcon("imagenes/bad.png");
		iconotiempo.setIcon(a);
		iconotiempo.setBounds(0, 62, 304, 102);
		paneldia.add(iconotiempo);

		JLabel lblMaxminF = new JLabel("Max/Min \u00BAF");
		lblMaxminF.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblMaxminF.setBounds(10, 279, 129, 40);
		paneldia.add(lblMaxminF);

		gradosMm = new JLabel("20/14 \u00BAC");
		gradosMm.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		gradosMm.setHorizontalAlignment(SwingConstants.CENTER);
		gradosMm.setBounds(185, 241, 119, 40);
		paneldia.add(gradosMm);

		gradosF = new JLabel("52/46 \u00BAF");
		gradosF.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		gradosF.setHorizontalAlignment(SwingConstants.CENTER);
		gradosF.setBounds(185, 279, 119, 40);
		paneldia.add(gradosF);

		// Panel de las previsiones del tiempo
		panelprevisiones = new JPanel();
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
		lbldia2.setBounds(10, 106, 114, 40);
		panelprevisiones.add(lbldia2);
		
		lbldia3 = new JLabel("Mie.");
		lbldia3.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lbldia3.setBounds(10, 149, 138, 40);
		panelprevisiones.add(lbldia3);
		
		lbldia4 = new JLabel("Jue.");
		lbldia4.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lbldia4.setBounds(10, 193, 138, 40);
		panelprevisiones.add(lbldia4);
		
		tiempodia1 = new JLabel("Lluvia");
		tiempodia1.setHorizontalAlignment(SwingConstants.TRAILING);
		tiempodia1.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		tiempodia1.setBounds(10, 62, 286, 40);
		panelprevisiones.add(tiempodia1);
		
		tiempodia2 = new JLabel("Soleado");
		tiempodia2.setHorizontalAlignment(SwingConstants.TRAILING);
		tiempodia2.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		tiempodia2.setBounds(20, 106, 276, 40);
		panelprevisiones.add(tiempodia2);
		
		tiempodia3 = new JLabel("Nuboso");
		tiempodia3.setHorizontalAlignment(SwingConstants.TRAILING);
		tiempodia3.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		tiempodia3.setBounds(10, 147, 286, 40);
		panelprevisiones.add(tiempodia3);
		
		tiempodia4 = new JLabel("Cubierto");
		tiempodia4.setHorizontalAlignment(SwingConstants.TRAILING);
		tiempodia4.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		tiempodia4.setBounds(10, 193, 286, 40);
		panelprevisiones.add(tiempodia4);
		
		botondia1 = new JButton("");
		botondia1.setBounds(0, 61, 306, 36);
		botondia1.setIconTextGap(0);
		botondia1.setBorderPainted(false);
		botondia1.setBorder(null);
		botondia1.setFocusPainted(false);
		botondia1.setContentAreaFilled(false);
		panelprevisiones.add(botondia1);
		
		botondia2 = new JButton("");
		botondia2.setBounds(0, 103, 306, 36);
		botondia2.setIconTextGap(0);
		botondia2.setBorderPainted(false);
		botondia2.setBorder(null);
		botondia2.setFocusPainted(false);
		botondia2.setContentAreaFilled(false);
		panelprevisiones.add(botondia2);
		
		botondia3 = new JButton("");
		botondia3.setBounds(0, 145, 306, 36);
		botondia3.setIconTextGap(0);
		botondia3.setBorderPainted(false);
		botondia3.setBorder(null);
		botondia3.setFocusPainted(false);
		botondia3.setContentAreaFilled(false);
		panelprevisiones.add(botondia3);
		
		botondia4 = new JButton("");
		botondia4.setBounds(0, 188, 306, 36);
		botondia4.setIconTextGap(0);
		botondia4.setBorderPainted(false);
		botondia4.setBorder(null);
		botondia4.setFocusPainted(false);
		botondia4.setContentAreaFilled(false);
		panelprevisiones.add(botondia4);
		
	

	}
}
