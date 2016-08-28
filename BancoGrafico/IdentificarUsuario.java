import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IdentificarUsuario extends JPanel{

	JLabel usuario, contrasenia;
	JTextField texto1, texto2;
	
	IdentificarUsuario(){
		
		FlowLayout layout1 = new FlowLayout(); 
		layout1.setVgap(30);
		setLayout(layout1);
		
		usuario = new JLabel("Usuario:");
		contrasenia = new JLabel("Password:");
		texto1 = new JTextField(15);
		texto2 = new JTextField(10);
		
		/*texto1.addActionCommand("USUARIO");
		texto2.addActionCommand("CONTRA");*/
		
		add(usuario);
		add(texto1);
		add(contrasenia);
		add(texto2);
	}
	
	int getUsuario(){
		
		return Integer.parseInt(texto1.getText());
	}
	
	int getContrasenia(){
		
		return Integer.parseInt(texto2.getText());
	}

	void limpiarTexto1(){
		
		texto1.setText(null);
	}

	void limpiarTexto2(){
		
		texto2.setText(null);
	}	
}