import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaRetiro extends JFrame implements ActionListener{

	JLabel texto1, texto2;
	JButton veinte, cincuenta, cien, doscientos, quinientos, atras, salir;
	int retiroUS;
	
	VentanaRetiro(int us){
		
		super("Ventana de retiro");
		setBounds(200,200,200,250);
		setVisible(true);
		setResizable(false);
		
		Container contenedor4 = getContentPane();
		FlowLayout layoutRetiro = new FlowLayout();
		layoutRetiro.setVgap(10);
		layoutRetiro.setHgap(10);
		contenedor4.setLayout(layoutRetiro);
		
		retiroUS = us;
		
		texto1 = new JLabel("Cantidad que se desea retirar");
		texto2 = new JLabel("Cantidad que se desea retirar");
		veinte = new JButton("$20");
		cincuenta = new JButton("$50");
		cien = new JButton("$100");
		doscientos = new JButton("$200");
		quinientos = new JButton("$500");
		atras = new JButton("atras");
		salir = new JButton("salir");
		
		veinte.addActionListener(this);
		cincuenta.addActionListener(this);
		cien.addActionListener(this);
		doscientos.addActionListener(this);
		quinientos.addActionListener(this);
		atras.addActionListener(this);
		salir.addActionListener(this);
		
		veinte.setActionCommand("VEINTE");
		cincuenta.setActionCommand("CINCUENTA");
		cien.setActionCommand("CIEN");
		doscientos.setActionCommand("DOSCIENTOS");
		quinientos.setActionCommand("QUINIENTOS");
		atras.setActionCommand("AtrasRetiro");
		salir.setActionCommand("SalirRetiro");
		
		contenedor4.add(texto1);
		contenedor4.add(veinte);
		contenedor4.add(cincuenta);
		contenedor4.add(cien);
		contenedor4.add(doscientos);
		contenedor4.add(quinientos);
		contenedor4.add(texto2);
		contenedor4.add(atras);
		contenedor4.add(salir);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent evento4){
		
		if(evento4.getActionCommand() == "VEINTE")
			texto2.setText("Acaba de retirar 20 pesos");
		
		if(evento4.getActionCommand() == "CINCUENTA")
			texto2.setText("Acaba de retirar 50 pesos");
		
		if(evento4.getActionCommand() == "CIEN")
			texto2.setText("Acaba de retirar 100 pesos");
		
		if(evento4.getActionCommand() == "DOSCIENTOS")
			texto2.setText("Acaba de retirar 200 pesos");
		
		if(evento4.getActionCommand() == "QUINIENTOS")
			texto2.setText("Acaba de retirar 500 pesos");
		
		if(evento4.getActionCommand() == "AtrasRetiro"){
			this.setVisible(false);
			VentanaSistema ventana2 = new VentanaSistema(retiroUS);
		}
			
		if(evento4.getActionCommand() == "SalirRetiro")
			System.exit(0);
	}
}