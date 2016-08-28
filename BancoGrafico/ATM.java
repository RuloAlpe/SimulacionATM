import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATM extends JFrame implements ActionListener{
	
	IdentificarUsuario usuarios;
	IngresarSistema sistema;
	
	ATM(){
		
		super("Cajero ATM");
		setBounds(150,150,250,250);
		setVisible(true);
		setResizable(false);
		
		Container contenedor1 = getContentPane();
		contenedor1.setLayout(new GridLayout(2,1));
		
		usuarios = new IdentificarUsuario();
		sistema = new IngresarSistema(this);
		
		contenedor1.add(usuarios);
		contenedor1.add(sistema);
		
		paintComponents(getGraphics());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent evento){
		
		BaseDatos baseDatos1 = new BaseDatos();
		
		if(evento.getSource() == sistema.aceptar){
			
			int valorUsuario = usuarios.getUsuario();
			int valorContrasenia = usuarios.getContrasenia();
			
			int us = baseDatos1.UsuarioCorrecto(valorUsuario, valorContrasenia);
			
			if((us == 1) || (us == 2)){
				this.setVisible(false);
				VentanaSistema ventana2 = new VentanaSistema(us);
			}
			else{
				sistema.setError();
				usuarios.limpiarTexto1();
				usuarios.limpiarTexto2();
			}
		}
	}
	
	public static void main(String[] args){
		
		ATM ventana1 = new ATM();
	}
}