package pueba.bus;

public class PasajeroEconomico extends Pasajero{
	
	private String codigoDescuento;
	
	// Metodos SET Y GET 

	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
		
		
	}

	@Override
	public String toString() {
		return "PasajeroEconomico" + this.nombre + " [codigoDescuento=" + codigoDescuento + "]";
	}
	

}
