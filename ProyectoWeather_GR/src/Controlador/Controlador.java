package Controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import org.json.simple.parser.ParseException;

import Modelo.ConexionMasivaURL;
import Modelo.Forecast;
import Vista.Interfaz;

public class Controlador implements ActionListener{
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
		if (e.getSource() == itf.botonalbacete) {
			introducirdatos(0);
		}else if(e.getSource() == itf.botonalbacete) {
			introducirdatos(1);
		}
	}
	public void introducirdatos(int posicion) {
		
		//Conseguir datos de la clase ConexionMasivaURL
		String[] nombresC = cmurl.devolverNombresCiudades();
		ArrayList<Forecast> datosCiudades = null;
		try {
			datosCiudades = cmurl.fileToObject(nombresC);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		//Nombre paneldia
		itf.nombre.setText(nombresC[posicion]);
		int temperatura= (Integer.parseInt(datosCiudades.get(posicion).getForecastDay().get(0).getMaxTemp())+Integer.parseInt(datosCiudades.get(posicion).getForecastDay().get(0).getMinTemp()))/2;
		itf.grados.setText(temperatura+"ºC");
		itf.gradosMm.setText(datosCiudades.get(posicion).getForecastDay().get(0).getMaxTemp()+"/"+datosCiudades.get(posicion).getForecastDay().get(0).getMinTemp()+" ºC");
		itf.gradosF.setText(datosCiudades.get(posicion).getForecastDay().get(0).getMaxTemp()+"/"+datosCiudades.get(posicion).getForecastDay().get(0).getMinTemp()+" ºC");
		
		//Icono paneldia
		if (Integer.parseInt(datosCiudades.get(posicion).getForecastDay().get(0).getWeather())>2400 && Integer.parseInt(datosCiudades.get(posicion).getForecastDay().get(0).getWeather())<2405) {
			ImageIcon row_albacete = new ImageIcon("imagenes/soleadofoto.png");
			Image get_albacete = row_albacete .getImage();
			Image scaled_albacete = get_albacete .getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
			ImageIcon finalalbacete = new ImageIcon(scaled_albacete);
			itf.iconoalbacete.setIcon(finalalbacete);
			
		}
	}
}
