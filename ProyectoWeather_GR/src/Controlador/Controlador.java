package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.Interfaz;

public class Controlador implements ActionListener{
	 Interfaz itf = new Interfaz();
	 
	 public Controlador(Vista.Interfaz frame) {
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
		
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
