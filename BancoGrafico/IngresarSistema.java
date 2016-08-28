import javax.swing.*;
import java.awt.*;

public class IngresarSistema extends JPanel{

	JButton aceptar;
	JLabel ingresar;
	
	IngresarSistema(ATM oyente){
	
		FlowLayout layout2 = new FlowLayout(); 
		layout2.setAlignment(FlowLayout.CENTER);
		layout2.setVgap(20);
		setLayout(layout2);
		
		ingresar = new JLabel("Ingresar al sitema de cajero ATM");
		aceptar = new JButton("Aceptar");
		
		aceptar.addActionListener(oyente);
		
		add(ingresar);
		add(aceptar);
	}
	
	void setError(){
		
		String error = "El usuario o contrasenia son incorrectos";
		ingresar.setText(error);
	}
}