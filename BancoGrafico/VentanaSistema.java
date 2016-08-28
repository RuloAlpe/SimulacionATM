import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaSistema extends JFrame implements ActionListener{

	JButton saldo, retiro, salir;
	JLabel etiqueta;
	int numUs;
	
	VentanaSistema(int numUS){
		
		super("Bienvenido");
		setBounds(200,200,300,300);
		setVisible(true);
		
		Container contenedor2 = getContentPane();
		FlowLayout layoutSistema = new FlowLayout();
		layoutSistema.setVgap(30);
		layoutSistema.setHgap(30);
		contenedor2.setLayout(layoutSistema);
		
		numUs = numUS;
		
		saldo = new JButton("Consulta de saldo");
		retiro = new JButton("Realizar retiro de efectivo");
		salir = new JButton("Salir del sistema");
		etiqueta = new JLabel("Que operacion desea realizar");
		
		saldo.addActionListener(this);
		retiro.addActionListener(this);
		salir.addActionListener(this);
		
		saldo.setActionCommand("SALDO");
		retiro.setActionCommand("RETIRO");
		salir.setActionCommand("SALIR");
		
		contenedor2.add(etiqueta);
		contenedor2.add(saldo);
		contenedor2.add(retiro);
		contenedor2.add(salir);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent evento2){
		
		if(evento2.getActionCommand() == "SALDO"){
			
			this.setVisible(false);
			VentanaSaldo ventanasaldo1 = new VentanaSaldo(numUs);
		}
		if(evento2.getActionCommand() == "RETIRO"){
			this.setVisible(false);
			VentanaRetiro retiro = new VentanaRetiro(numUs);
		}
		if(evento2.getActionCommand() == "SALIR")
			System.exit(0);
	}
}