package modificador.deber;

public class metodos {
	
	private String nombre; // set y get
	private String apellido; // set
	private int edad;   // set y get 
	
	private void caminar() {
		
	}
	
	private void correr() {
		
	}
	
	// netodos get y set 
	// siempre son publicos 
	
	// nombre
	public void setNombres(String nombre) {
		this.nombre=nombre;
		
	}
	public String getNombre() {
		return this.nombre;
		
	}
	
	
	// apellido 
     
	public void setApellido(String apellido) {
		this.apellido=apellido;
		
	}
	public String getApellido(){
		return this.apellido;
		
				
		
	}
	
	// edad
	public void setEdad(int edad) {
		this.edad=edad;
		
	}
	
	
	public int getEdad() {
		return this.edad;
		
	}
 
	
	
	
	
	
	
	
}
