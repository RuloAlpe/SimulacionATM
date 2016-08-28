public class BaseDatos{

	private int numeroCuenta1 = 12345;
	private int numeroCuenta2 = 56789;
	private int nip1 = 54321;
	private int nip2 = 98765;
	
	String saldoUS1 = "1200";
	String disponibleUS1 = "1000";
	
	String saldoUS2 = "5000";
	String disponibleUS2 = "5000";
	
	private int verd = 0;

	int UsuarioCorrecto(int numCuenta, int numNip){
		
		if((numCuenta == numeroCuenta1) && (numNip == nip1))	
			verd = 1;
		
		if((numCuenta == numeroCuenta2) && (numNip == nip2))
			verd = 2;
		
		/*else
			verd = false;*/
		
		return verd;	
	}
	
	String saldoUsuario1(){
		
		return saldoUS1;
	}
	
	String saldoUsuario2(){
		
		return saldoUS2;
	}
}