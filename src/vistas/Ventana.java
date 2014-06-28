package vistas;

import controladores.ControladorVistaLogin;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame{
	private JPanel izquierdo,derecho,campos,botonera;
	private JButton btnAceptar,btnLimpiar,btnCancelar;
	private JLabel superior,lblnom,lblape,lblImage;
	private JTextField txtnom,txtape;
	  
	public Ventana(){
	    this.lblnom = new JLabel(new ImageIcon("E:\Daeron\Login\iconos"));
	    this.lblnom.setText("Nombre ");
	    this.lblape = new JLabel(new ImageIcon("E:\Daeron\Login\iconos"));
	    this.lblape.setText("Apellido ");
	    
	    this.txtnom = new JTextField(10);
	    this.txtape = new JTextField(10);
	    
	    this.campos = new JPanel();
	    this.campos.setBorder(new TitledBorder("Ingrese Nombre Y Apellido"));
	    this.campos.add(this.lblnom);
	    this.campos.add(this.txtnom);
	    this.campos.add(this.lblape);
	    this.campos.add(this.txtape);
	    this.campos.setBackground(Color.decode("#C4C6C1"));
	    
	    this.btnAceptar = new JButton("Ingresar", new ImageIcon("iconos/ingresar.png"));
	    this.btnAceptar.setToolTipText("Ingresar Al Sistema");
	    this.btnAceptar.setMnemonic('I');
		
	    this.btnLimpiar = new JButton("Limpiar",new ImageIcon("iconos/vaciar.png"));
	    this.btnLimpiar.setToolTipText("Limpiar Campos");
	    this.btnLimpiar.setMnemonic('L');
		
	    this.btnCancelar = new JButton("Salir ", new ImageIcon("iconos/salir2.png"));
	    this.btnCancelar.setToolTipText("Salir Del Sistema");
	    this.btnCancelar.setMnemonic('S');
		
	    this.botonera = new JPanel(new GridLayout(1, 3, 15, 15));
	    this.botonera.add(this.btnAceptar);
	    this.botonera.add(this.btnLimpiar);
	    this.botonera.add(this.btnCancelar);
	    this.botonera.setBackground(Color.decode("#C4C6C1"));
	    
	    this.izquierdo = new JPanel(new BorderLayout(15, 15));
	    this.izquierdo.add(this.campos, "Center");
	    this.izquierdo.add(this.botonera, "South");
	    this.izquierdo.setBackground(Color.decode("#C4C6C1"));
	    
	    this.superior = new JLabel(new ImageIcon("iconos/superior.png"));
	    
	    ControladorVistaLogin eco = new ControladorVistaLogin(this);
	    this.btnAceptar.addActionListener(eco);
	    this.btnCancelar.addActionListener(eco);
	    this.btnLimpiar.addActionListener(eco);
	
	    this.derecho = new JPanel();
	    this.lblImage = new JLabel(new ImageIcon("iconos/personal.png"));
	    this.derecho.add(this.lblImage);
	    this.derecho.setBackground(Color.decode("#C4C6C1"));
	    
	    this.setLayout(new BorderLayout());
	    this.add(this.izquierdo, "West");
	    this.add(this.superior, "North");
	    this.add(this.derecho, "East");
		    
	    this.setSize(575,320);
	    this.setTitle("Bienvenidos Al Sistema");
	    this.setIconImage(Toolkit.getDefaultToolkit().getImage("iconos/library.png"));//icono principal
		this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setUndecorated(false);
	    this.setAlwaysOnTop(true);
	    this.setResizable(false); // maximizar o minimizar la ventana falso o verdadero // false / true
	    this.setVisible(true);
	    
	  }
  
	  public JButton getBtnAceptar(){
	    return this.btnAceptar;
	  }
	  
	  public void setBtnAceptar(JButton btnAceptar){
	    this.btnAceptar = btnAceptar;
	  }
	  
	  public JButton getBtnLimpiar(){
	    return this.btnLimpiar;
	  }
	  
	  public void setBtnLimpiar(JButton btnLimpiar){
	    this.btnLimpiar = btnLimpiar;
	  }
	  
	  public JButton getBtnCancelar(){
	    return this.btnCancelar;
	  }
	  
	  public void setBtnCancelar(JButton btnCancelar){
	    this.btnCancelar = btnCancelar;
	  }
	  
	 
	  
	  public JTextField getTxtnom() {
		return txtnom;
	}

	public void setTxtnom(JTextField txtnom) {
		this.txtnom = txtnom;
	}

	public JTextField getTxtape() {
		return txtape;
	}

	public void setTxtape(JTextField txtape) {
		this.txtape = txtape;
	}

	public static void main(String[] args){
	    new Ventana();
	  }
}
