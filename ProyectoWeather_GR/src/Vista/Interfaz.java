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
	
	public JLabel tiempodia2;
	public JLabel tiempodia3;
	public JLabel tiempodia4;
	
	public JLabel iconodia2;
	public JLabel iconodia3;
	public JLabel iconodia4;
	
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
		
		JPanel panel = new JPanel();
		panel.setBounds(-86, 0, 1182, 571);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(88, 0, 1094, 567);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Guillermo\\git\\GuillermoRubenREPO_WEATHER\\ProyectoWeather_GR\\imagenes\\cielo.jpg"));
		panel.add(lblNewLabel);
		
		//Panel mapa
		panelmapa = new JPanel();
		panelmapa.setBounds(0, 0, 791, 571);
		contentPane.add(panelmapa);
		panelmapa.setLayout(null);

		// Botones mapa
		botonalbacete = new JButton("Albacete");
		botonalbacete.setForeground(new Color(0, 0, 0));
		botonalbacete.setToolTipText("");
		botonalbacete.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		botonalbacete.setBounds(470, 294, 83, 43);
		botonalbacete.setIconTextGap(0);
		botonalbacete.setBorderPainted(false);
		botonalbacete.setBorder(null);
		botonalbacete.setFocusPainted(false);
		botonalbacete.setContentAreaFilled(false);
		panelmapa.add(botonalbacete);

		botonciudadreal = new JButton("C.Real");
		botonciudadreal.setForeground(new Color(0, 0, 0));
		botonciudadreal.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		botonciudadreal.setBounds(342, 294, 83, 43);
		botonciudadreal.setIconTextGap(0);
		botonciudadreal.setBorderPainted(false);
		botonciudadreal.setBorder(null);
		botonciudadreal.setFocusPainted(false);
		botonciudadreal.setContentAreaFilled(false);
		panelmapa.add(botonciudadreal);

		botonmadrid = new JButton("Madrid");
		botonmadrid.setForeground(new Color(0, 0, 0));
		botonmadrid.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		botonmadrid.setBounds(350, 203, 89, 43);
		botonmadrid.setIconTextGap(0);
		botonmadrid.setBorderPainted(false);
		botonmadrid.setBorder(null);
		botonmadrid.setFocusPainted(false);
		botonmadrid.setContentAreaFilled(false);
		panelmapa.add(botonmadrid);

		botonmurcia = new JButton("Murcia");
		botonmurcia.setForeground(new Color(0, 0, 0));
		botonmurcia.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		botonmurcia.setBounds(460, 359, 83, 43);
		botonmurcia.setIconTextGap(0);
		botonmurcia.setBorderPainted(false);
		botonmurcia.setBorder(null);
		botonmurcia.setFocusPainted(false);
		botonmurcia.setContentAreaFilled(false);
		panelmapa.add(botonmurcia);

		botonbadajoz = new JButton("Badajoz");
		botonbadajoz.setForeground(new Color(0, 0, 0));
		botonbadajoz.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		botonbadajoz.setBounds(171, 294, 97, 43);
		botonbadajoz.setIconTextGap(0);
		botonbadajoz.setBorderPainted(false);
		botonbadajoz.setBorder(null);
		botonbadajoz.setFocusPainted(false);
		botonbadajoz.setContentAreaFilled(false);
		panelmapa.add(botonbadajoz);

		botonbarcelona = new JButton("Barcelona");
		botonbarcelona.setForeground(new Color(0, 0, 0));
		botonbarcelona.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		botonbarcelona.setBounds(643, 132, 101, 43);
		botonbarcelona.setIconTextGap(0);
		botonbarcelona.setBorderPainted(false);
		botonbarcelona.setBorder(null);
		botonbarcelona.setFocusPainted(false);
		botonbarcelona.setContentAreaFilled(false);
		panelmapa.add(botonbarcelona);

		botonbilbao = new JButton("Bilbao");
		botonbilbao.setForeground(new Color(0, 0, 0));
		botonbilbao.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		botonbilbao.setBounds(381, 12, 101, 43);
		botonbilbao.setIconTextGap(0);
		botonbilbao.setBorderPainted(false);
		botonbilbao.setBorder(null);
		botonbilbao.setFocusPainted(false);
		botonbilbao.setContentAreaFilled(false);
		panelmapa.add(botonbilbao);

		botonhuelva = new JButton("Huelva");
		botonhuelva.setForeground(new Color(0, 0, 0));
		botonhuelva.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		botonhuelva.setBounds(194, 403, 89, 43);
		botonhuelva.setIconTextGap(0);
		botonhuelva.setBorderPainted(false);
		botonhuelva.setBorder(null);
		botonhuelva.setFocusPainted(false);
		botonhuelva.setContentAreaFilled(false);
		panelmapa.add(botonhuelva);

		botonourense = new JButton("Ourense");
		botonourense.setForeground(new Color(0, 0, 0));
		botonourense.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		botonourense.setBounds(149, 75, 105, 43);
		botonourense.setIconTextGap(0);
		botonourense.setBorderPainted(false);
		botonourense.setBorder(null);
		botonourense.setFocusPainted(false);
		botonourense.setContentAreaFilled(false);
		panelmapa.add(botonourense);

		botonpalencia = new JButton("Palencia");
		botonpalencia.setForeground(new Color(0, 0, 0));
		botonpalencia.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		botonpalencia.setBounds(342, 92, 97, 43);
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
		iconoalbacete.setBounds(424, 294, 40, 40);
		panelmapa.add(iconoalbacete);
		
		iconociudadreal = new JLabel("");
		iconociudadreal.setFont(new Font("Tahoma", Font.BOLD, 10));
		ImageIcon finalciudadreal = new ImageIcon(ruta);
		iconociudadreal.setIcon(finalciudadreal);
		iconociudadreal.setBounds(311, 293, 40, 40);
		panelmapa.add(iconociudadreal);
		
		iconomadrid = new JLabel("");
		ImageIcon finalmadrid = new ImageIcon(ruta);
		iconomadrid.setIcon(finalmadrid);
		iconomadrid.setBounds(317, 203,40, 40);
		panelmapa.add(iconomadrid);

		iconomurcia = new JLabel("");
		ImageIcon finalmurcia = new ImageIcon(ruta);
		iconomurcia.setIcon(finalmurcia);
		iconomurcia.setBounds(424, 359,40, 40);
		panelmapa.add(iconomurcia);
		
		iconobadajoz = new JLabel("");
		ImageIcon finalbadajoz = new ImageIcon(ruta);
		iconobadajoz.setIcon(finalbadajoz);
		iconobadajoz.setBounds(138, 294, 40, 40);
		panelmapa.add(iconobadajoz);
		
		iconobarcelona = new JLabel("");
		ImageIcon finalbarcelona = new ImageIcon(ruta);
		iconobarcelona.setIcon(finalbarcelona);
		iconobarcelona.setBounds(600, 132, 40, 40);
		panelmapa.add(iconobarcelona);
		
		iconobilbao = new JLabel("");
		ImageIcon finalbilbao = new ImageIcon(ruta);
		iconobilbao.setIcon(finalbilbao);
		iconobilbao.setBounds(355, 12, 40, 40);
		panelmapa.add(iconobilbao);
		
		iconohuelva = new JLabel("");
		ImageIcon finalhuelva = new ImageIcon(ruta);
		iconohuelva.setIcon(finalhuelva);
		iconohuelva.setBounds(160, 403, 40, 40);
		panelmapa.add(iconohuelva);
		
		iconoourense = new JLabel("");
		ImageIcon finalourense = new ImageIcon(ruta);
		iconoourense.setIcon(finalourense);
		iconoourense.setBounds(115, 75, 40, 40);
		panelmapa.add(iconoourense);
		
		iconopalencia = new JLabel("");
		ImageIcon finalpalencia = new ImageIcon(ruta);
		iconopalencia.setIcon(finalpalencia);
		iconopalencia.setBounds(304, 92, 40, 40);
		panelmapa.add(iconopalencia);

		JLabel fotomapa = new JLabel("");
		fotomapa.setIcon(new ImageIcon("imagenes\\mapa.jpg"));
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

		grados = new JLabel("--\u00BAC");
		grados.setFont(new Font("Bahnschrift", Font.PLAIN, 45));
		grados.setHorizontalAlignment(SwingConstants.CENTER);
		grados.setBounds(0, 175, 304, 55);
		paneldia.add(grados);

		nombre = new JLabel("Ciudad");
		nombre.setToolTipText("1");
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

		gradosMm = new JLabel("-- \u00BAC");
		gradosMm.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		gradosMm.setHorizontalAlignment(SwingConstants.CENTER);
		gradosMm.setBounds(185, 241, 119, 40);
		paneldia.add(gradosMm);

		gradosF = new JLabel("-- \u00BAF");
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

		JLabel lblprevision = new JLabel("Prevision para 3 d\u00EDas");
		lblprevision.setToolTipText("");
		lblprevision.setBackground(new Color(30, 144, 255));
		lblprevision.setBounds(0, 10, 296, 30);
		panelprevisiones.add(lblprevision);
		lblprevision.setHorizontalAlignment(SwingConstants.CENTER);
		lblprevision.setFont(new Font("Bahnschrift", Font.PLAIN, 29));
		
		JLabel lbldia2 = new JLabel("Ma\u00F1ana");
		lbldia2.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lbldia2.setBounds(10, 60, 114, 40);
		panelprevisiones.add(lbldia2);
		
		lbldia3 = new JLabel("Mie.");
		lbldia3.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lbldia3.setBounds(10, 120, 128, 40);
		panelprevisiones.add(lbldia3);
		
		lbldia4 = new JLabel("Jue.");
		lbldia4.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lbldia4.setBounds(10, 180, 138, 40);
		panelprevisiones.add(lbldia4);
		
		tiempodia2 = new JLabel("--\u00BAC");
		tiempodia2.setHorizontalAlignment(SwingConstants.TRAILING);
		tiempodia2.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		tiempodia2.setBounds(195, 60, 100, 40);
		panelprevisiones.add(tiempodia2);
		
		tiempodia3 = new JLabel("--\u00BAC");
		tiempodia3.setHorizontalAlignment(SwingConstants.TRAILING);
		tiempodia3.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		tiempodia3.setBounds(196, 120, 100, 40);
		panelprevisiones.add(tiempodia3);
		
		tiempodia4 = new JLabel("--\u00BAC");
		tiempodia4.setHorizontalAlignment(SwingConstants.TRAILING);
		tiempodia4.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		tiempodia4.setBounds(196, 180, 100, 40);
		panelprevisiones.add(tiempodia4);
		
		botondia2 = new JButton("");
		botondia2.setBounds(0, 60, 306, 36);
		botondia2.setIconTextGap(0);
		botondia2.setBorderPainted(false);
		botondia2.setBorder(null);
		botondia2.setFocusPainted(false);
		botondia2.setContentAreaFilled(false);
		panelprevisiones.add(botondia2);
		
		botondia3 = new JButton("");
		botondia3.setBounds(0, 120, 306, 36);
		botondia3.setIconTextGap(0);
		botondia3.setBorderPainted(false);
		botondia3.setBorder(null);
		botondia3.setFocusPainted(false);
		botondia3.setContentAreaFilled(false);
		panelprevisiones.add(botondia3);
		
		botondia4 = new JButton("");
		botondia4.setBounds(0, 180, 306, 36);
		botondia4.setIconTextGap(0);
		botondia4.setBorderPainted(false);
		botondia4.setBorder(null);
		botondia4.setFocusPainted(false);
		botondia4.setContentAreaFilled(false);
		panelprevisiones.add(botondia4);
		
		iconodia2 = new JLabel("");
		iconodia2.setBounds(134, 60,32, 32);
		ImageIcon iconodia2img= new ImageIcon(ruta);
		iconodia2.setIcon(iconodia2img);
		panelprevisiones.add(iconodia2);
		
		iconodia3 = new JLabel("");
		iconodia3.setBounds(134, 120, 32, 32);
		ImageIcon iconodia3img = new ImageIcon(ruta);
		iconodia3.setIcon(iconodia3img);
		panelprevisiones.add(iconodia3);
		
		iconodia4 = new JLabel("");
		iconodia4.setBounds(134, 180, 32, 32);
		ImageIcon iconodia4img = new ImageIcon(ruta);
		iconodia4.setIcon(iconodia4img);
		panelprevisiones.add(iconodia4);
		
	

	}
}

