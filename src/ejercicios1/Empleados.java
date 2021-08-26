package ejercicios1;



public class Empleados implements Comparable<Empleados> {

	private String nombre;
	private String apellido;
	private int salario;
	private int edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public int compareTo(Empleados o) {
	// TODO Auto-generated method stub
	// 3 posibles retornos
	// 0
	// -1
	// 1
	if (this.salario < o.getSalario()) {
	return 1;
	} else if (this.salario == o.getSalario()) {
	return 0;
	} else {
	return -1;
	}
	}

	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", edad=" + edad
				+ "]";
	}

	



}



