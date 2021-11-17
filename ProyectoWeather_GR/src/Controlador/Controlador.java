package Controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.json.simple.parser.ParseException;

import Modelo.ConexionMasivaURL;
import Modelo.Forecast;
import Vista.Interfaz;

public class Controlador implements ActionListener {
	Interfaz itf = new Interfaz();
	ConexionMasivaURL cmurl = new ConexionMasivaURL();

	public Controlador(Interfaz frame) {
		this.itf = frame;
		this.itf.botonalbacete.addActionListener(this);
		this.itf.botonciudadreal.addActionListener(this);
		this.itf.botonmadrid.addActionListener(this);
		this.itf.botonmurcia.addActionListener(this);
		this.itf.botonbadajoz.addActionListener(this);
		this.itf.botonbarcelona.addActionListener(this);
		this.itf.botonbilbao.addActionListener(this);
		this.itf.botonhuelva.addActionListener(this);
		this.itf.botonourense.addActionListener(this);
		this.itf.botonpalencia.addActionListener(this);
		this.itf.botondia1.addActionListener(this);
		this.itf.botondia2.addActionListener(this);
		this.itf.botondia3.addActionListener(this);
		this.itf.botondia4.addActionListener(this);

	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		String acciones[] = {"Albacete","C.Real","Madrid","Badajoz","Barcelona","Bilbao","Huelva","Ourense","Palencia"};
		String historial= e.getActionCommand();
		
		// Conseguir datos de la clase ConexionMasivaURL
		String[] nombresC = cmurl.devolverNombresCiudades();
		ArrayList<Forecast> datosCiudades = null;
		try {
			datosCiudades = cmurl.fileToObject(nombresC);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (e.getSource() == itf.botonalbacete  ) {
			datospaneldia(0, 0, datosCiudades, nombresC);
			datospanelmapa(0, datosCiudades);
			datospanelprevisiones(0, datosCiudades);
			fechadias(datosCiudades);
			
		} else if (e.getSource() == itf.botonciudadreal) {
			datospaneldia(1, 0, datosCiudades, nombresC);
			datospanelprevisiones(1, datosCiudades);
		} else if (e.getSource() == itf.botonmadrid) {
			datospaneldia(2, 0, datosCiudades, nombresC);
			datospanelprevisiones(2, datosCiudades);
		} else if (e.getSource() == itf.botonmurcia) {
			datospaneldia(3, 0, datosCiudades, nombresC);
			datospanelprevisiones(3, datosCiudades);
		} else if (e.getSource() == itf.botonbadajoz) {
			datospaneldia(4, 0, datosCiudades, nombresC);
			datospanelprevisiones(4, datosCiudades);
		} else if (e.getSource() == itf.botonbarcelona) {
			datospaneldia(5, 0, datosCiudades, nombresC);
			datospanelprevisiones(5, datosCiudades);
			;
		} else if (e.getSource() == itf.botonbilbao) {
			datospaneldia(6, 0, datosCiudades, nombresC);
			datospanelprevisiones(6, datosCiudades);
		} else if (e.getSource() == itf.botonhuelva) {
			datospaneldia(7, 0, datosCiudades, nombresC);
			datospanelprevisiones(7, datosCiudades);
		} else if (e.getSource() == itf.botonourense) {
			datospaneldia(8, 0, datosCiudades, nombresC);
			datospanelprevisiones(8, datosCiudades);
		} else if (e.getSource() == itf.botonpalencia) {
			datospaneldia(9, 0, datosCiudades, nombresC);
			datospanelprevisiones(9, datosCiudades);
			
		}else if (e.getSource() == itf.botondia1) {
		
		}else if (e.getSource() == itf.botondia2) {
	
		}else if (e.getSource() == itf.botondia3) {
			datospaneldia(9, 2, datosCiudades, nombresC);
			datospanelprevisiones(9, datosCiudades);
			
		}else if (e.getSource() == itf.botondia4) {
			datospaneldia(9, 3, datosCiudades, nombresC);
			datospanelprevisiones(9, datosCiudades);
		}
		System.out.println(historial);
	}

	

	public void datospaneldia(int posicion, int dia, ArrayList<Forecast> datosCiudades, String[] nombresC) {

		// Nombre
		itf.nombre.setText(nombresC[posicion]);

		// Grados
		int temperatura = (Integer
				.parseInt(datosCiudades.get(posicion).getForecastDay().get(dia).getMaxTemp())
				+ Integer.parseInt( datosCiudades.get(posicion).getForecastDay().get(dia).getMinTemp()))
				/ 2;
		itf.grados.setText(temperatura + "ºC");

		// Maxima y minima ºC
		itf.gradosMm.setText( datosCiudades.get(posicion).getForecastDay().get(dia).getMaxTemp() + "/"
				+datosCiudades.get(posicion).getForecastDay().get(dia).getMinTemp() + " ºC");

		// Maxima y minima ºF
		itf.gradosF.setText(datosCiudades.get(posicion).getForecastDay().get(dia).getMaxTempF() + "/"
				+datosCiudades.get(posicion).getForecastDay().get(dia).getMinTempF() + " ºF");

		// Foto tiempo
		itf.iconotiempo.setIcon(escalarfoto(posicion, dia, datosCiudades, 100, 100));
	}

	public void datospanelmapa (int dia, ArrayList<Forecast> datosCiudades) {
		itf.iconoalbacete.setIcon(escalarfoto(0, dia, datosCiudades, 25, 25));
		itf.iconociudadreal.setIcon(escalarfoto(1, dia, datosCiudades, 25, 25));
		itf.iconomadrid.setIcon(escalarfoto(2, dia, datosCiudades, 25, 25));
		itf.iconomurcia.setIcon(escalarfoto(3, dia, datosCiudades, 25, 25));
		itf.iconobadajoz.setIcon(escalarfoto(4, dia, datosCiudades, 25, 25));
		itf.iconobarcelona.setIcon(escalarfoto(5, dia, datosCiudades, 25, 25));
		itf.iconobilbao.setIcon(escalarfoto(6, dia, datosCiudades, 25, 25));
		itf.iconohuelva.setIcon(escalarfoto(7, dia, datosCiudades, 25, 25));
		itf.iconoourense.setIcon(escalarfoto(8, dia, datosCiudades, 25, 25));
		itf.iconopalencia.setIcon(escalarfoto(9, dia, datosCiudades, 25, 25));

	}

	public void fechadias(ArrayList<Forecast> datosCiudades) {
		String fecha = datosCiudades.get(0).getForecastDay().get(0).getForecastDate();
		String diasemana[] = { "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom" };
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
		try {
			d = sdf.parse(fecha);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sdf.applyPattern("EEE");
		String fechafinal = sdf.format(d);
		System.out.println(fechafinal);
		for (int i = 0; i < diasemana.length; i++) {
			if (diasemana[i].equalsIgnoreCase(fechafinal)) {
				itf.lbldia3.setText(diasemana[i + 2]+".");
				itf.lbldia4.setText(diasemana[i + 3]+".");
			}
		}
	}

	public void datospanelprevisiones(int posicion, ArrayList<Forecast> datosCiudades) {
		itf.tiempodia1.setText(datosCiudades.get(posicion).getForecastDay().get(0).getWeather());
		itf.tiempodia2.setText(datosCiudades.get(posicion).getForecastDay().get(1).getWeather());
		itf.tiempodia3.setText(datosCiudades.get(posicion).getForecastDay().get(2).getWeather());
		itf.tiempodia4.setText(datosCiudades.get(posicion).getForecastDay().get(3).getWeather());
	}

	public String seleccionarfotos(int posicion, int dia, ArrayList<Forecast> datosCiudades) {
		// Icono paneldia
		int idt = Integer.parseInt(datosCiudades.get(posicion).getForecastDay().get(dia).getWeatherIcon());
		String ruta;

		// Filtrado de icono
		if (idt > 900 && idt <= 1401) {
			ruta = "imagenes/lluviafoto.png";

		} else if (idt > 1500 && idt <= 1599) {
			ruta = "imagenes/chubascosfoto.png";

		} else if (idt > 2100 && idt < 2303) {
			ruta = "imagenes/nubladofoto.png";

		} else if (idt > 2400 && idt < 2405) {
			ruta = "imagenes/soleadofoto.png";

		} else {
			ruta = "imagenes/muynubladofoto.png";
		}
		return ruta;
	}

	public ImageIcon escalarfoto(int posicion, int dia, ArrayList<Forecast> datosCiudades, int x, int y) {
		ImageIcon row = new ImageIcon(seleccionarfotos(posicion, dia, datosCiudades));
		Image get = row.getImage();
		Image scaled = get.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
		ImageIcon finale = new ImageIcon(scaled);
		return finale;

	}

}
