import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaSaldo extends JFrame implements ActionListener{

	JLabel tuSaldo, disponible;
	JTextField texto1, texto2;
	JButton atras, salir;
	
	int us;
	
	VentanaSaldo(int numUS){
	
		super("Ventana de saldo");
		setBounds(200,200,200,200);
		setVisible(true);
		setResizable(false);
		
		Container contenedor3 = getContentPane();
		FlowLayout layoutSaldo = new FlowLayout();
		layoutSaldo.setVgap(10);
		layoutSaldo.setHgap(10);
		contenedor3.setLayout(layoutSaldo);
		
		us = numUS;
		BaseDatos base = new BaseDatos();
		
		tuSaldo = new JLabel("Tu saldo es de: ");
		
		texto1 = new JTextField(10);
		//texto1.setText(saldoUS1);//ponerle un valor determinado
		texto1.setEditable(false);//que no se pueda modificar el valor que tiene
		
		disponible = new JLabel("El saldo disponible es: ");
		
		texto2 = new JTextField(10);
		//texto2.setText(disponibleUS1);//ponerle un valor determinado
		texto2.setEditable(false);//que no se pueda modificar el valor que tiene
		
		//Mostrar diferentes saldo dependiendo del usuario
		if(numUS == 1){
			texto1.setText(base.saldoUsuario1());
			//texto2.setText();
		}
		else{
			texto1.setText(base.saldoUsuario2());
			//texto2.setText();
		}
		
		
		atras = new JButton("Atras");
		salir = new JButton("Salir");
		
		atras.addActionListener(this);
		salir.addActionListener(this);
		
		atras.setActionCommand("ATRAS");
		salir.setActionCommand("SALIR_VENTANA_SALDO");
		
		contenedor3.add(tuSaldo);
		contenedor3.add(texto1);
		contenedor3.add(disponible);
		contenedor3.add(texto2);
		contenedor3.add(atras);
		contenedor3.add(salir);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent evento3){
		
		if(evento3.getActionCommand() == "ATRAS"){
			
			this.setVisible(false);
			VentanaSistema ventana2 = new VentanaSistema(us);
		}
		if(evento3.getActionCommand() == "SALIR_VENTANA_SALDO")
			System.exit(0);
	}
}