package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import vistas.Ventana;

public class ControladorVistaLogin implements ActionListener {
	private Ventana vista;
	public ControladorVistaLogin(Ventana xvista){
		this.vista = xvista;
	}

	@Override
	public void actionPerformed(ActionEvent accion) {
		if(accion.getSource().equals(this.vista.getBtnCancelar())){
			int op = JOptionPane.showConfirmDialog(this.vista, "Desea Salir del sistema", "Mensaje de Sistema", 0);
		    if (op == 0){
		        JOptionPane.showMessageDialog(this.vista, "Hasta Pronto", "Mensaje de Sistema", 1);
		        System.exit(0);
		    }
		}else if(accion.getSource().equals(this.vista.getBtnLimpiar())){
			this.vista.getTxtnom().setText(null);
			this.vista.getTxtape().setText(null);
			this.vista.getTxtnom().requestFocus();
		}else if (accion.getSource().equals(this.vista.getBtnAceptar())){
			 JOptionPane.showMessageDialog(this.vista, "Bienvenido "+this.vista.getTxtnom().getText()+" "+this.vista.getTxtape().getText(), "Bienvenido "+this.vista.getTxtnom().getText()+" "+this.vista.getTxtnom().getText(), 1);
		}
	}
}