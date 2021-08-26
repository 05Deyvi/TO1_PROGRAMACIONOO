package ejercicio.interfaces;

public class CajeroBancoPichincha implements CajeroInterfaz {

	@Override
	public void solicitarTarjeta(String numero) {
		// TODO Auto-generated method stub
		System.out.println("ingrese su numero de tarjeta: " + numero);
		System.out.println("ingreso de nuemro de tarjeta correcto");
		
	}
	

	@Override
	public void solicitarClave(String clave) {
		// TODO Auto-generated method stub
		System.out.println("ingrese la clave de tu tarjeta: " + clave);
	}

	@Override
	public void solicitarTipoTransaccion() {
		// TODO Auto-generated method stub
	System.out.println("ingrese el tipo de de transaccion ");
	}

	@Override
	public void solicitarMonto(int monto) {
		// TODO Auto-generated method stub
		System.out.println("ingrese el monto que desea retirar: "  + monto);
		
	}

	@Override
	public void validarElSaldo() {
		// TODO Auto-generated method stub
		
		System.out.println("su saldo - el saldo retirado");
		
	}

	@Override
	public void entregarDinero() {
		// TODO Auto-generated method stub
		System.out.println("el dinero que usted solicito es");
		
		
	}

	@Override
	public void realizarLaTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("transaccion exitosa");
	}

	@Override
	public void entregarrecibo() {
		// TODO Auto-generated method stub
		System.out.println("su recibo es ");
		System.out.println("gracias por preferirnos");
	}

}
